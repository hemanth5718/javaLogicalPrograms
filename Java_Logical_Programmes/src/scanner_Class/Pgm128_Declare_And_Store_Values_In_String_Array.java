package scanner_Class;

import java.util.Scanner;

public class Pgm128_Declare_And_Store_Values_In_String_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the values for the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		sc.close();
		System.out.println("The items in Array Are:");
		for (String a : arr) {
			System.out.println(a);
		}
	}
}
