package scanner_Class;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Pgm125_Order_Of_Occurance_Of_Characters_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		sc.close();
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
