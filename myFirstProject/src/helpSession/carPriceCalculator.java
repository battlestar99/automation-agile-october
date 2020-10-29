package helpSession;

import java.util.Scanner;

public class carPriceCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		utitlity ut = new utitlity();
		
		double taxrate = 3; 
		System.out.println("Enter the base car price");
		double baseCarPrice = sc.nextDouble();
		
		System.out.println("Enter the credit score");
		int creditScore=sc.nextInt(); 	
		
		double IRate = ut.findinterestRate(creditScore);
		
		double totalCarprice = ut.getTotalPrice(baseCarPrice,IRate); 
		
		
		
		
		System.out.println("Enter the down payment");
		double downPayment = sc.nextDouble();
		
		System.out.println("Enter the admin fee");
		double adminFee = sc.nextDouble();
		
		System.out.println("Enter the warrenty amount");
		double warrentyAmount = sc.nextDouble();
		
		System.out.println("Enter the number of months to pay");
		double numberOfMonth = sc.nextDouble();
		
		
		
		double totalrCarpriceWithTax=totalCarprice +totalCarprice*(taxrate/100);
		
		
		double carPrice = totalrCarpriceWithTax-downPayment;
		
		
		System.out.println("The finance amount is");
		
		System.out.println(carPrice);
		
		
		double monthlyPayment = carPrice/numberOfMonth; 
		
		System.out.println(monthlyPayment);
		
		
		

	}

}
