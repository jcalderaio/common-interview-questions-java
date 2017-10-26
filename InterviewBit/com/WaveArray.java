package InterviewBit.com;
import java.util.*;

/*
 * Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]

NOTE : If there are multiple answers possible, return the one thats lexicographically smallest. 
So in example case, return [2, 1, 4, 3]

Example:
Given [5, 1, 3, 2, 4]
Ans: [2, 1, 4, 3, 5]

 */


public class WaveArray
{
	public static ArrayList<Integer> wave(ArrayList<Integer> A) {
		
		//  First sort the array
	    
	    Collections.sort(A);
	    
	    
	    for (int i = 2; i <= A.size(); i += 2) {
	        
	        int temp = A.get(i-2);
		    A.set(i-2, A.get(i-1));
		    A.set(i-1, temp);
	    }
	    
	    return A;
	    
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(7);
		a.add(6);
		a.add(9);
		a.add(12);
		
		ArrayList<Integer> waveAns = new ArrayList<Integer>();
		waveAns = wave(a);
		
		for (int i : waveAns) {
			System.out.print(i + " ");
		}
		
	}

}
