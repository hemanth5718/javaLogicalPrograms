package scanner_Class;

import java.util.Scanner;

public class Pgm133_Count_Of_UpperCase_LowerCase_Numbers_And_SpecialCharacters_In_A_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		int uc = 0;
		int lc = 0;
		int no = 0;
		int spl = 0;
		sc.close();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				uc++;
			} else if (Character.isLowerCase(ch)) {
				lc++;
			} else if (Character.isDigit(ch)) {
				no++;
			} else {
				spl++;
			}
		}
		System.out.println("The count of Characters are:");
		System.out.println("Upper case: " + uc);
		System.out.println("Lower case: " + lc);
		System.out.println("Numbers: " + no);
		System.out.println("Special Characters: " + spl);

	}
}
