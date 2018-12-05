import java.util.Scanner;

/**
 * Just like last time, the User class is responsible for retrieving
 * (i.e., getting), and updating (i.e., setting) user information.
 * This time, though, you'll need to add the ability to update user
 * information and display that information in a formatted manner.
 * 
 * Most of the functionality for this class should have already been
 * implemented last time. You can always reference my Github repository
 * for inspiration (https://github.com/rwilson-ucvts/java-sample-atm).
 */

public class User {
	
	private int pin;
	private String fname;
	private String lname;
	private String dob;
	private String address;
	private String phone;
	private String city;
	private String state;
	private int postalCode;
	private Scanner in;
	
	public User(int pin, String fname, String lname, String dob, String address, String phone, String city, String state, int postalCode) {
		this.pin = pin;
		this.fname = fname;
		this.dob = dob;
		this.address = address;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode; 
	}
	
	/* get section */
	public int getPIN() {
		return pin;
	}
	
	public String getFirstName() {
		return fname;
	}
	public String getLastName() {
		return lname;
	}
	
	public String getDOB() {
		return dob;
	}
	
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPostalCode() {
		return postalCode;
	}
	
	/* set section */
	public void setPIN(int pin) {
		System.out.println("Enter existing PIN: ");
			in = new Scanner(System.in);
			int oldPIN = in.nextInt();
			if (oldPIN == pin) {
				this.pin = pin;
			}
	}
	public void setFName(String fname) {
		if (fname == User.(fname)) {
			this.fname = fname;
		}
		else {
			System.out.println("You can not modify your first name.");
		}
		
	}
	public void setLName(String lname) {
		if (i = i /* fill in something that makes sense */) {
			this.lname = lname;
		}
		else {
			System.out.println("You can not modify your last name.");
		}
		
	}
	public void setDOB(String dob) {
		if (i = i /* fill in something that makes sense */) {
			this.dob = dob;
		}
		else {
			System.out.println("You can not modify your date of birth.");
		}
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
}