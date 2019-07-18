package arrayList;

import java.util.ArrayList;

public class SimpleMobilePhone {

	private ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

	public void showContactList() {
		System.out.println("Viewing contacts list: ");
		for(int i = 0; i < contactsList.size(); i++) {
			System.out.println((i+1)+ ". " + "Contact name: " + contactsList.get(i).getName()
					+ " Phone Number: " + contactsList.get(i).getPhone());
		}
	}

	public void addContact(Contacts contact) {
		int indexx = findContactPosition(contact);
		if (indexx > 0) {
			System.out.println("Contact already exist");
		} else {
			contactsList.add(contact);
			System.out.println("Contact has been added");
		}
	}

	public void modifyContactName(String searchItem, String newItem) {
		if(findContactPosition(searchItem) >= 0) {
			Contacts contacta = contactsList.get(findContactPosition(searchItem));
			contacta.setName(newItem);
		}else {
			System.out.println("Contact " + searchItem + " does not exist");
		}
	}

	public void removeContact(String searchItem) {
		int indexx = findContactPosition(searchItem);
		if (indexx < 0) {
			System.out.println("Contact does not exist");
		} else {
			Contacts contacta = contactsList.get(indexx);
			contactsList.remove(indexx);
			System.out.println(contacta.getName() + " was successfully removed");
		}
	}

	private int findContactPosition(String searchItem) {
		for (int i = 0; i < contactsList.size(); i++) {
			Contacts contacta = contactsList.get(i);
			if (contacta.getName().equals(searchItem)) {
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
			String phoneNummber = contactsList.get(position).getPhone();
			System.out.println("Found contact: " + searchItem + "with the following phone number " + phoneNummber);
			return true;
		}
		System.out.println("Contact " + searchItem + " does not exist");
		return false;
	}
}
