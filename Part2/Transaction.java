import java.util.Date;

public class Transaction {
    private byte type; //initialize variables
    private double amount;
    private Date date;
    private double fees;
    private String description;

    public Transaction(byte type, double amount, Date date, double fees, String description) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.fees = fees;
        this.description = description;
    }
    public String processTransaction() {
        if (type==0) {
            return("Deposit. Amount: "+amount+". Date: "+date+". Fees: "+fees+". "+description+".");
        }
        else if (type==1) {
            return("Withdraw. Amount: "+amount+". Date: "+date+". Fees: "+fees+". "+description+".");
        }
        else if (type==2) {
            return("Added Interest. Amount: "+amount+". Date: "+date+". Fees: "+fees+". "+description+".");
        }
        else {
            return("Invalid transaction type.");
        }
    }

}