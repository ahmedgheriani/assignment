public abstract class Expense { //class is abstract
	private String description; 

	public Expense(String description) { //contructor that takes description of expense
		this.description = description;
	}

	public String getDescription() { //returns description
		return this.description;
	}

	public abstract double getAmount(); //abstract method for child classes that returns amount of expense

}