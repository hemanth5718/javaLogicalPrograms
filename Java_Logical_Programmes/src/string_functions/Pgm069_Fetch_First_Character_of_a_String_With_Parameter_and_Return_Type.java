package string_functions;

public class Pgm069_Fetch_First_Character_of_a_String_With_Parameter_and_Return_Type {
public static String first (String s) {
	String s2 ="";
	String[]arr = s.split(" ");
	for (int i = 0; i < arr.length; i++) {
		String s3 = arr[i];
		s2 = s2+s3.charAt(0);
	}
	return s2;
}
public static void main(String[] args) {
	System.out.println(first("United Nation Human Rights Council"));
}
}
