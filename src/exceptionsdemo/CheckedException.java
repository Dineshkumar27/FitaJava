package exceptionsdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("e:\\sample677.txt");
		BufferedReader br = new BufferedReader(fr);

	}
}
