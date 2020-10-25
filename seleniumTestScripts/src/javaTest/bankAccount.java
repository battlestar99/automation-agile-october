package javaTest;

public class bankAccount {
	
	
	
// properties/global variable, functions/methods 
	
	// constructor 
	
	
	public int amountofMoney; 
	public String emailAdress;
	
	
	// constructor overloading 
	public bankAccount(int x) {
		
		System.out.println("An object is created");
		
	}
	
   public bankAccount(int x, int y) {
		
		System.out.println("An object is created");
		
	}
	
	
   public bankAccount(String x) {
		
	   emailAdress=x;
	   
		System.out.println("An object is created");
		
	}
	
 
	
	
	public void depositMoney() {
	int x;
		System.out.println("Depositing money");
		
	}
	
	public void withdrawmoney() {
		System.out.println("withdrawing money");
		
	}
	
	

}
