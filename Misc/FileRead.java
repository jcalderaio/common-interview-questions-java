package Misc;
import java.util.*;
import java.io.*;

public class FileRead
{

	public static void main(String args[]) throws IOException {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the name of a file: ");
		
		String filename = kb.nextLine();
		File inputFile = new File (filename);
		if (!inputFile.exists()) {
			System.out.println("The file is not found.");
			System.exit(0);
		}
		
		System.out.println("Enter the letter of a character you'd like to count: ");
		char c = kb.next().charAt(0);
		kb.close();
		int count = 0;
		
		
		Scanner input = new Scanner(inputFile);
		while(input.hasNext()){
			String content = input.nextLine();
			
			for(int i = 0; i < content.length(); ++i) {
				if(content.charAt(i) == c) {
					++count;
				}
			}
		}
		input.close();
		
		System.out.println("\"" + c + "\"" + " is displayed " + count + " times.");	
	}
}
