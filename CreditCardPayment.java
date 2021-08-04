package AbstractClassesAndaMethods;

public class CreditCardPayment extends RRPaymentServices{
 
	
	static int counter=1001;
	String paymentID;
    double cashBack;
	double balanceDue;
	
	public CreditCardPayment(double balance, int customerID) {
		super(balance, customerID);
	}
	
	String getPaymentID() {
		return paymentID;
	}
	double getCashBack() {
		return cashBack;
	}
	double getBalanceDue() {
		return balanceDue;
	}
	void payBill(double amount) {
		double preDue=getBalance();
		if(amount<1)
		{
			System.out.println("Invalid amount entered!! Please try again");
			System.out.println("Minimun pay amount Rs.1 ");
		}
		else {
		if(amount>getBalance()) {
			cashBack+=amount-getBalance();
			setBalance(0);
		}
		else if(amount<getBalance()) {
			balanceDue=getBalance()-amount;
			setBalance(balanceDue);
		}
		paymentID="C"+counter++;
		System.out.println("Congratulations!! You have successfully made a payment of Rs."+amount+" Payment Details are-");
		System.out.println("*******************************************************************************************");
		System.out.println("            Customer ID         		    :"+getCustomerID());
		System.out.println("            Payment  ID          		    :"+paymentID);
		System.out.println("            Previous Due         		    :Rs."+preDue);
		System.out.println("            Remaining Due       		    :Rs."+getBalance());
		System.out.println("            CashBack wallet Balance                 :Rs."+cashBack);
		}
	}
	
	
	}

