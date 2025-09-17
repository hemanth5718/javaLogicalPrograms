package string_functions;

public class Pgm032_Fetch_Characters_In_A_Given_String {
public static void main(String[] args) {
	String s = "Kanteerava";
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		System.out.println(ch);
	}
	String s2 = "Daari Tappida Maga";
	for (int i = 0; i < s2.length(); i++) {
		char ch =s2.charAt(i);
		if(ch!=' ')
			System.out.println(ch);
	}
}
}
