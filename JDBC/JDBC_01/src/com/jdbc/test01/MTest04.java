package com.jdbc.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest04 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;

		try {
			// * JDBC 5단계
			// * 1. Driver 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// * 2. 계정 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "BM";
			String pw = "test11";
			con = DriverManager.getConnection(url, user, pw);
			// * 3. Query 준비
			stmt = con.createStatement();
			String sql = "delete from tb_member where m_id = 'madhandz5'";
			// * 4. 실행 및 Return
			int res = stmt.executeUpdate(sql);
			if (res > 0) {
				System.out.println("삭제 성공");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} // * 5. DB종료
		finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
