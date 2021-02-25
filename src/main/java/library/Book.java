package library;

public class Book extends Items {

	private int isbn;

	public Book(String title, String publisher, String author, int pages, int isbn) {
		super(title, publisher, author, pages);
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Override
	public double duration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
