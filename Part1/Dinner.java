public class Dinner extends Meal {
	private final double allowance;

	public Dinner(String description, int meals) {
		super(description, meals);
		this.allowance = 31.80;
	}

	public double getAmount() {
		return this.allowance*getNumberOfMeals();
	}
}