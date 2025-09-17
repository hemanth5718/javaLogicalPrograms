package string_functions;

public class Pgm054_Reverse_A_Word_In_A_Sentence_By_Method_WIth_Calling {
	public static void main(String[] args) {
		reverse();
	}

	static void reverse() {
		String s = "Keep out of reach of children";
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
