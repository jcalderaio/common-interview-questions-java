package Companies;
import Linked_List.LinkedList;
import Linked_List.LinkedList.Node;
import java.util.*;

//Creat a method that takes in a LinkedList and sums the square root of each data in the list. Then
//return the average.

public class OSISoft
{
	public static void averageSqrt(LinkedList list) {
		try {
			Node current = list.head;
			int N = 0;
			double count = 0;
			
			while(current != null) {
				++N;
				count += Math.sqrt((double)current.data);
				current = current.next;
			}
			
			System.out.print( count/N );
			
		} catch (Exception e) {
			System.out.print("Error: " + e);
		}
	}
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList(2.5); //2
		list.add(16.0); //4
		list.add(100.00); //10
		list.add("we"); //10
		averageSqrt(list);
	}

}
