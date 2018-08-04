package lti.org;

public class Executive extends Emplyoee {
	private double bonus; 
	public Executive() {
		// TODO Auto-generated constructor stub
	}
	public Executive(String empName, double salary, double bonus) {
		super(empName, salary);
		this.bonus = bonus;
	}
	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Executive bonus: "+ bonus);
	}
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+bonus;
	}

}
