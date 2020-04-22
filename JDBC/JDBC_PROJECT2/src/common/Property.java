package common;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "BM";
		String password = "test11";

		Properties prop = new Properties();

		prop.setProperty("driver", driver);
		prop.setProperty("url", url);
		prop.setProperty("user", user);
		prop.setProperty("password", password);

		System.out.println(prop);
		try {
			prop.store(new FileOutputStream("db.properties"), "It's DB.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
