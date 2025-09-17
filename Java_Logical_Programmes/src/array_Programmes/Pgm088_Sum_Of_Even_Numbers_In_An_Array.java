package array_Programmes;

public class Pgm088_Sum_Of_Even_Numbers_In_An_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6,10 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}
