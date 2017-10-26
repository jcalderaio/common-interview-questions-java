package Sorting;
import java.util.*;

public class bubbleSort
{

	//!!!!!!   O(n^2) search time avg. !!!!!!!!!!
	
	public static void bubbleSort(int[] a) {
        int temp2 = 0;
        for(int j = 0; j<a.length-1; j++) {
            for(int i = 0; i<a.length-1; i++) {
                if(a[i] > a[i+1]) {
                    temp2 = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp2;
                }
            }
        }
 
    }
	
	public static void main(String args[]) {
		
		int[] a = {45, 6, 2, 7, 8, 34, 45, 236, 34234, 23, 0, 9, 5, 2, 3, 5, 1};
		bubbleSort(a);
		System.out.println("Bubble sort: " + Arrays.toString(a) + "\n");
		
	}
	
}
