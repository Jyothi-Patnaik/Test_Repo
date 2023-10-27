package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String getProperty(String key) throws IOException {
		Properties p = new Properties();
	     FileInputStream fis = new FileInputStream("./src/main/resources/data.properties");
	     p.load(fis);

	     // Read data from the properties file
	     //String email = properties.getProperty("email");
	     //String password = properties.getProperty("password");
		return p.getProperty(key);
	}

}
