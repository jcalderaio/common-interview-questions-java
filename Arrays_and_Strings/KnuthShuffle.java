package Arrays_and_Strings;



//random = (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);

public class KnuthShuffle {


		public static void main(String args[]) {
			
			
			int[] a = {1,2,3,4,5,6,7};
			
			for(int i = 0; i < 7; ++i) {
				
				
				int random = (int)(Math.random() * ((6 - i) + 1) + i);
					
					System.out.print(random + " ");
				int temp = a[i];
				a[i] = a[random];
				a[random] = temp;
			}

		}
	
}
