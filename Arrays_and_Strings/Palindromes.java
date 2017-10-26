package Arrays_and_Strings;
import java.util.Scanner;
import java.util.*;

public class Palindromes
{

	//RECURSIVE
	
    public static boolean isPalRecursive(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until string completes or condition fails
            return isPalRecursive(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }
    
    //ITERATIVE
    
    public static boolean isPalIterative(String s) {
    	
    	for(int k=0, j=s.length()-1; k<j; k++, j--) {
	        if(s.charAt(k) != s.charAt(j)) {
	            return false;
	        }
	    }
    	return true;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("type a word to check if its a palindrome or not");
            String x = sc.nextLine();
            
            System.out.println("A) Recursive");
            System.out.println("B) Iterative");
            char choice = sc.nextLine().toLowerCase().charAt(0);
            if(choice == 'a') {
            	if(isPalRecursive(x))
                    System.out.println(x + " is a palindrome");
                else
                    System.out.println(x + " is not a palindrome");
            }
            else if(choice == 'b'){
            	if(isPalIterative(x))
                    System.out.println(x + " is a palindrome");
                else
                    System.out.println(x + " is not a palindrome");
            }
   
        }
        
    }
}