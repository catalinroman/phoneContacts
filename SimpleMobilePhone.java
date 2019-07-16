package ArrayList;

import java.util.ArrayList;

public class SimpleMobilePhone {

	private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();
	private Contacts contact;

	public void showContactList() {
	}

	public void addContact(Contacts contact) {
		int index = findContactPosition(contact);

		if (index > 0) {
			System.out.println("Contact already exist");
		} else {
			contactsList.add(contact);
		}
	}

	public void modifyContactName(String newItem) {
		contact.setName(newItem);
	}

	public void removeContact(String searchItem) {
		int index = findContactPosition(searchItem);
		if (index < 0) {
			System.out.println("Contact does not exist");
		} else {
			contactsList.remove(index);
		}
	}

	private int findContactPosition(String searchItem) {
		for (int i = 0; i <= contactsList.size(); i++) {
			Contacts contact = contactsList.get(i);
			if (contact.getName().equals(searchItem)) {
				return i;
			}
		}
		return -1;
	}

	private int findContactPosition(Contacts contact) {
		String searchItem = contact.getName();
		return findContactPosition(searchItem);
	}

	public boolean findContact(String searchItem) {
		int position = findContactPosition(searchItem);
		if (position >= 0) {
			return true;
		}
		return false;
	}
}
