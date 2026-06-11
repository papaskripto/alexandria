import java.util.ArrayList;

public class Main {

	public static void main (String [] args) {

		Book book2 = new Book ("John Oloo", "Ous");
		Book book1 = new Book ("Ada Lovelace", "Lace");

		System.out.println (book1);
		System.out.println (book2);

		ArrayList<Book> books = new ArrayList<>();

		books.add (book1);
		books.add (book2);

		System.out.println (books);

		Library lib = new Library (books);
		System.out.println (lib);
	}
}

class Book {

	private String title;
	private String author;

	public Book (String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle () {
		return this.title;
	}

	public void setTitle (String newTitle) {
		this.title = newTitle;
	}

	public String getAuthor () {
		return this.author;
	}

	public void setAuthor (String newAuthor) {
		this.author = newAuthor;
	}

	public String toString () {
		return this.title + ": " + this.author;
	}
}

class User {

	private String name;

	public User (String name) {
		this.name = name;
	}

	public String getName () {
		return this.name;
	}

	public void setName (String newName) {
		this.name = newName;
	}

	public String toString () {
		return this.name;
	}
}

class Library {

	private ArrayList<Book> books;

	public Library (ArrayList<Book> books) {
		this.books = books;
	}

	public void addBook (Book book) {
		books.add (book);
	}

	public void borrowBook (Book book) {
		books.remove (book);
	}

	public void returnBook (Book book) {
		books.add (book);
	}

	public String toString () {
		String res = "This Library has:\n";
		for (Book bk : books) {
			res += bk + "\n";
		}
		return res;
	}
}
