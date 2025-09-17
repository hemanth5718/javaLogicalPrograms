package print_without_loop_statements;

public class Pgm018_Print_1_5_WithoutUsingForLoop {
static void disp(int no)
{
	if (no<=5)
	{
		System.out.println(no);
		no++;
		disp(no);
	}
}
	public static void main(String[] args) {
		disp(1);
}
}
