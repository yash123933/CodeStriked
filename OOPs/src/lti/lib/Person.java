package lti.lib;
//In shallow copying there is always a data loss where there is lots to copy. So we perform deep copying which we need to clone every single object. 
public class Person implements Cloneable {

	private String name;
	private int age;

	public Person() {
		this("Anynous", -1);// constructor chanining
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tAge: " + age);
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Polo", 21);
		Person pc = (Person) p1.clone();
		// System.out.println(p1.equals(p2));

		// System.out.println(pc.name);
		// Person p2 = new Person("Polo",21);
		// System.out.println(p1.equals(p2));
		// p1.print();
		// System.out.println(p1.hashCode());
		// System.out.println(p1);//by default tostring gets called
		// Person p=null;
		// for(int c=1;c<=5;c++)
		// p =new Person();
		// System.gc();//request gc not sure
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.name.equals(p.name) && age == p.age)
				return true;
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("person deleted");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "\tAge: " + age;
	}

}
