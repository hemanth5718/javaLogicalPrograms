package array_Programmes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pgm100_Fetch_Order_Of_Occurance_In_A_Given_String {
	public static void main(String[] args) {
		String[] arr = { "Hi", "Hello", "How", "Are", "You", "Hello", "How", "You" };
		LinkedHashMap<String, Integer> l1 = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!l1.containsKey(arr[i])) {
				l1.put(arr[i], 1);
			} else {
				int x = l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (Entry<String, Integer> a : l1.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}
	}
}
