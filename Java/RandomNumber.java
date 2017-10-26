package Java;
import java.util.*;

public class RandomNumber {
    private static Random rdm = new Random();
    
    public static int randInt(int min, int max) {

        int randomNum = rdm.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    
    public static void main(String args[]) {
		
		System.out.print(RandomNumber.randInt(1, 10));
		
	}
    
    
}