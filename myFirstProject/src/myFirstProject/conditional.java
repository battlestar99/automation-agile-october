package myFirstProject;

public class conditional {

	public static void main(String[] args) {
		
		
		
		int a = 12; 
		int b = 13; 
		
		int x = 123; 
		int y= 345;
		
		boolean flag = (x<y);
		boolean flag1= (a>b);
		boolean flag2= (x==a);
		
		//a=b;
		
		if(flag) {
			
		System.out.println("a is equal to b");	
			
		}
		
		
		if(a>b) {
			
			System.out.println("a is greater than b");
			
		}
		
		else {
			
			System.out.println("the condition is true");
			
		}

	}

}
