package string_functions;

public class Pgm060_Reverse_All_But_First_Character_In_A_Given_String {
public static void main(String[] args) {
	String s = "Kingmaker";
String d = new StringBuilder(s).reverse().toString();
System.out.println(d);
String sa = new StringBuilder(d).reverse().toString();
System.out.println(sa);

	String s1 = "Hello";
	String rev ="";
	rev = rev+s1.charAt(0);
	for(int i =s1.length()-1; i>=1; i--) {
		rev = rev+s1.charAt(i);
	}
	System.out.println(rev);
}
}
