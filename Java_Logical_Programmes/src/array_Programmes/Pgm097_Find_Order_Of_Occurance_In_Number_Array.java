package array_Programmes;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Pgm097_Find_Order_Of_Occurance_In_Number_Array {
public static void main(String[] args) {
	int[] arr = {10,20,30,40,50,10,20,30,40,50,60,70,80,90};
	LinkedHashMap<Integer, Integer> l1 = new LinkedHashMap<Integer, Integer>();
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
	for (Entry<Integer, Integer> a1 : l1.entrySet()) {
		System.out.println(a1.getKey()+" "+a1.getValue());
	}
}
}
