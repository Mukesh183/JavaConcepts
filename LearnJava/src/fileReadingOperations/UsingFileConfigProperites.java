package fileReadingOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsingFileConfigProperites {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);
		
		String Hello = properties.getProperty("Hello");
		String Everyone = properties.getProperty("Everyone");
		System.out.println("Sucess1");
		if (Hello.equalsIgnoreCase("HeLLO")) {
			System.out.println("Sucess");
			
		}else if (Everyone.equalsIgnoreCase("world")) {
			System.out.println("Failer");
		}
		
		System.out.println("Sucess1");
	}

}
