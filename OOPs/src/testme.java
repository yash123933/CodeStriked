import lti.lib.Books;
import lti.lib.Members;

public class testme {

	public static void main(String[] args) {
		Books ak=new Books("OOps");
		Books ak1=new Books("c++");
		Books ak2=new Books("VisualBasic");
		Members members=new Members("yash");
		Members members1=new Members("yash1");
		ak.issueBook(members);
		ak.issueBook(members);
		ak.issueBook(members1);
		ak.returnBook();
		ak.returnBook();
		ak.issueBook(members1);
		ak1.issueBook(members);
		ak2.issueBook(members);
		members.getBooks();
	}

}
