package string_functions;

import java.util.Arrays;

public class Pgm136_Check_For_String_Anagram {
	public static void main(String[] args) {
		String s1 = "DOG";
		String s2 = "GOD";
		if (s1.length() == s2.length()) {
			char[] arr = s1.toCharArray();
			char[] abb = s2.toCharArray();
			Arrays.sort(arr);
			Arrays.sort(abb);
			if (Arrays.equals(arr, abb)) {
				System.out.println("The Given Words are Anagrams");
			} else {
				System.out.println("The Given words are not Anagrams");
			}

		} else {
			System.out.println("The Given words are not Anagrams");
		}
	}
}
