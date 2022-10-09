package exceptionsdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("e:\\sample677.txt");
		BufferedReader br = new BufferedReader(fr);

	}
}
