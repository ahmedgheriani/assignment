public class Senior extends Customer {
    //instance variable
    private boolean isVIP;

    //constructor
    public Senior(String firstName, String lastName, int age, boolean isVIP) {
        super(firstName, lastName, age);
        this.isVIP=isVIP;
    }
    //getter for VIP status
    public boolean getIsVIP() {
        return isVIP;
    }
    //getters for interest and charges
    //if statements to determine rate based on VIP status
    public double getSavingsInterest() {
        if (isVIP /*==true?*/) {
            return 0.1;
        }
        else {
            return 0.08;
        }
    }
    public double getCheckInterest() {
        return 0.04;
    }
    public double getCheckCharge() {
        if (isVIP /*==true?*/) {
            return 0;
        }
        else {
            return .01; //1 cent = .01 dollars
        }
    }

}