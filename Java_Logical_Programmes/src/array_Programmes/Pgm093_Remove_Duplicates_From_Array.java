package array_Programmes;

public class Pgm093_Remove_Duplicates_From_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 10, 20, 30, 40, 50 };
		int no = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = no;
				}
			}
		}
		for (int a : arr) {
			if (a != no) {
				System.out.println(a);
			}
		}
	}
}
