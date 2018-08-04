
public class Member extends Book {
	private static String member_name;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String member_name) {
		this.member_name = member_name;
	}
	public String getmember()
	{
		return this.member_name;
	}
	public static void main(String[] args) {
		Member m1 = new Member("Dhiren");
	}

}
