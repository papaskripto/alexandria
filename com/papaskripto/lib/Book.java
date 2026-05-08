public class Book {

	private String name;
	private int published;
	private String content;

	public Book (String name, String content, int published) {
		this.name = name;
		this.content = content;
		this.published = published;
	}

	public String getName () {
		return this.name;
	}

	public void setName (String newName) {
		this.name = newName;
	}

	public int getPublished () {
		return this.published;
	}

	public void setPublished (int newPublished) {
		this.published = newPublished;
	}

	public String getContent () {
		return this.content;
	}

	public void setContent (String newContent) {
		this.content = newContent;
	}

	public String toString () {
		return "Here is your book: " + this.name + " (" + this.published + "\n"
			+ this.content;
	}
}
