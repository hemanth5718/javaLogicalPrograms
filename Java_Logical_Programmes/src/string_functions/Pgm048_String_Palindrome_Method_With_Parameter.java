package string_functions;

public class Pgm048_String_Palindrome_Method_With_Parameter {
public static void main(String[] args) {
	palindrome("Radar");
}

	static void palindrome(String string) {
		String rev ="";
		for(int i =string.length()-1; i>=0; i--) {
			rev = rev+string.charAt(i);
		}
		if(string.equalsIgnoreCase(rev)) {
			System.out.println("It is a String Palindrome");
		}
		else {
			System.out.println("It is not a String Palindrome");
		}
}
}
