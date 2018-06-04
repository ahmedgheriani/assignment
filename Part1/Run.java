public class Run {
	public static void main( String[] args ) {

		ExpenseTracker epro = new ExpenseTracker( 10 );
		epro.add( new PrivateCar( "ACFAS 2004", "Montreal (QC)", 430 ) );
		epro.add( new Airfare( "IWBRA 2005", "Atlanta (GA)", 204.0 ) );
		epro.add( new Breakfast( "IWBRA 2005", 2 ) );
		epro.add( new Lunch( "IWBRA 2005", 3 ) );
		epro.add( new Dinner( "IWBRA 2005", 2 ) );
		System.out.println( "total = " + epro.getTotal() );
	}
}