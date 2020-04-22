package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//Singleton 방식
public class JdbcTemplate {

	public static Connection getConnection() {

		Connection con = null;
		String user = "";
		String password = "";
		String url = "";
		String od = "";
		FileInputStream fis = null;
		try {
			Properties prop = new Properties();
			fis = new FileInputStream("db.properties");
			prop.load(fis);
			od = prop.getProperty("driver").trim();
			url = prop.getProperty("url").trim();
			user = prop.getProperty("user").trim();
			password = prop.getProperty("password").trim();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			// * 1. Driver 연결
			Class.forName(od);
			// * 2. 계정연결
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

	public static void close(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if (rs != null && stmt != null && con != null) {
				rs.close();
				stmt.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt, Connection con) {
		try {
			if (stmt != null && con != null) {
				stmt.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs, Statement stmt) {
		try {
			if (rs != null && stmt != null) {
				rs.close();
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(PreparedStatement pstm) {
		try {
			if (pstm != null) {
				pstm.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
