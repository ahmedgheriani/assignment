public abstract class Account {
	private Customer customer;
	private double balance;
	private static final int firstAccountNumber=0;
	private int accountNumber;
	private Transaction[] transactions;
	private static final int INITSIZE=25;

	public Account(Customer customer, Balance balance) {
		transactions=new Transaction[INITSIZE];
	}
	public void reallocate() {
		Transaction[] previous=transactions;
		transactions=new Transaction[previous.length*2];
		System.arraycopy(previous, 0, transactions, 0, previous.length);
	}
	public double getBalance() {
		return balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public String toString() {
		return ("Customer: "+customer+" Balance: "+balance);
	}
	public void setCustomer() {
		customer=c;
	}




}