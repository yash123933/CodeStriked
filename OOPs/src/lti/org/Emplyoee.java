package lti.org;

public class Emplyoee {
	private int empNo;
	private String empName;
	private double salary;
	private static int autogen;
	static {
		System.out.println("Employee class loaded...");
		autogen = 1001;
	}

	public Emplyoee() {

	}

	public Emplyoee(String empName, double salary) {
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;

	}

	public void payslip() {
		System.out.println("Emp no " + empNo);
		System.out.println("Emp name " + empName);
		System.out.println("Salary " + salary);
	}

	public double getSalary() {
		return salary;
	}
}
