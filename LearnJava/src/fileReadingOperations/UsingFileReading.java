package fileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="UsingBufferedWriter.txt";
		FileReader fileReader = new FileReader(location);
		BufferedReader reader = new BufferedReader(fileReader);
		//String testReadingOneLine = reader.readLine();
		//System.out.println(testReadingOneLine);
		String textReading;  
		while ((textReading =reader.readLine())!=null) {
			System.out.println(textReading);
		}
		reader.close();
	}

}
