package com.dinesh;

public class Strings {

	public static void main(String[] args) {

		String s1 = "Fita";// string literal, stored in String Constant Pool
		String s2 = "Fita3";// s1 and s2 have same content so memory location will be same
		String s22 = "Java";
		String s3 = new String(s1);// it will be created in heap with fresh memory location
		String s4 = new String("FITA");// s3 and s4 are object , memory will be different

		// == is a operator check the address
		// equals() is method check the content

		// checking the equality of s1 and s2(String literals)

		System.out.println("s1==s2" + (s1 == s2));
		System.out.println("s3==s4" + (s22 == s3));

		// checking the equality of the objects s3 and s4
		System.out.println("s3==s4" + (s3 == s4));
		System.out.println("s1==s3" + (s1 == s3));

		// checking the content
//		System.out.println("s3.equals(s4)" + s3.equalsIgnoreCase(s4));
//		System.out.println("s1.equals(s3)" + s1.equals(s3));
////		
////		
//		System.out.println("Uppercase" + s1.toUpperCase());
//		System.out.println("Lowercase" + s1.toLowerCase());
//		System.out.println("CharAt " + s1.charAt(2));
//		System.out.println("startswith " + s1.startsWith("F"));
//		System.out.println("endswith " + s1.endsWith("a"));
//		System.out.println("index of i " + s1.indexOf("i"));
////        System.out.println("equalsignorecase "+s1.equalsIgnoreCase(s4));
//		System.out.println("last index of 'a' in Java" + s22.lastIndexOf("a"));

		String s7 = "    Java is a programming Language    ";
//		System.out.println(" with whitespace" + s7);
//		System.out.println("removing white space" + s7.trim());
//		System.out.println(s7.strip());
//		System.out.println("substring " + s7.trim().substring(8));
//		System.out.println("substring with start and end" + s7.trim().substring(0, 4));
//        int jIndex=s7.indexOf("J");
//        System.out.println("extract Java"+s7.substring(jIndex,jIndex+4));
//        
//		String words[] = s7.trim().split(" ");
//		System.out.println("No of words " + words.length);
//		for (String word : words) {
//			System.out.println(word);
//		}
//       
		System.out.println("fita concat java " + s1.concat(s22));
		System.out.println("A".compareTo("X"));// ascii of A - 97, ascii of B- 98
		System.out.println("C".compareTo("B"));
		System.out.println("B".compareTo("B"));
		System.out.println("Ankit".compareTo("Aarath"));
		String x = "Programming";
		System.out.println(x.indexOf('g', x.indexOf("g") + 1));
		System.out.println("check java is avaialable in s7 " + s7.contains("Java"));
		String data[] = "Hello9good7evening".split("[0-9]");
		for (String s : data) {
			System.out.println(s);
		}

	}

}
