package lti.bank;
public class Current extends Account {
	private int Overdraft;
	public Current() {
	}

	public Current(String holder) {
		super(holder, MIN_CUR_BAL);
		this.Overdraft=OVERDRAFT_AMT;
		txns = new Transaction[10];
		txns[idx ++]= new CurrentTransaction("OB",balance,balance,Overdraft);
	}

	@Override
	public void deposit(double amount) {
			Overdraft += amount;
			if (Overdraft > OVERDRAFT_AMT) {
				balance += Overdraft - OVERDRAFT_AMT;
				Overdraft = OVERDRAFT_AMT;
			}
			txns[idx ++]= new CurrentTransaction("CR",amount,balance,Overdraft);
		}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance + Overdraft)) {
			balance -= amount;
			if (balance < MIN_CUR_BAL) {
				Overdraft += balance;
				balance = MIN_CUR_BAL;
			}
			txns[idx++] = new CurrentTransaction("DR", amount, balance, Overdraft);
		} else
			throw new BalanceException("Insufficfent funds");
	}

}
