package com.jdbc.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Mtest05 {

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

			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 : ");
			String passWord = sc.nextLine();
			System.out.println("변경 등급 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println("변경 전화번호 : ");
			String tell = sc.nextLine();
			// 아이디로 사용자의 m_password,m_grade,m_tell을 바꾸는 쿼리 작성
			String sql = "UPDATE TB_MEMBER SET M_PASSWORD = ?" + ", M_GRADE =? " + ",M_TELL = ? WHERE M_ID =?";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, passWord);
			pstm.setInt(2, grade);
			pstm.setString(3, tell);
			pstm.setString(4, id);
			// * 4. 실행 및 Return
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("수정되었습니다.");
			}
			// * 5. DB 종료
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
