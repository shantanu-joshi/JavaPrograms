class Library
{
	String[] books;
	int no_of_books;
	Library()
	{
		this.books = new String[100];
		this.no_of_books = 0;
	}
	
	
	
	void addBook(String book)
	{
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println("Adding books\n");
		
	}
	
	
	void showAvialbooks()
	{
		System.out.println("Available books are.....\n");
		for(String book :this.books)
		{
			if(book==null)
			{
				continue;
			}
			System.out.println("* "+book);
		}
	}
	
	void returnBook(String book)
	{
		addBook(book);
	}
	
	void issueBook(String book)
	{
		
			for(int i=0;i<this.books.length;i++)
			{
				if(this.books[i].equalsIgnoreCase(book))
				{
				System.out.println("the book has been issued");
				this.books[i] = null;
				return;
			}
			}
			
			System.out.println("Not in library");
		}
		
}
public class OnlineLibrary {
	public static void main(String[] args) {
		Library centrallib = new Library();
		centrallib.addBook("The subtle art of not giving a fuck");
		centrallib.addBook("Introduction to Programming");
		centrallib.addBook("the joy of work");
		centrallib.showAvialbooks();
		centrallib.issueBook("the joy of work");
		centrallib.showAvialbooks();
		centrallib.returnBook("the joy of work");
		centrallib.showAvialbooks();
	}
	

}
