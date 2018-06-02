public class Airfare extends Transportation {
	private final double amount;

	public Airfare(String description, String destination, double amount) { //constructor that takes parent constructor + amount
		super(description, destination);
		this.amount = amount;
	}

	public double getAmount() { //method inherited from parent class
		return this.amount;
	}
}