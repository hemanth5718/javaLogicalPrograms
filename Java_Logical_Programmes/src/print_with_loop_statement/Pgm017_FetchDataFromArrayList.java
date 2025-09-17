package print_with_loop_statement;

import java.util.ArrayList;
import java.util.List;

public class Pgm017_FetchDataFromArrayList {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20.6);
		l1.add(true);
		l1.add("HI");
		l1.add('A');
		for (Object a1 : l1) {
			System.out.println(a1);
		}
	}

}
