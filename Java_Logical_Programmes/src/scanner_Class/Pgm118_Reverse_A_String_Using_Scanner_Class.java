package scanner_Class;

import java.util.Scanner;

public class Pgm118_Reverse_A_String_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		sc.close();
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		System.out.print(s1);
	}
}
