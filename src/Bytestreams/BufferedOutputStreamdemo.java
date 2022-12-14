package Bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamdemo {
	public static void main(String[] args) {

		String data = "This is a line of text inside the file";

		try {
			// Creates a FileOutputStream
			FileOutputStream file = new FileOutputStream("output.txt");

			// Creates a BufferedOutputStream
			BufferedOutputStream output = new BufferedOutputStream(file);
			// initializing array based on the number of bytes
			byte[] array = data.getBytes();

			// Writes data to the output stream
			output.write(array);
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}