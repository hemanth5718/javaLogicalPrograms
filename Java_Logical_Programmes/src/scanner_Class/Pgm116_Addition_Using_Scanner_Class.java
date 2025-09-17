package scanner_Class;

import java.util.Scanner;

public class Pgm116_Addition_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of A");
		int a = sc.nextInt();
		System.out.println("Enter the Value of B");
		int b = sc.nextInt();
		sc.close();
		int c = a + b;
		System.out.println("The sum of A and B is " + c);
	}
}
