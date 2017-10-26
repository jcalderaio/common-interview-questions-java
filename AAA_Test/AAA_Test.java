package AAA_Test;
import java.util.*;

class AAA_Test {
	
	String name;
	int age;
	
	AAA_Test(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main (String args[]) {
		
		AAA_Test test = new AAA_Test("Johnny", 30);
		System.out.print("My name is " + test.name + " and my age is " + test.age);
		
		
	}
	
	
}