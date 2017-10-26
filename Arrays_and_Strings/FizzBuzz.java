package Arrays_and_Strings;

public class FizzBuzz
{
	/*
	 * Write a program that prints the numbers from 1 to 100. But for 
	 * multiples of three print "Fizz" instead of the number and for 
	 * the multiples of five print "Buzz". For numbers which are multiples 
	 * of both three and five print "FizzBuzz".
	 */
	
	public static void fizzBuzz() {
		
		for(int i = 0; i < 100; ++i) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("FizzBuzz");
				continue;
			}
			if(i%3 == 0) {
				System.out.println("Fizz");
				continue;
			}
			if(i%5 == 0) {
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		fizzBuzz();
	}
}
