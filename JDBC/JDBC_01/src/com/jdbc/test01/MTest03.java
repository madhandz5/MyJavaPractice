package com.jdbc.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MTest03 {

	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstm = null;
		Scanner sc = new Scanner(System.in);

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

			System.out.println("비밀번호 변경할 아이디 : ");
			String id = sc.nextLine();
			System.out.println("변경할 비밀번호 : ");
			String newPw = sc.nextLine();
			String sql = "UPDATE TB_MEMBER SET M_PASSWORD =? where m_id = ?";
			// * 4. 실행 및 Return
			pstm = con.prepareStatement(sql);
			pstm.setString(1, newPw);
			pstm.setString(2, id);
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("변경성공");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// * 5. DB 종료
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
