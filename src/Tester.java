/**
 * This class has only one responsibility: start the ATM program!
 */

public class Tester {
	
	/**
	 * Main method.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		ATM atm = new ATM(
				new BankAccount(						// create new BankAccount
					0,							// initial balance is 0
					new User(						// create new User
						1234,						// PIN is 1234
						"Ryan Wilson",					// name is Ryan Wilson
						"January 1, 1970",				// date of birth is January 1, 1970
						"123 Main St., Scotch Plains, NJ 07076"		// address is 123 Main St., Scotch Plains, NJ 07076
					)
				)
			);
			
			// TODO
			
			// you need to start the program by calling some method of the ATM class
		/*
		 * Rather than hard coding one or more BankAccount objects, you'll need to read them in
		 * from our very primitive database (i.e., a flat-file). After making changes, of course,
		 * you'll need to update the database accordingly.
		 */
	}
}