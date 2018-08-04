package companyassignment;
public class Books {
	private int bookCount=0;
	String mybook;
	Members member;
	public Books(String myboo) {
		mybook=myboo;
	}
	public void issueBook(Members member) {
		if(bookCount==0) {
			this.member=member;
			member.setBooks(mybook);
			System.out.println(mybook+" given: Mr."+ member.name);
			bookCount++;
		}
		else
			System.out.println(mybook+" Not available: Mr."+ member.name);
	}
	public void getMembers() {
		System.out.println(member.name);
	}
	public void returnBook() {
		bookCount=0;
		member.removeBooks(mybook);
		System.out.println(mybook+" returned by: Mr."+member.name);
	}
	
}
