package string_functions;

import java.util.Arrays;

public class Anagram02 {
	public static void main(String[] args) {
		String s1 = "GOD";
		String s2 = "DOG";
			if (s1.length() == s2.length()) {
				char[] arr = s1.toCharArray();
				char[] abb = s2.toCharArray();
				Arrays.sort(arr);
				Arrays.sort(abb);
				String s3 = new String (arr);
				String s4 = new String (abb);
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

}
