package string_functions;

public class Pgm045_Reverse_A_String_By_Mehod_With_Return_Type {
	public static void main(String[] args) {
		System.out.println(reverse());

	}

	static String reverse() {
		String s = "Doorada Betta";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}
