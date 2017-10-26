package Searching;

public class LinearSearch
{
	
	//!!!!!!   O(n) search time avg. !!!!!!!!!!
	
	public static boolean Linearsearch(int[] a, int x) {
        boolean found = false;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                found = true;
            }
        }
        return found;
    }
	
	public static void main(String args[]) {
		
		int[]  arr = new int[] {2, 5, 7, 23, 34, 89, 99};
		
		System.out.println ( Linearsearch(arr, 10) );
		System.out.print ( Linearsearch(arr, 89) );
		
	}
	

}
