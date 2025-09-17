package string_functions;

public class Pgm043_Reverse_A_String_By_Method_With_Calling {
	public static void main(String[] args) {
		reverse();
	}

	static void reverse() {
		String s = "Sipayi Ramu";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
