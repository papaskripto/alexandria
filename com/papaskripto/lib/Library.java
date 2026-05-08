import com.papaskripto.lib.Book;
import java.util.HashMap;

public class Library {

	private HashMap<String, Book> store;

	public Library () {
		this.store = new HashMap<>();
	}

	// Add a book to the store (library) by its name
	public void addBook (Book book) {
		String bookName = book.getName ();
		if (this.store.containsKey (bookName)) {
			System.out.println (bookName + " exists!");
		} else {
			this.store.put (bookName, book);
		}
	}

	public Book getBook (String bookName) {
		return this.store.get (bookName);
	}

	// Remove a book from the store (library) by its name
	public void removeBook (Book book) {
		String bookName = book.getName ();
		if (this.store.containsKey (bookName)) {
			this.store.remove (bookName);
		} else {
			System.out.println (bookName + " does not exist!");
		}
	}
