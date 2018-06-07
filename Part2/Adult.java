public class Adult extends Customer {
    //constructor
    public Adult(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
    //getters for interest and charges
    public double getSavingsInterest() {
        return 0.03;
    }
    public double getCheckInterest() {
        return 0.01;
    }
    public double getCheckCharge() {
        return .03;
    }
}