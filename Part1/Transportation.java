public abstract class Transportation extends Expense {
	private String destination;

	public Transportation(String description, String destination) { //constructor that takes parent constructor + destination
		super(description);
		this.destination = destination;
	}

	public String getDestination() { //returns destination
		return this.destination;
	}

	public abstract double getAmount(); //abstract class for children class (not needed here?)

}