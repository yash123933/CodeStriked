
public class Employee {
	private String name;
	private static Employee employee;
	
	private Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static Employee getInstance() {
		if(employee == null)
		{
			employee = new Employee("Yash");
			return employee;
		}
		else 
			return employee;
	}
}
