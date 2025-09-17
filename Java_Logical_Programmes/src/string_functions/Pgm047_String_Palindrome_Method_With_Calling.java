package string_functions;

public class Pgm047_String_Palindrome_Method_With_Calling {
public static void main(String[] args) {
	palindrome();
}

 static void palindrome() {
	String s = "malayalam";
	String rev = "";
	for(int i=s.length()-1; i>=0; i--) {
		rev = rev+s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println("It is a String Palindrome");
	}
	else {
		System.out.println("It is not a String Palindrome");
	}
}
}
