package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import bm.model.serivce.MemberService;

public class BmLogFactory {

	Logger log = Logger.getLogger(MemberService.class);

	private static class BmLogHolder {
		private static final BmLogFactory bmInstance = new BmLogFactory();

	}

	public static BmLogFactory getInstance() {

		return BmLogHolder.bmInstance;
	}

	public Logger getLogger(Class className) {
		return Logger.getLogger(className);
	}

	private BmLogFactory() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("log4.properties");
			Properties logProperty = new Properties();
			logProperty.load(fis);
			PropertyConfigurator.configure(logProperty);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
