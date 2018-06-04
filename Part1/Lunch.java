public class Lunch extends Meal {
	private final double allowance;

	public Lunch(String description, int meals) {
		super(description, meals);
		this.allowance = 11.35;
	}

	public double getAmount() {
		return this.allowance*getNumberOfMeals();
	}
}