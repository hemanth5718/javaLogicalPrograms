package string_functions;

public class Pgm040_Convert_Any_Input_To_String {
public static void main(String[] args) {
	int a = 100;
	String s = String.valueOf(a);
	System.out.println(s);
	
	char b = 'Z';
	String s1 = String.valueOf(b);
	System.out.println(s1);
	
	boolean c = true;
	String s2 = String.valueOf(c);
	System.out.println(s2);
	
	double d = 23.34;
	String s3 = String.valueOf(d);
	System.out.println(s3);
	
	float e = 39.3343f;
	String s4 = String.valueOf(e);
	System.out.println(s4);
	
	long f = 98769796369369l;
	String s5 = String.valueOf(f);
	System.out.println(s5);
}
}
