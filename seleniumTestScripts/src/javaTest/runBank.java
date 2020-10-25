package javaTest;

public class runBank {

	public static void main(String[] args) {
	
		
		bankAccount account1=new bankAccount(12); 
		
		account1.depositMoney();
		account1.withdrawmoney();
		
		account1.amountofMoney=12;
		account1.emailAdress="account1@gmail.com";
		
		bankAccount account2=new bankAccount("dsgfd"); 
		account2.depositMoney();
		account2.withdrawmoney();
		
		account2.emailAdress="aldfl@gmail.com";
		account2.amountofMoney=98; 
		
		
		System.out.println(account2.amountofMoney);
		System.out.println(account1.amountofMoney);

	}

}
