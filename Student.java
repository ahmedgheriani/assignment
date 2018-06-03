public class Student extends Customer {
	//constructor
	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}
	//getters for interest and charges
	public double getSavingsInterest() {
		return 0.07;
	}
	public double getCheckInterest() {
		return 0.03;
	}
	public double getCheckCharge() {
		return 2;
	}
}