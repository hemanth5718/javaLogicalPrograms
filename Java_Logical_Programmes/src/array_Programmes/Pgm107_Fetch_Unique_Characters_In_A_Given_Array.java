package array_Programmes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pgm107_Fetch_Unique_Characters_In_A_Given_Array {
	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'A', 'B', 'C', 'D' };
		LinkedHashMap<Character, Integer> l1 = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!l1.containsKey(arr[i])) {
				l1.put(arr[i], 1);
			} else {
				int x = l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (Entry<Character, Integer> a : l1.entrySet()) {
			int y = a.getValue();
			if (y == 1) {
				System.out.println(a.getKey() + " " + a.getValue());
			}
		}
	}
}
