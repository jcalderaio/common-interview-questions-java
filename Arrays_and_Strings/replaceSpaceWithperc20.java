package Arrays_and_Strings;

import java.util.Arrays;


/*
 * Write a method to replace all spaces in a string with'%20'. You may assume that the string has sufficient 
 * space at the end of the string to hold the additional characters, and that you are given the "true" length 
 * of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith Output: "Mr%20John%20Smith"
 */
public class replaceSpaceWithperc20
{

	public static void replace(char[] oldArr) {
		
		int count = 0;
		for(int i = 0; i < oldArr.length; ++i) {
			if(Character.isWhitespace(oldArr[i])) {
				++count;
			}
		}
		
		int newCount = (oldArr.length - count) + (count * 3);
		char[] newArr = new char[newCount];
		
		for(int i = 0, j = 0; i < oldArr.length; ++i, ++j) {
			
			if(Character.isWhitespace(oldArr[i])) {
				newArr[j] = '%';
				newArr[++j] = '2';
				newArr[++j] = '0';
			}
			else {
				newArr[j] = oldArr[i];
			}
			
		}
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(newArr);
	}
	
	public static void main(String args[]) {
		
		char[] str = new char[] {'J', ' ', ' ', 'o', 'h', 'n', ' ', 'n', 'y'};
		char[] str2 = new char[] {'H', 'E', ' ', 'R', ' ', ' ', ' ', 'M', 'I', 'O', ' ', 'N', ' ', ' ', ' ', 'E'};
		replace(str);
		replace(str2);
		
	}
}
