public abstract class Customer {
    //instance variables
    private String firstName;
    private String lastName;
    private int age;
    private int lastCustomerNumber=9999;
    private int customerNumber;

    //constructor
    public Customer(String firstName, String lastName, int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.customerNumber=lastCustomerNumber;
        lastCustomerNumber++;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    //compare two customer numbers to see if they are the same
    public boolean equals(Customer other) {
        if (this.customerNumber==other.customerNumber) {
            return true;
        }
        return false;
    }

    //print customer info
    public String toString() {
        return ("Customer: "+firstName+" "+lastName+". Age: "+age+". Customer Number: "+customerNumber+".");
    }

    //abstract methods to be defined in subclasses
    public abstract double getSavingsInterest();
    public abstract double getCheckInterest();
    public abstract double getCheckCharge();
}