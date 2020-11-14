package designClass;

public class runOne {

	public static void main(String[] args) {
		
		
		bankAccount ba=new bankAccount(); 
		ba.go();
		
		
		
		checkingAccount bob=new checkingAccount(); 
		
		bob.deposit();
		
		checkingAccount steve=new checkingAccount();
		
		steve.deposit("fdasf");
		
		savingAccount bob1 = new savingAccount(); 
		
		bob1.deposit();
		
		checkingAccountVA cav=new checkingAccountVA();
		
		
		

	}

}
