package myFirstProject;

import java.util.Scanner;

public class conditionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		
		int a=0; 
		int b=0;
		
		System.out.println("Enter the value for a...");
		a = sc.nextInt();
		System.out.println("Enter the value for b...");
		b= sc.nextInt();
		
		if(a==b) {
			System.out.println("a is equal to b");	
		}
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
		
		if(a<b) {
			
			System.out.println("a is less than b");
		}
	}

}
