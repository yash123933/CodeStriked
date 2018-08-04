
public class Lib {
	private String abc;

	public static void main(String[] args) {
		Book b1 = new Book("Sachin untold story");
		System.out.println(b1.getbookname());
		Member m1 = new Member("Dhiren");
		System.out.println(m1.getbookname());
		
		Book b2 = new Book("Sachinssss untold story");
		System.out.println(b1.getbookname());
		Member m2 = new Member("Dhiren");
		System.out.println(m2.getbookname());
	}

	public String getmember() {
		return this.abc;
	}
}
