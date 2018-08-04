package lti.org;

public class Manager extends Emplyoee {
	private double commission;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double commision) {
		super(empName, salary);
		this.commission = commision;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commiision " + commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}

}
