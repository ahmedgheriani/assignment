public abstract class Account {
    private Customer customer; //initialize variables
    public double balance; //or private?
    private int accountNumber;
    private int lastAccountNumber = 9999;
    public Transaction[] transactions; //or private?
    public final int INITSIZE = 25; //or private?

    public Account(Customer c, double balance) { //constructor that gives values to variables of each object
        this.customer = c;
        this.balance = balance;
        //this.transactions = new Transaction[INITSIZE];
        this.accountNumber = lastAccountNumber;
        lastAccountNumber++;
    }

    public void reallocate() {
        Transaction[] previous = transactions;
        transactions = new Transaction[previous.length*2];
        System.arraycopy(previous, 0, transactions, 0, previous.length);
    }

    public double getBalance() {
        return this.balance;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    public String toString() {
        return ("Customer: "+customer+". Balance: "+balance);
    }
    public void setCustomer(Customer c) {
        customer=c;
    }

    public void setBalance(double balance) { //assuming we can add this
        this.balance = balance;
    }

    public abstract double deposit(double amount);
    public abstract double withdraw(double amount);
    public abstract void addInterest();
    public abstract Transaction[] getTransactionList(); //added this
}









/*public abstract class Account {
    private Customer customer;
    private double balance;
    private static final int firstAccountNumber=0;
    private int accountNumber;
    private Transaction[] transactions;
    private static final int INITSIZE=25;

    public Account(Customer customer, double balance) {
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
    public void setCustomer(Customer c) {
        customer=c;
    }




}*/