package string_functions;

public class Pgm058_Print_String_Palindrome_Without_Reversing_A_String {
	public static void main(String[] args) {
		String s = "Malayalam";
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				System.out.println("It is not a palindrome");
				return;
			}
		}
		System.out.println("It is a Palindrome");
	}
}
