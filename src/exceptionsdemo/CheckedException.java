package exceptionsdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	
	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("e:\\sample.txt");
			BufferedReader br=new BufferedReader(fr);
			br.re
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
