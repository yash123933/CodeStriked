package lti.lib;
import java.util.ArrayList;


public class Members {
	public String name;
	private ArrayList<String> items =new ArrayList<String>();
	public Members(String name) {
		this.name=name;
	}
	public void setBooks(String book)
	{
		items.add(book);
	}
	public void getBooks() {
		System.out.print("Mr."+name+" have books:");
		for(String i : items) {
			System.out.print(i+" ");
		}
	}
	public void removeBooks(String bookname) {
		items.remove(bookname);
	}
}
