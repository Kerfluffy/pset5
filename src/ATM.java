/**
 * Just like last time, the ATM class is responsible for managing all
 * of the user interaction. This means login procedures, displaying the
 * menu, and responding to menu selections. In the enhanced version, the
 * ATM class will have the added responsibility of interfacing with the
 * Database class to write and read information to and from the database.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

import java.util.Scanner;

public class ATM {
	BankAccount bankAccount;
	static User user;
	ATM(BankAccount bankAccount, User user) {
		this.bankAccount = bankAccount;
		this.user = user;
	}
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		ATM atm = new ATM(newAccount(), user); 
		atm.bankMenu();
	}
	
	public static BankAccount newAccount() {
		do {
		System.out.println("Enter your personal information below.");
		System.out.println("PIN: ");
			int pin = in.nextInt();
			in.nextLine();
		System.out.println("First Name: ");
			String fname = in.nextLine(); 
		System.out.println("Last Name: ");
			String lname = in.nextLine(); 
		System.out.println("Date of Birth: ");
			String dob = in.nextLine();
		System.out.println("Address: ");
			String address = in.nextLine();
		System.out.println("Phone Number: ");
			String phone = in.nextLine();
		System.out.println("City: ");
			String city = in.nextLine();
		System.out.println("State: ");
			String state = in.nextLine();
		System.out.println("Postal Code: ");
			int postalCode = in.nextInt();
		
		User user = new User(pin, fname, lname, dob, address, phone, city, state, postalCode); 
		
		double balance = 0;

		System.out.print("Account Number: ");
			int accountNumber = in.nextInt();
		in.nextLine();

		return new BankAccount(accountNumber, balance, user);
		}
		while (/* if there is no account */);
	}
	
	public void menu() {
		//switch to check if user wants to continue
		System.out.println("Want to do something else? Enter Y if you want to, enter anything else if else.");
		char choice = in.next().charAt(0); 
			switch (choice) {
				case 'Y':
				bankMenu();
			case 'y':
				bankMenu();
			default:
				System.exit(0);
		}
	}
	
	public void bankMenu() {
		//implement system to check entered number to previous number
		boolean menuSet = true;
		boolean accountNum = true;
		
		int check = 0;
		while (menuSet) {
			while (accountNum) {
				while (check == 0) {
					System.out.print("Enter your account number: ");
					int newNum = in.nextInt();
					if (newNum != this.bankAccount.accountNumber) {
						System.out.println("Please try again.");
					}
					else {
						check++;
					}
				}
				System.out.print("Enter your PIN: ");
				int newPin = in.nextInt();
				if (newPin != this.user.getPIN()) {
					System.out.println("Please try again.");
				}
				else {
					accountNum = false;
				}
			}
					
			//Prompt the user for what action to perform
			System.out.println("Enter the corresponding number:");
			System.out.println("1: Withdraw funds");
			System.out.println("2: Deposit funds");
			System.out.println("3: View balance");
			System.out.println("4: Transfer funds");
			System.out.println("5: View personal information");
			System.out.println("6: Update personal information");
			System.out.println("7: Close account");
			System.out.println("8: Logout");
			
			//loop to check if choice is valid
			int menuLoop = 0;
			while (menuLoop == 0) {
				int menuChoice = in.nextInt(); 
				switch (menuChoice) {
					case 1:
						System.out.print("Enter withdrawl amount: ");
						double withAmount = in.nextInt();
						if (bankAccount.getBalance() == 0) {
							System.out.println("Insufficient funds. Please try again later");
						}
						else {
							this.bankAccount.setBalance(bankAccount.getBalance() - withAmount);
						}
							
						menu();
					case 2:
						System.out.print("Enter deposited amount: ");
						double desAmount = in.nextInt();
						this.bankAccount.setBalance(bankAccount.getBalance() + desAmount);
						
							
						menu();
					case 3:
						System.out.println("Current Balance: $" + bankAccount.getBalance());
						menu();
					case 4:
						//Transfer funds
						System.out.print("Enter amount of funds to transfer: ");
						double transferAmount = in.nextInt();
						if (bankAccount.getBalance() == 0) {
							System.out.println("Insufficient funds. Please try again later");
						}
						else {
							this.bankAccount.setBalance(bankAccount.getBalance() - transferAmount);
						}
					case 5:
						//View personal information
						System.out.println("Your personal information:");
						/* In here, you will most likely print the user's: 
						 * Account Number	
						 * PIN					
						 * Balance			
						 * Last Name		
						 * First Name		
						 * Date of Birth	
						 * Phone Number		
						 * Street Address	
						 * City			 	
						 * State		  	
						 * Postal Code	  	
						 * Account Status	
						 */
					case 6:
						//Update personal information
						System.out.println("What do you want to update?");
						//you can not modify the first or last name as well as date of birth
						//list the previous mentioned personal information, give options
						//once set, loop back to menu
					case 7:
						//Close account
					case 8:
						//logout
					default: 
						System.out.print("That is not a choice. Please try again: ");
				}
			}
		}
	}
}