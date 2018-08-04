package lti.bank;

public class Transaction {
	protected String type;
	protected double amount;
	protected double balance;
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public Transaction(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
}
