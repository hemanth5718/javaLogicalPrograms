package array_Programmes;

public class Pgm096_Remove_Duplicates_From_String_Array_By_Method_With_Parameter {
	public static void main(String[] args) {
		String[] arr = { "Hi", "Hello", "How", "Are", "You", "Hi", "Hello", "How", "Are", "You" };
		remove(arr);
	}

	static void remove(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[i] = "aa";
				}
			}
		}
		for (String a : arr) {
			if (!a.equals("aa")) {
				System.out.println(a);
			}
		}
	}
}
