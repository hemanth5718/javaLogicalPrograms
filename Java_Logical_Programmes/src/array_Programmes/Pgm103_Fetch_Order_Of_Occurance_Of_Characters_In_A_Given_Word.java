package array_Programmes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pgm103_Fetch_Order_Of_Occurance_Of_Characters_In_A_Given_Word {
	public static void main(String[] args) {
		String s = "babruvahana";
		char[] arr = s.toCharArray();
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
			System.out.println(a.getKey() + " " + a.getValue());
		}
	}
}
