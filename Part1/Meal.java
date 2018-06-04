public abstract class Meal extends Expense {
	private int numMeals;

	public Meal (String description, int meals) {
		super(description);
		this.numMeals = meals;
	}

	public int getNumberOfMeals() {
		return this.numMeals;
	}
}