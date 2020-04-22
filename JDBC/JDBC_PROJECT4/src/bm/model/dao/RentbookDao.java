package bm.model.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bm.exception.BMException;
import common.JdbcTemplate;

public class RentbookDao {

	private JdbcTemplate jdt = JdbcTemplate.getInstance();

	public int updateExtendRentBook(Connection con, int rb_idx) throws BMException {
		int result = 0;
		PreparedStatement pstm = null;

		String sql = "Update tb_rent_book set rb_state = 1202, rb_return_date = rb_return_date + 7, rb_extention_cnt = rb_extention_cnt + 1 where rb_idx = "
				+ rb_idx;
		try {
			pstm = con.prepareStatement(sql);
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(pstm);
		}
		return result;
	}

	public void updateReturnRentBook(Connection con, int rb_idx) throws BMException {
		CallableStatement cstm = null;
		String sql = "{call P_UPDATE_STATE(?,1204)}";

		try {
			cstm = con.prepareCall(sql);
			cstm.setInt(1, rb_idx);
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(cstm);
		}

	}

	public int insertUpdateHistory(Connection con, int rb_idx) throws BMException {
		int result = 0;
		PreparedStatement pstm = null;
		String sql = "insert into tb_rent_history select S_RH_IDX.NEXTVAL, a.* from(select rm_idx, rb_idx, b_bno, rb_state, sysdate from tb_rent_book where rb_idx =?) a";
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, rb_idx);
			result = pstm.executeUpdate();
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(pstm);
		}

		return result;
	}

	public void insertRentInfo(Connection con, String b_bno) throws BMException {
		CallableStatement cstm = null;
		String sql = "{call INSERT_RENT_INFO(?)}";
		try {
			cstm = con.prepareCall(sql);
			cstm.setString(1, b_bno);
		} catch (SQLException e) {
			throw new BMException(e.getMessage());
		} finally {
			jdt.close(cstm);
		}
	}

}
