
public class Book extends Lib {
	private static String s_book_name;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String book_name)
	{
		this.s_book_name=book_name;
		//System.out.println(s_book_name);
	}
	public String getbookname()
	{
		return this.s_book_name;
		
		
	}
	public static void main(String[] args) {
		Book b1 = new Book("Half Girlfriend");

	}
}



	
