package recursion;

public class Pgm019_Print_10_1_Using_Recursion {
public static void main(String[] args) {
	disp(10);
}

 static void disp(int i) {
if(i>=1) {
	System.out.println(i);
	i--;
	disp(i);
}
}
}
