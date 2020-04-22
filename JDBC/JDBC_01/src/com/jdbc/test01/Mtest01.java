package com.jdbc.test01;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mtest01 {

	public static void main(String[] args) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// * JDBC 5단계
			// * 1. Driver 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// * 2. 계정 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "BM";
			String passWord = "test11";
			con = DriverManager.getConnection(url, user, passWord);
			// * 3. Query 준비
			stmt = con.createStatement();
			String sql = "select * from tb_member";
			// * 4. 실행 및 리턴
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				int grade = rs.getInt(3);
				String tel = rs.getString(4);
				Date rd = rs.getDate(5);

				System.out.println("ID: " + id);
				System.out.println("PW : " + pw);
				System.out.println("GRADE : " + grade);
				System.out.println("전화번호 : " + tel);
				System.out.println("날짜 : " + rd);

			}
			// * 5. DB 종료

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
