package Misc;

public class is_Prime
{
	static boolean isPrime(int p) {
		
		if(p == 1) {
			return false;
		}
		
		for(int i = 2; i < p/2; ++i) {
			if(p % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		System.out.println(isPrime(3));
	}
	
}
