package scanner_Class;

import java.util.Scanner;

public class Pgm134_Segregate_Characters_In_A_Given_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		sc.close();
		String uc = "";
		String lc = "";
		String no = "";
		String spl = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				uc = uc + ch;
			} else if (Character.isLowerCase(ch)) {
				lc = lc + ch;
			} else if (Character.isDigit(ch)) {
				no = no + ch;
			} else {
				spl = spl + ch;
			}
		}
		System.out.println("The Segretaed Characters are:");
		System.out.println("Upper Case Alphabets: " + uc);
		System.out.println("Lower Case Alphabets: " + lc);
		System.out.println("Numbers: " + no);
		System.out.println("Special Characters: " + spl);
	}
}
