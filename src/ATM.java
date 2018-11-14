import java.util.Scanner;

public class ATM {
	private Scanner in;
	private BankAccount account;
	
	ATM(BankAccount account) {
		this.account = account;
	}
	
	public static void main(String args[]) {
		ATM atm = new ATM(new BankAccount(12, 12, 12, new AccountHolder(12, "Aaron", "908", "Address")));
	    atm.run();
	}
	
	public void run() {
		in = new Scanner(System.in);
		
		// do all the stuff
		// ask user for account #
		System.out.println("Enter your account number: ");
		int validAN = in.nextInt();
		// ask user for pin
		// validate account/pin
		if (accountNumber == validAN) {
			
		}
		// if valid, show menu
		
		
		in.close();
	}
	
//	public static BankAccount newAccount() {
//		int SSN; String name; String phone; String address;
//		System.out.println("Please enter your SSN: ");
//		SSN = in.nextInt();
//		in.nextLine();
//		System.out.println("Please enter your full name: ");
//		name = in.nextLine();
//		System.out.println("Enter your phone number: ");
//		phone = in.nextLine();
//		System.out.println("Enter your address: ");
//		address = in.nextLine();
//		in.close();
//		AccountHolder owner = new AccountHolder(SSN, name, phone, address);		
//		
//		return account;
//		
//	}
}