package string_functions;

public class Pgm068_Fetch_First_Character_of_a_String_by_method_with_calling {
public static void fetch() {
	String s1 = "United Nations Human Rights Commission";
	String s2 = "";
	String [] arr = s1.split(" ");
	for (int i = 0; i < arr.length; i++) {
		String s3 = arr[i];
		s2 = s2+s3.charAt(0);
	}
	System.out.println(s2);
}
public static void main(String[] args) {
	fetch();
}
}
