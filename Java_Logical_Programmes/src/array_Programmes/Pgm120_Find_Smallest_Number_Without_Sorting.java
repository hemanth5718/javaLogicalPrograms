package array_Programmes;

public class Pgm120_Find_Smallest_Number_Without_Sorting {
	public static void main(String[] args) {
		int[] arr = { 10, 50, 1,2, 50, 3, 40 };
		int small = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}
