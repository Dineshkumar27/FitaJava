package Charstreams;

import java.io.FileWriter;

public class Filewriterdemo {

	public static void main(String args[]) {

		String data = "Have a Happy Sunday";

		try {
			// Creates a FileWriter
			FileWriter output = new FileWriter("output1.txt");

			// Writes the string to the file
			output.write(data);

			// Closes the writer
			output.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}
	}
}