package array_Programmes;

public class Pgm094_Remove_Duplicates_From_Array_Using_Method_With_Calling {
	public static void main(String[] args) {
		remove(); 
	}

	static void remove() {
		int[] arr = { 10, 20, 30, 40, 50, 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 0;
				}
			}
		}
		for (int a : arr) {
			if (a != 0) {
				System.out.println(a);
			}
		}

	}
}
