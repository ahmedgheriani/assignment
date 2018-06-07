import java.util.Date;

public class CheckingAccount extends Account {

    public CheckingAccount(Customer c, double balance) { //contructor
        super(c, balance);
        this.transactions = new Transaction[INITSIZE]; //array to hold transactions
    }

    public double deposit(double amount) { // method to deposit funds to account
        double balance = getBalance() + amount; //adds amount to balance

        int i = 0;
        while (i < transactions.length) { //iterates through array
            if (transactions[transactions.length-1] != null) { // if the last element is not empty, this array is copied to a new one double the size
                reallocate();
                break;
            }

            if (transactions[i] == null) { //if element i contains no objects (null) then the transaction is added to said element
                transactions[i] = new Transaction((byte)0, amount, new Date(), getCustomer().getCheckCharge(), "Deposit");
                break;
            } else {
                i++; //to iterate
            }
        }

        return balance; //return new balance
        /*if we can use a set method, remove the return above this line, uncomment below, and change return type from double to void
        setBalance(balance);
         */
    }

    public double withdraw(double amount) { //method to withdraw funds from account
        double balance = getBalance(); //initializes variable "balance" and adds amount from getBalance()

        if (getCustomer() instanceof Student) { //if the customer is a student...
            if (amount > balance) { //if amount to withdraw is greater than balance
                System.out.println("Cannot withdraw this much. No overdraft for students.");  //then funds are not withdrawn
            } else {
                balance -= (amount + .02); //otherwise funds are withdrawn with the .02 fee
            }

        } else if (getCustomer() instanceof  Adult) { //else if the customer is an adult...
            if (amount > (balance + 500)) { //if amount to withdraw is greater than the balance + 500 (the overdraft limit)
                System.out.println("Cannot withdraw this much."); //then funds are not withdrawn
            } else {
                balance -= (amount + .03); //otherwise funds are withdrawn with .03 fee
                if (balance < 0) { //if balance is then less than 0 (overdraft)...
                    balance -= 25; //a further 25 is withdrawn as a penalty
                }
            }

        } else if (getCustomer() instanceof Senior) { //else if the customer is a senior...
            if (amount > (balance + 500)) {
                System.out.println("Cannot withdraw this much."); //if amount would take balance to under -500, cannot withdraw amount
            } else {
                balance -= (amount + .01); //otherwise the amount is withdrawn with the .01 fee

                if (((Senior) getCustomer()).getIsVIP()) { //if the senior is VIP then...
                    if (balance > -100) {
                        balance -= 0; //if after withdrawal the balance is over -100, no penalty
                    } else if (balance < -100) {
                        balance -= 5; //else if the new balance is under -100, a $5 penalty is taken
                    }
                } else if (((Senior) getCustomer()).getIsVIP() == false) { //else if the senior is not VIP...
                    if (balance < 0) {
                        balance -= 10; //if the balance is under 0 (overdraft), a $10 penalty is taken
                    } else {
                        balance -= 0; //otherwise no penalty
                    }
                }
            }
        }
        return balance; //return new balance
        /*if we can use a set method, remove the return above this line, uncomment below, and change return type from double to void
        setBalance(balance);
         */
    }

    public void addInterest() {
        double interestAdd = (getCustomer().getSavingsInterest()) * getBalance();
        setBalance(getBalance() + interestAdd); //assuming we use a setBalance method
    }

    public Transaction[] getTransactionList() { //returns list of transactions
        return transactions;
    }
}
