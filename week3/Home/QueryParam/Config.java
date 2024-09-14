package week3.Home.QueryParam;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	private static Properties properties;
	
	static {
		properties = new Properties();
		try {
			properties.load(new FileInputStream(new File("src/main/resources/config.properties")));			
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Unable to find \"src/main/resources/config.properties\" file in mentioned loaction.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getUserName() {		
		return properties.getProperty("servicenow.username");
	}

	public static String getPassword() {
		return properties.getProperty("servicenow.password");
	}



}