package Charstreams;

import java.io.FileWriter;
import java.io.IOException;

public class Filewriterdemo {

	public static void main(String args[]) {

		String data = "Have a Happy Sunday";
		FileWriter output = null;
		try {
			// Creates a FileWriter
			output = new FileWriter("output2.txt");

			// Writes the string to the file
			output.write(data);

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}