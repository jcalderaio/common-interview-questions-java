package Recursion;
import java.util.*;

public class RecursionMaster {
    public static void main(String args[]) {
        printRange(2,5);

        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(sum(array));
        System.out.println(average(array));

        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("racecar"));

        printFigureA(5);
        printFigureB(5);

        System.out.println(isPrimeNumber(17, 17));
    }

    public static void printRange (int start, int end) {
        /**while(start <= end) {
        System.out.println(start);
        start++;
        }
         */

        if(start <= end) {    //base case
            System.out.println(start);
            start++;
            printRange(start, end);
        }

    }

    public static int sum(int[] array) {
        return sum(array, 0);
    }

    public static int sum(int[] array, int index) {  //helper method
        if(index < array.length) { //recursive case
            return array[index] +sum(array, index + 1);
        }
        return 0;

    }

    public static double average(int[] array) {
        return average(array, 0);
    }

    public static double average(int[] array, int index) {
        if(index < array.length) {
            return (sum(array, 0))/array.length;
        }
        return 0;
    }

    public static boolean isPalindrome(String str) {
        if(str.equals(reverse(str, str.length() - 1))) {
            return true;
        }

        else {
            return false;
        }
    } 

    public static String reverse(String str, int index) {
        if(index < 0) {
            return "";
        }

        else {
            return str.charAt(index) + reverse(str, index - 1);
        }
    } 

    public static void printFigureA(int size) {
        String line = "*";
        printFigureA(line, size, 1);
    }

    public static void printFigureA(String line, int size, int currentRow) {
        if(currentRow <= size) {  //recursive case
            System.out.println(line);
            line += "*";
            printFigureA(line, size, currentRow + 1);
        }
    }

    public static void printFigureB(int size) {
        String line = "*";
        printFigureB(line, size, 1);
    }

    public static void printFigureB(String line, int size, int currentRow) {
        if(currentRow <= size) {  //recursive case
            printSpaces(size - currentRow, 1);
            System.out.println(line);
            line += "*";
            printFigureB(line, size, currentRow + 1);
        }
    }

    public static void printSpaces(int numSpaces, int colNo) {
        if(colNo <= numSpaces) {
            System.out.print(" ");
            printSpaces(numSpaces, colNo + 1);
        }
    }

    public static boolean isPrimeNumber(int number, int temp) {
        boolean result = false;    
        if(temp - 1 <=1) {
            result = true;
        }

        else {
            if(number % (temp-1) == 0) {
                result = false;
            }
            else {
                result = isPrimeNumber(number, temp - 1);
            }

        }

        return result;

    }
}