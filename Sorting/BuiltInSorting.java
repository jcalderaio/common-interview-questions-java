package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BuiltInSorting
{
	public static void main(String args[]) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(5);
		a.add(4);
		a.add(6);
		a.add(3);
		
		//  Fast, east sort
		Collections.sort(a);
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		
	}

}
