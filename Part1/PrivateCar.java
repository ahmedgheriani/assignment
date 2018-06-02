public class PrivateCar extends Transportation {
	private int distance;
	private final double rate;

	public PrivateCar(String description, String destination, int distance) { //constructor that takes parent constructor + distance
		super(description, destination);
		this.distance = distance;
		this.rate = .427;
	}

	public int getDistance() { //returns distance
		return this.distance;
	}

	public double getAmount() { //method inherited from parent class
		return this.rate*this.distance;
	}
}