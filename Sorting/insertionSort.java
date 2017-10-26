package Sorting;
import java.util.*;

public class insertionSort
{
	//!!!!!!   O(n^2) search time avg. !!!!!!!!!!
	
	public static void insertSort(int[] arr, int n){
        for(int i = 1; i < n; ++i){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion sort: " + Arrays.toString(arr) + "\n");
    }
	
	public static void main(String args[]) {
		
		int[] a = {5,2,3,1,4};
		insertSort(a, 5);
		
	}

}
