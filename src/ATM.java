import java.util.Scanner;

public class ATM {
	static Scanner in = new Scanner(System.in);
	private BankAccount account;
	
	public ATM(BankAccount account) {
		this.account = account;
	}
	
	public static void main(String args[]) {
		ATM atm = new ATM(new BankAccount(12, 12, 12, new AccountHolder(12, "Aaron", "908", "Address")));
	    
	}
	
	public static BankAccount newAccount() {
		int SSN; String name; String phone; String address;
		System.out.println("Please enter your SSN: ");
		SSN = in.nextInt();
		in.nextLine();
		System.out.println("Please enter your full name: ");
		name = in.nextLine();
		System.out.println("Enter your phone number: ");
		phone = in.nextLine();
		System.out.println("Enter your address: ");
		address = in.nextLine();
		
		AccountHolder user = new AccountHolder(SSN, name, phone, address);
		
	}
}