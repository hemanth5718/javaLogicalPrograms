package array_Programmes;

public class Pgm121_Find_Largest_Number_Without_Sorting {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 20, 22, 25 };
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println(large);
	}
}
