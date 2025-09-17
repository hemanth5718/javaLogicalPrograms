package string_functions;

public class Pgm0046_String_Palindrome {
public static void main(String[] args) {
	String s = "racecar";
	String rev ="";
	char[]ch = s.toCharArray();
	for(int i=ch.length-1; i>=0; i--) {
		rev =rev+ch[i];
	}
	if(s.equals(rev)){
		System.out.println("It is a String Palindrome");
	}
	else {
		System.out.println("It is not a String Palindrome");
	}

	
}
}
