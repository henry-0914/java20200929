package chap15.textbook.s150403;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Properties;
public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesExample.class
				.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "uft-8");
		//Map<String, String> map;
		
		//파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장하는 것이 목표
		
		properties.load(new FileReader(path));
		System.out.println(properties.size());
		//Object urlValue = properties.get("url");
		String urlValue = properties.getProperty("url");
		String driver = properties.getProperty("driver");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);
		System.out.println(urlValue);
	}
}