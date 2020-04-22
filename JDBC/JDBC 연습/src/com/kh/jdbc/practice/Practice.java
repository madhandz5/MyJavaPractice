package com.kh.jdbc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {

		Item item = null;
		List<Item> itemList = new ArrayList<Item>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// * JDBC 5단계
			// * 1단계. 드라이버 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// * 2단계. 계정연결
			// - URL , 계정명, 비밀번호
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "TGIF";
			String passWord = "test11";

			con = DriverManager.getConnection(url, user, passWord);

			// * 3단계. 쿼리준비
			stmt = con.createStatement();
			String sql = "SELECT * FROM TB_STOCK";

			// * 4단계. 실행 및 리턴
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				item = new Item();
				item.setItem(rs.getString(1));
				item.setType(rs.getString(2));
				item.setPrice(rs.getInt(3));
				item.setStock(rs.getInt(4));

				itemList.add(item);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스 없대용..ㅠㅠ");
		} catch (SQLException e) {
			System.out.println("SQL EXCEPTION 났어용..ㅠㅠ");
		} finally {
			try {
				// * 5단계. DB종료
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i));
		}
	}
}
