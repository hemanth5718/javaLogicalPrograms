package string_functions;

import java.util.Arrays;

public class Pgm064_String_Anagram_Method_with_Parameter {
public static void anagram(String s1,String s2) {
	if (s1.length() == s2.length()) {
		char[] arr = s1.toCharArray();
		char [] abb = s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(abb);
		String s3 = new String(arr);
		String s4 = new String(abb);
		if (s3.equals(s4)) {
			System.out.println("It is a String Anagram");
		}
		else {
			System.out.println("It is not a String Anagram");
		}
	}
	else {
		System.out.println("It is not a String Anagram");
	}
}
public static void main(String[] args) {
	anagram("GOD", "DOG");
}
}
