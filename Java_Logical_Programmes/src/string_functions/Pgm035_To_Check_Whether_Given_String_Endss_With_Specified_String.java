package string_functions;

public class Pgm035_To_Check_Whether_Given_String_Endss_With_Specified_String {
public static void main(String[] args) {
	String s = "Bhaktha Kumbara";
	System.out.println(s.endsWith("Kumbara"));
	System.out.println(s.endsWith("Bhaktha"));
	String s1 = "ಭಕ್ತ ಕುಂಭಾರ";
	System.out.println(s1.endsWith("ಕುಂಭಾರ"));
	System.out.println(s1.endsWith("ಭಕ್ತ"));
}
}
