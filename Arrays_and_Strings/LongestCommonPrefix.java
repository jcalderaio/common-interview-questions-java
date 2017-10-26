package Arrays_and_Strings;
import java.util.*;
import java.lang.*;
import java.io.*;

class LongestCommonPrefix
{
	
	public static void LCP(String a, String b) {
		
		String small,large;
        if(a.length() > b.length()) 
           {small = b;large = a;}
         else
           {small = a;large = b;}
       int index = 0;    
       for(char c: large.toCharArray())
       {
           if(index==small.length()) break;
           if(c != small.charAt(index)) break;
           index++;
       }
       if(index==0)
         System.out.println(""+a+ " and "+b+ " have no common prefix");
       else
         System.out.println(large.substring(0,index));
	}
	
	
	
    public static void main (String[] args) throws java.lang.Exception
    {
        String a = "How are";
        String b = "How are you?";
        
        LCP(a, b);
        
    }
}
