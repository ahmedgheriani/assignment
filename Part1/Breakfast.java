public class Breakfast extends Meal {
	private final double allowance;

	public Breakfast(String description, int meals) {
		super(description, meals);
		this.allowance = 11.55;
	}

	public double getAmount() {
		return this.allowance*getNumberOfMeals();
	}
}