package library;

public abstract class Items {

	private int id;
	private String title;
	private String publisher;
	private String author;
	private int pages;

	public Items(String title, String publisher, String author, int pages) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.pages = pages;
	}

	// overloaded constructor instantiating instances of item that have no author.
	public Items(int id, String title, String publisher, int pages) {
		super();
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.author = null;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Items [title=" + title + ", publisher=" + publisher + ", author=" + author + ", pages=" + pages + "]";
	}

	// Method to calculate lending duration for each instance of Item.
	public abstract double duration();

}
