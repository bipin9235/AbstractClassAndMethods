package AbstractClassesAndaMethods;

public class ShoppingPayment extends RRPaymentServices {
	
	static int counter=1001;
	static String paymentID="S"+counter++;
	
	public ShoppingPayment(double balance, int customerID) {
		super(balance, customerID);
	}
	String getPaymentID() {
		return paymentID;
	}
	void payBill(double amount) {
		if(amount==getBalance()) {
			setBalance(0);
			System.out.println("Congratulations!! Your payment of Rs."+amount+" is successfull with Payment id "+paymentID);
			
		}
		else if(amount>getBalance())
		{
			System.out.println("Excess amount entered !! Please try again.");
		}
		else
		{
			System.out.println("Insufficient amount entered!! Please try again.");
		}
	}
	
}
