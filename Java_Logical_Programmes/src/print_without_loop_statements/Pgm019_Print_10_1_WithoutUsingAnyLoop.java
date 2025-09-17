package print_without_loop_statements;

public class Pgm019_Print_10_1_WithoutUsingAnyLoop {
	public static void disp(int no) {
		if(no>=1)
		{
			System.out.println(no);
			no--;
			disp(no);
		}
	}
public static void main(String[] args) {
	disp(10);
}
}
