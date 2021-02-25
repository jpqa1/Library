package libraryTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import library.Book;
import library.ItemNullPointerException;
import library.Library;

public class LibraryTest {

	private Library library = new Library();

	Book book1 = new Book("Harry Potter and the Philosophers Stone", "Bloomsbury Publishing", "J.K Rowling", 100,
			12345);
	Book book2 = new Book("Harry Potter and the Chamber of Secrets", "Bloomsbury Publishing", "J.K Rowling", 200,
			67891);
	Book book3 = new Book("Harry Potter and the Prisoner of Askaban", "Bloomsbury Publishing", "J.K Rowling", 300,
			23456);

	@Test
	public void testAddItem() throws ItemNullPointerException {
		boolean expected = true;
		boolean actual = library.addItem(book1);
		assertEquals(expected, actual);
	}

}
