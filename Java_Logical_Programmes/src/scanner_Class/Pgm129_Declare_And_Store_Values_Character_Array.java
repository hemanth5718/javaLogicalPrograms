package scanner_Class;

import java.util.Scanner;

public class Pgm129_Declare_And_Store_Values_Character_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = sc.nextInt();
		char[] arr = new char[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		sc.close();
		System.out.println("The items in the Array are:");
		for (char a : arr) {
			System.out.println(a);
		}
	}
}
