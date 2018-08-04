package lti.bank;

public class CurrentTransaction extends Transaction{
	private int overdraft;
	public CurrentTransaction() {
	}

	public CurrentTransaction(String type, double amount, double balance, int overdraft) {
		super(type, amount, balance);
		this.overdraft=overdraft;		
	}

	@Override
	public String toString() {
		return "Transaction [type=" + type + ", amount=" + amount + ", balance=" + balance +" overdraft="+overdraft+"]";
	}
	
	
}
