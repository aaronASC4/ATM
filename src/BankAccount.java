public class BankAccount {
	private double balance;
	private int accountNumber;
	private int pin;
	private AccountHolder owner;
	
	public BankAccount(double balance, int accountNumber, int pin, AccountHolder owner) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.owner = owner;
	}
	
	public double withdraw(double amount) {
		this.balance = balance - amount; 
		return this.balance;
	}
	
	public double deposit(double amount) {
		this.balance = balance + amount; 
		return this.balance;
	}
	
public double getBalance() {
	return balance;
}

public int getAccountNumber() {
	return accountNumber;
}

public double getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

}