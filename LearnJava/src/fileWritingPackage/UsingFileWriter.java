package fileWritingPackage;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="UsingFileWriter.txt";
		String content ="Learn Java Learn Well";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
	}

}
