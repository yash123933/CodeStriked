package lti.reflect;

import java.security.BasicPermission;

public class Customer {
	private String name;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name) {

		this.name = name;
	}

	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission(new BasicPermission("stay away") {
		});
		System.out.println("name :" + name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name :" + name;
	}

}
