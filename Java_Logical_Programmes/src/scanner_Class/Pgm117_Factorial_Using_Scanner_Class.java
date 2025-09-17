package scanner_Class;

import java.util.Scanner;

public class Pgm117_Factorial_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = sc.nextInt();
		int fact = 1;
		sc.close();
		for (int i = no; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("The Factorial of " + no + " is " + fact);
	}
}
