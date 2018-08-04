package lti.bank;
public class TestAccount {

	public static void main(String[] args) {
		Bank ac=AccountFactory.openAccount("currentt","Polo");
		ac.deposit(3000);
		try {
			ac.withdraw(4000);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ac.deposit(3000);
		ac.deposit(4000);
		ac.deposit(5000);
		ac.deposit(6000);
		ac.deposit(8000);
		try {
			ac.withdraw(700000);
		} catch (BalanceException e) {
			e.printStackTrace();	// for developeers to trole shoot	
			}
		finally {
			System.out.println("executed");
		}
		ac.statement();
//		Savings savings=new Savings("Dhiren");
//		savings.deposit(2000);
//		savings.getBalance();
//		Current current=new Current("Dhiren");
//		
//		current.deposit(5000);
//		current.withdraw(19000);
//		current.deposit(11000);
//		System.out.println(current.getBalance());
		
	}

}
