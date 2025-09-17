package scanner_Class;

import java.util.Scanner;

public class Pgm152_Fibanacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number in Series");
		int fib1 = sc.nextInt();
		System.out.println("Enter Second Number in Series");
		int fib2 = sc.nextInt();
		System.out.println("Enter the Range");
		int range = sc.nextInt();
		sc.close();
		System.out.println("The Fibanacci Series is:");
		System.out.println(fib1);
		System.out.println(fib2);
		for (int i = 1; i <=range; i++) {
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			System.out.println(fib3);
		}
	}
}
