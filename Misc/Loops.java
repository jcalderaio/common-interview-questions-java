package Misc;
import java.util.Scanner;

public class Loops
{
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);    
		System.out.println("Enter a number:");     //Simple, take in a number from the user
		int N = scan.nextInt();                    //Stores number as an int in "N"
		
		//Beginning of 1st Triangle Code
		System.out.println("1st Triangle:\n");  //This triangle (rectangle) should be self-explanatory. Just prints 4 "*"s on 4 lines
		for(int i = 0; i < N; ++i) {
			for(int j = 0; j < N; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		//End of 1st Triangle Code
		
		System.out.println("\n");    //This just gives space between the 1st and 2nd triangle 	
		
		//Beginning of 2nd Triangle Code
		System.out.println("2nd Triangle:\n");
		int count = 1;
		for(int i = 0; i < N; ++i) {          //Prints a "*" on first line, then increase the count so it prints one more "*" on each consecutive line
			for(int j = 0; j < count; ++j) {
				System.out.print("*");
			}
			System.out.println();
			++count;
		}
		//End of 2nd Triangle Code
		
		System.out.println("\n");    //This just gives space between the 2nd and 3rd triangle
		
		//Beginning of 3rd Triangle Code
		System.out.println("3rd Triangle:\n");
		int count2 = 1;                           
		for(int i = 0; i < N; ++i) {
			for(int j = 0; j < N-count2; ++j) {     //This one gets trickier. You have to print spaces (starting at N-1), then decrease by one on each line
				System.out.print(" ");
			}
			for(int j = 0; j < count2; ++j) {     //You print one "*" on the first line, then increase by one on each consecutive line. You have to make sure to print...
				System.out.print("*");            //...the spaces and the "*" on the same line until you change the count
			}
			System.out.println();
			++count2;
		}
		//End of 3rd Triangle Code
		
		System.out.println("\n");    //This just gives space between the 3rd and 4th triangle
		
		//Beginning of 4th Triangle Code
		System.out.println("4th Triangle:\n");
		int count3 = 1;                           
		int count4 = 0;                           
		for(int i = 0; i < N; ++i) {
			for(int j = 0; j < N-count3; ++j) {  //This one is not as hard as it looks. Just split it up. First, just print the same as triangle 3. Then...
				System.out.print(" ");
			}
			for(int j = 0; j < count3; ++j) {
				System.out.print("*");
			}
			for(int j = 0; j < count4; ++j) {    //..start a new loop that prints 0 "*"s on the first line, but increases by one on each consecutive line
				System.out.print("*");
			}
			System.out.println();
			++count3;
			++count4;
		}
		//End of 4th Triangle Code
		
		System.out.println("\n");    //This just gives space between the 4th and 5th triangle
		
		//Beginning of 5th Triangle Code
		System.out.println("5th Triangle:\n");
		int count5 = N;
		int count6 = N-1;
		for(int i = 0; i < N; ++i) {
			for(int j = 0; j < N-count5; ++j) {   //This one is the exact opposite of the 4th Triangle, it must be split up.
				System.out.print(" ");
			}
			for(int j = 0; j < count5; ++j) {
				System.out.print("*");
			}
			for(int j = 0; j < count6; ++j) {
				System.out.print("*");
			}
			System.out.println();
			--count5;
			--count6;
		}
		//End of 5th Triangle Code
	}
}
