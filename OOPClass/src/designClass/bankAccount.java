package designClass;

public class bankAccount {
	
	
	public String firstName; 
	public int amountOfMoney; 
	public int yearlyFees;
	public int numberofdeposit; 
	public String chequeNum;
	
	
	// constructor overloading 
	
	public bankAccount(String firstName) {
		
		this.firstName=firstName; 
		
	}
	
	public bankAccount() {
		
		
	}
	
	public bankAccount(int amountOfMoney) {
		
		this.amountOfMoney=amountOfMoney; 
	}
	
	
public bankAccount(String firstName, int amountOfMoney) {
		
		this.firstName=firstName; 
		this.amountOfMoney=amountOfMoney; 
	}
	

	public void go() {
	
	System.out.println("This is parent class go function");
	
	}
	
	private void connectServer() {
		
		System.out.println("This is function go");
		
		
	}

	// method or function overloading 
	
	
	public void withdraw() {
		connectServer();
		
		
		
	}
	public void deposit() {
		connectServer();
	
		int numberofdeposit; 
		
		this.numberofdeposit=2000;
		
		
		System.out.println("Depositing money cash");
	}
	
	public void deposit(String chequeNum) {
		connectServer();
		this.chequeNum=chequeNum;
		int numberofdeposit; 
		System.out.println("Depositing money cheque");
		
	}
	
	
public int returnAmountOfmoney(int x) {
		
		int totalMoney = 100+x;
		return totalMoney;
		
	}

	
	public static void numberOfCustomer() {
		
		System.out.println("Counting number of customers");
		
	}
	
	
	
}
