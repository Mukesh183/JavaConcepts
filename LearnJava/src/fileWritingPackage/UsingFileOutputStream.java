package fileWritingPackage;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingFileOutputStream.txt";
		String content = "Be Positive Everything Turns Positive Keep Hard Work";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		fileOutputStream.write(writeThis);
		fileOutputStream.close();
	}

}
