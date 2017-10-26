/*
ID: jcalder1
LANG: JAVA
TASK: test
*/

package Misc;
import java.io.*;
import java.util.*;


public class WriteToFile
{
	public static void main (String args[]) throws IOException {                 //Must throw this IOException or will not work
		// Use BufferedReader rather than RandomAccessFile; it's much faster
	    BufferedReader f = new BufferedReader(new FileReader("test.in"));
	                                                  // input file name goes above
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
	    // Use StringTokenizer vs. readLine/split -- lots faster
	    StringTokenizer st = new StringTokenizer(f.readLine());
							  // Get line, break into tokens
	    int i1 = Integer.parseInt(st.nextToken());    // first integer
	    int i2 = Integer.parseInt(st.nextToken());    // second integer
	    out.println(i1+i2);                           // output result
	    out.close();                                  // close the output file
		
	}

}
