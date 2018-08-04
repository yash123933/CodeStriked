import lti.org.Emplyoee;
import lti.org.Executive;
import lti.org.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoee e1 = new Emplyoee("polo", 5000);
		e1.payslip();
		Manager mgr = new Manager("Lili", 7000, 2000);
		mgr.payslip();
		Executive executive = new Executive("chili", 6000, 1000);
		executive.payslip();
		executive.getSalary();
		showSalary(mgr);
		showSalary(executive);
	}

	// private static void showSalary(Executive executive) {
	// System.out.println("Executive Salary: "+ executive.getSalary());
	// }
	//
	// private static void showSalary(Manager mgr) {
	// System.out.println("Manager Salary: "+mgr.getSalary());
	// }

	private static void showSalary(Emplyoee emp) {
		if (emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}
}
