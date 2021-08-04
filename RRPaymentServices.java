/*
 *#Task-19:  Peter wants to start a payment service portal for making payments for credit card bill and online shopping. He will need a base class (RRPaymentServices) to store balance and customer ID information.
			He will use two classes- CreditCardPayment and ShoppingPayment for paying Credit card bills and shopping bills respectively. The bill payment and id generation is different for both payment modes.
 * Registration ID: JIRSS1132
 * Name: Bipin Kumar
 */
package AbstractClassesAndaMethods;
public abstract class RRPaymentServices {
	// class data members
	private double balance;
	private int customerID;
	// constructor
	public RRPaymentServices(double balance, int customerID) {
		this.balance = balance;
		this.customerID = customerID;
	}
	// Getter and setter methods
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustomerID() {
		return customerID;
	}
	abstract void payBill(double amount);
	
}
