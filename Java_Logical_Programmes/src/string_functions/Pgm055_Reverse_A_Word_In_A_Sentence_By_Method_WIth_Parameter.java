package string_functions;

public class Pgm055_Reverse_A_Word_In_A_Sentence_By_Method_WIth_Parameter {
	public static void main(String[] args) {
		reverse("Keep out of reach of Children");

	}

	static void reverse(String string) {
		String[] arr = string.split(" ");
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
