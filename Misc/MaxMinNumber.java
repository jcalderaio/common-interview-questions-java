package Misc;

public class MaxMinNumber
{

	public static int maxNumber(int[] a) {
	    int tempMax = a[0];
	    for(int i = 1; i<a.length; i++) {
	        if(tempMax < a[i]) {
	            tempMax = a[i];
	        }
	    }

	    return tempMax;
	}
	
	public static int minNumber(int[] a) {
        int tempMin = a[0];
        for(int i = 1; i<a.length; i++) {
            if(tempMin > a[i]) {
                tempMin = a[i];
            }
        }
        return tempMin;
    }
	
	public static void main(String args[]) {
		
		int[] a = {6, 3, 9, 8, 2, 55, 134, 98, 7, 0};
		System.out.println( maxNumber(a));
		System.out.print( minNumber(a));
		
	}
	
}


