package string_functions;

public class Pgm067_Fetch_First_Character_of_a_String {
public static void main(String[] args) {
	String s1 = "United Nations Human Rights Commission";
	String s2 = "";
	String [] arr = s1.split(" ");
	for (int i = 0; i < arr.length; i++) {
		String s4 = arr[i];
		s2 = s2+s4.charAt(0);
	}
	System.out.println(s2);
}
}
