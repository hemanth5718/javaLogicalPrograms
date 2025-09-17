package string_functions;

public class Pgm036_To_Remove_Space_From_A_Given_String {
public static void main(String[] args) {
	String s = " ಬಂಗಾರದ ಮನುಷ್ಯ ";
	String s1 = "ಬಬ್ರು ವಾಹನ";
	System.out.println(s.trim());
	System.out.println(s1.replace(" ", ""));
}
}
