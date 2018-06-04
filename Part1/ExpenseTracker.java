
public class ExpenseTracker {
	private Expense[] expenses;
	private int size; //keeps track of the number of elements

	public ExpenseTracker(int capacity) {
		expenses = new Expense[capacity];
		size = 0;
	}

	public boolean add(Expense e) {
		if (this.size < expenses.length) {
			expenses[size] = e;
			size++;
			return true;
		} 

		System.out.println("Array is full.");
		return false;
	}

	public double getTotal() {
		double total = 0;
		for (Expense e : expenses) {
			if (e != null) {
				total += e.getAmount();
			} else {
				total += 0;
			}
		}
		return total;
	}

}
