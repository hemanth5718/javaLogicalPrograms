package string_functions;

public class Pgm049_String_Palindrome_Method_With_Return_Type {
public static void main(String[] args) {
	System.out.println(palindrome());
}

	static boolean palindrome() {
		String s = "madam";
		String rev = "";
		for(int i =s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			return true;
		}
		else {
			return false;
		}
}
}
