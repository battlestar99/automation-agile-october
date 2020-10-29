package helpSession;

public class utitlity {
	
	
	public double findinterestRate(int creditScore) {
		
		double interestRate=0; 
		
		if(creditScore>750) {
			
			interestRate=1;
		}
   if(creditScore<750 && creditScore>699 ) {
			
	   interestRate=1.5;
		}
		
   if(creditScore<700 && creditScore>600 ) {
		
	   interestRate=2.5;
		}
   
   
   return interestRate;
		
	}
	
	
	public double getTotalPrice(double basePrice, double Irate) {
		
		double totalPrice=basePrice + (basePrice*(Irate/100));
		return totalPrice;
		
		
		
	} 	
	
	
	
	
	
	
	
	
	
	
	
	

}
