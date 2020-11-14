package mainClass;

import designClass.bankAccount;

public class mainRun1 {

	public static void main(String[] args) {
		
		bankAccount john = new bankAccount("Jhon"); 
		
		bankAccount michael=new bankAccount(3400); 
		
		bankAccount bob = new bankAccount();
		
		
		
		System.out.println(michael.firstName);
		System.out.println(john.firstName);
		

	}

}
