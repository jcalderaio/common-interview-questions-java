/*
ID: jcalder1
LANG: JAVA
PROG: ride
*/

package USAC;
import java.io.*;

public class ride {
	
	public static void main (String args[]) throws IOException {            
		
	    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
	                                                  // input file name goes above
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	    
							  // Get line, break into tokens
	    String line1 = f.readLine();    // first integer
	    String line2 = f.readLine();    // second integer
		
		int comet = 1;
		for(int i = 0; i < line1.length(); ++i) {
			int j = (int) line1.charAt(i);
			comet *= (j % 65) + 1;
		}
		comet %= 47;
		
		int UFO = 1;
		for(int i = 0; i < line2.length(); ++i) {
			int j = (int) line2.charAt(i);
			UFO *= (j % 65) + 1;
		}
		UFO %= 47;
		
		if(comet == UFO)
			out.println("GO");
		else
			out.println("STAY");
		                           
		out.close();                        
		
	}

}
