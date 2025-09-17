package string_functions;

public class Pgm053_Reverse_A_Word_In_A_Sentence {
	public static void main(String[] args) {
		String s = "Keep Out of Reach of Children";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i == 3) {
				String s1 = arr[i];
				String rev = "";
				for (int j = s1.length() - 1; j >= 0; j--) {
					rev = rev + s1.charAt(j);
				}
				System.out.print(rev + " ");
			} else {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
