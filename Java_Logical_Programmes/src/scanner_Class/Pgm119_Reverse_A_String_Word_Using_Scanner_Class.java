package scanner_Class;

import java.util.Scanner;

public class Pgm119_Reverse_A_String_Word_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String s = sc.nextLine();
		sc.close();
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
