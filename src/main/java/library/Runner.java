package library;

public class Runner {

	public static void main(String[] args) {

		Library library = new Library();
		System.out.println(library.registerPerson("Josh", "23/02/1995"));
		System.out.println(library.registerPerson("Jonny", "23/02/1995"));

		Book book1 = new Book("Harry Potter and the Philosophers Stone", "Bloomsbury Publishing", "J.K Rowling", 100,
				12345);
		Book book = null;
		Book book2 = new Book("Harry Potter and the Chamber of Secrets", "Bloomsbury Publishing", "J.K Rowling", 200,
				67891);
		Book book3 = new Book("Harry Potter and the Prisoner of Askaban", "Bloomsbury Publishing", "J.K Rowling", 300,
				23456);

		try {
			library.addItem(book1);
		} catch (ItemNullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			library.addItem(book2);
		} catch (ItemNullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			library.addItem(book3);
		} catch (ItemNullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			library.addItem(book);
		} catch (ItemNullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		library.printMembersList();

		library.updatePersonById(1, "Joshua", "23/02/1995");

		System.out.println("");
		System.out.println("--Updated Members List--");
		library.printMembersList();

	}

}
