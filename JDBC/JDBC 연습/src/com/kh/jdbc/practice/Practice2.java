package com.kh.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstm = null;
		Scanner sc = new Scanner(System.in);
		int res = 0;

		try {
			// * 1단계.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// * 2단계. 계정연결
			// - URL , 계정명, 비밀번호
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "TGIF";
			String passWord = "test11";
			con = DriverManager.getConnection(url, user, passWord);

			// 3단계 . 쿼리문 준비
			System.out.println("아이디 뭘로 하실? ");
			String userId = sc.nextLine();
			System.out.println("비밀번호 뭘로 하실? ");
			String userPwd = sc.nextLine();
			System.out.println("번호좀..");
			String phone = sc.nextLine();
			System.out.println("나이가?");
			int age = sc.nextInt();
			sc.nextLine();

			String sql = "INSERT INTO TB_MEMBER VALUES(M_NO.NEXTVAL, ?,?,?,?)";

			// 4. 쿼리실행 . 쿼리문실행

			pstm = con.prepareStatement(sql);
			pstm.setString(1, userId);
			pstm.setString(2, userPwd);
			pstm.setString(3, phone);
			pstm.setInt(4, age);

			// INSERT, UPDATE, DELETE ... 수정. excuteUpdate();
			res = pstm.executeUpdate();

			con.commit();

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

		System.out.println(res);
		if (res >= 1) {
			System.out.println("성공적으로 추가");
		} else {
			System.out.println("뭔가 이상한데..? 문제가 생겼어.. 어?");
		}

	}
}
