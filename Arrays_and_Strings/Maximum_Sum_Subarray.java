package Arrays_and_Strings;
import java.util.*;

public class Maximum_Sum_Subarray
{
	
	//This takes an array and the size of an array and returns the maximum size of a sub-array
	
	//O(n^3) solution
	public static int maxSubarrayOn3(int[] arr, int n) {
		
		int ans = Integer.MIN_VALUE;
		
		for(int sub_array_size = 1; sub_array_size <= n; ++sub_array_size) {
			
			for(int start_index = 0; start_index < n; ++start_index) {
				
				if(start_index + sub_array_size > n) {
					break;
				}
				int sum = 0;
				for(int j = start_index; j < (start_index + sub_array_size); ++j) {
					sum+= arr[j];
				}
				ans = Math.max(sum, ans);
			}
		}
		
		return ans;
	}
	
	//O(n^2) solution
	public static int maxSubarrayOn2(int[] arr, int n) {
		
		int ans = Integer.MIN_VALUE;
		
		for(int start_index = 0; start_index < n; ++start_index) {
			
			int sum = 0;
			
			for(int sub_array_size = 1; sub_array_size <= n; ++sub_array_size) {
				
				if(start_index + sub_array_size > n) {
					break;
				}
				
				sum+= arr[start_index+sub_array_size-1];
				ans = Math.max(sum, ans);
			}
			
		}
		
		return ans;
	}
	
	//Dynamic programming solution in O(1)
	public static int maxSubArrayDynamic(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
 
		return max;
	}
	
	public static void main(String args[]) {
		
		int a[] = new int[] {3, -2, 5, -1};
		
		System.out.println(maxSubarrayOn3(a, 4));
		
		System.out.println(maxSubarrayOn2(a, 4));
		
		System.out.println(maxSubArrayDynamic(a));
		
	}
}
