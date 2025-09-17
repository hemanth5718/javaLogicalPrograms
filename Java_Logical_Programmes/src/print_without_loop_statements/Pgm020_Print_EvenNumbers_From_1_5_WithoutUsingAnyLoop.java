package print_without_loop_statements;

public class Pgm020_Print_EvenNumbers_From_1_5_WithoutUsingAnyLoop {
public static void disp(int no) {
	if (no<=5)
	{
		if (no%2==0)
		{
			System.out.println(no);
		}
		no++;
		disp(no);
	}
}
public static void main(String[] args) {
	disp(1);
}
}
