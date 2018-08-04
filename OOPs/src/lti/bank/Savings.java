package lti.bank;

public class Savings extends Account {
	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
		txns = new Transaction[10];
		txns[idx ++]= new Transaction("OB",balance,balance);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		super.deposit(amount);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			txns[idx++] = new Transaction("Dr", amount, balance);
		} else
			throw new BalanceException("Insufficfent funds");
	}

}
