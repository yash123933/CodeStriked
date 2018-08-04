import lti.bank.Bank;
import lti.bank.Transaction;
/**
 * This is the class of account.
 * @author yash dhiren
 * @version 0.0
 */
public abstract class Account implements Bank{
	private int acntNo;
	private String holder;
	protected double balance;
	
	protected Transaction[] txns;
	protected int idx;

	private static int autogen = INIT_ACNT_NO;

	public Account() {

	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
		
		txns = new Transaction[10];
		txns[idx ++]= new Transaction("OB",balance,balance);
	}

	public void summary() {
		System.out.println("a/c no: " + acntNo);
		System.out.println("holder: " + holder);
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx ++]= new Transaction("CR",amount,balance);

	}


	
	public void statement() {
		System.out.println("Statement of a/c"+acntNo);
		for(int i=0;i<idx;i++)
			System.out.println(txns[i]);
	}
}
