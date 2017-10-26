package Searching;

public class Binary_Search
{
	
	//**********For Binary Search the list should be sorted. !!!!!!   O(log(n)) search time avg. !!!!!!!!!!
	
	public static boolean binarySearch(int[] arr, int n, int size) {
		
		int start = 0;
		int end = size - 1;
		
		while(end >= start) {
			int middle = (start + end) / 2;
			
			if(arr[middle] == n) {
				return true;
			}
			
			if(arr[middle] < n) {
				start = middle + 1;
			}
			if(arr[middle] > n) {
				end = middle - 1;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		
		int[]  arr = new int[] {2, 5, 7, 23, 34, 89, 99};
		int size = arr.length;
		
		System.out.println ( binarySearch(arr, 10, size) );
		System.out.print ( binarySearch(arr, 89, size) );
		
	}
}
