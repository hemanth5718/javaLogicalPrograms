package string_functions;

import java.lang.annotation.ElementType;
import java.util.Arrays;

public class Pgm065_String_Anagram_Method_with_Parameter_and_ReturnType {
public static boolean anagram (String s1, String s2) {
	if (s1.length()== s2.length()) {
		char[]arr= s1.toCharArray();
		char[]abb = s2.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(abb);
		String s3 = new String(arr);
		String s4 = new String(abb);
		if (s3.equals(s4)) {
			return true;
		}
		else {
			return false;
		}
	}
	else {
		return false;
	}
}
public static void main(String[] args) {
	System.out.println(anagram("GOD", "DOG"));
}
}
