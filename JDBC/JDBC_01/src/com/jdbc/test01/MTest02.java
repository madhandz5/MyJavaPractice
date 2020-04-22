package com.jdbc.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MTest02 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstm = null;
		Scanner sc = new Scanner(System.in);

		try {
			// * JDBC 5단계
			// * 1. Driver 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// * 2. 계정 연결
			String user = "BM";
			String passWord = "test11";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(url, user, passWord);
			// * 3. Query 준비
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.println("등급 코드 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println("전화번호 : ");
			String tel = sc.nextLine();

			String sql = "insert into tb_member values(?,?,?,?, SYSDATE)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.setString(2, pw);
			pstm.setInt(3, grade);
			pstm.setString(4, tel);

			// * 4. 실행 및 return
			// insert, update, delete 일때는 executeUpdate() 메서드 사용
			// 영향을 받은 행(로우) 의 수를 반환해준다.
			int res = pstm.executeUpdate();
			if (res > 0) {
				System.out.println("변경 성공");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			// * 5. DB종료
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
