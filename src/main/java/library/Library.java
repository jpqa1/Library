package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private int personCount = 1;
	private int itemCount = 1;

	private List<Person> membersList = new ArrayList<Person>();
	private List<Items> itemsList = new ArrayList<Items>();
	private List<Items> checkedOutItemsList = new ArrayList<Items>();

	// Print out membersList
	public void printMembersList() {
		for (Person person : membersList) {
			System.out.println(person.toString());
		}
	}

	// Check out item
	public boolean checkoutItem(int id) {

		for (Items item : itemsList) {
			if (item.getId() == id) {
				checkedOutItemsList.add(item);
				itemsList.remove(item);
				return true;
			}
		}

		return false;
	}

	// Check in Item
	public boolean checkinItem(int id) {

		for (Items item : checkedOutItemsList) {
			if (item.getId() == id) {
				itemsList.add(item);
				checkedOutItemsList.remove(item);
				return true;
			}
		}

		return false;
	}

	// Add Item
	public boolean addItem(Items item) throws ItemNullPointerException {
		if (item == null) {
			throw new ItemNullPointerException("Test!!!!");
		}

		item.setId(itemCount++);
		return this.itemsList.add(item);

	}

	// Remove Item
	public boolean removeItem(Items item) {
		return this.itemsList.remove(item);
	}

	// Update Item
	public boolean updateItemById(int id, String newTitle, String newPublisher, String newAuthor, int newPages) {
		for (Items item : itemsList) {
			if (item.getId() == id) {
				item.setTitle(newTitle);
				item.setTitle(newAuthor);
				item.setPublisher(newPublisher);
				item.setPages(newPages);
				return true;
			}
		}

		return false;
	}

	// Register Person
	public boolean registerPerson(String name, String dob) {
		Person person = new Person(personCount++, name, dob);
		return this.membersList.add(person);
	}

	// Delete Person
	public boolean deletePerson(int id) {
		for (Person person : membersList) {
			if (person.getId() == id) {
				return membersList.remove(person);
			}
		}

		return false;
	}

	// Update Person
	public boolean updatePersonById(int id, String newName, String newDob) {
		for (Person person : membersList) {
			if (person.getId() == id) {
				person.setName(newName);
				person.setdOB(newDob);
				return true;
			}
		}

		return false;
	}

}
