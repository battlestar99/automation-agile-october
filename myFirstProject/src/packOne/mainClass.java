package packOne;

import functionsPack.car;
import functionsPack.testClass;

public class mainClass {

	public static void main(String[] args) {
		
		
		testClass tc=new testClass();
		
		car c = new car();
		
		c.startTheCar("dfads");
		
		int a = tc.addTwoNumbers(543, 678);
		
		System.out.println(a);
		
	

	}

}
