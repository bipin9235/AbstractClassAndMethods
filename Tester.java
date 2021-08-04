package AbstractClassesAndaMethods;

public class Tester {

	public static void main(String[] args) {
		
		
			CreditCardPayment ccpOne=new CreditCardPayment(1000.23,5001);
			ccpOne.payBill(15000);
			
			
			System.out.println();
			
			CreditCardPayment ccpTwo=new CreditCardPayment(10000.23,5001);
			ccpTwo.payBill(0);
			
			CreditCardPayment ccpThree=new CreditCardPayment(1000.23,5001);
			ccpThree.payBill(5000);
			
			
			System.out.println();
			
			ShoppingPayment spOne=new ShoppingPayment(5000,561328);
			spOne.payBill(5000);
			
			System.out.println();
			
			ShoppingPayment spTwo=new ShoppingPayment(5000,561328);
			spTwo.payBill(6000);
			
			System.out.println();
			
			ShoppingPayment spThree=new ShoppingPayment(5000,561328);
			spThree.payBill(4000);
			
	}

}
