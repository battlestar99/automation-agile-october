package javaTest;

public class runBanktwo {

	public static void main(String[] args) {
		
		
		bankAccount john=new bankAccount("john@test.com");
        System.out.println(john.emailAdress);
        
        
        bankAccount george = new bankAccount("geroge@gmail.com");
        System.out.println(george.emailAdress); 
        
        
        
	}

}
