package array_Programmes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pgm102_Fectch_Duplicate_Characters_In_A_Given_String {
	public static void main(String[] args) {
		String s1 = "alltheverybest";
		char[] arr = s1.toCharArray();
		LinkedHashMap<Character, Integer> l1 = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(!l1.containsKey(arr[i])) {
				l1.put(arr[i], 1);	
			}
			else {
				int x = l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for (Entry<Character, Integer> a1:l1.entrySet()) {
			char x =  a1.getKey();
			int y = a1.getValue();
			if (y>1) {
				System.out.println(a1.getKey()+ " "+a1.getValue());
			}
		}
	}

}
