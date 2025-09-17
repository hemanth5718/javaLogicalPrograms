package array_Programmes;

public class Pgm124_Linear_Search {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int s = 30;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				System.out.println("Number found at index " + i);
				return;
			}
		}
		System.out.println("Number not Found");
	}
}
