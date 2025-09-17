package print_without_loop_statements;

public class Pgm023_Print_OddNumbers_From_10_1_WithoutUsingAnyLoop {
public static void disp (int no) {
	if (no>=1)
	{
		if(no%2==1)
		{
			System.out.println(no);
		}
		no--;
		disp(no);
	}
}
public static void main(String[] args) {
	disp(10);
}
}
