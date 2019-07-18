package arrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	public static SimpleMobilePhone mobilePhone = new SimpleMobilePhone();
	
	public static void main(String[] args) {
		
		printInstructions();
		
		boolean quit = false;
		while(!quit) {
			int optionNumber;
			System.out.println("Choose Next Option");
			optionNumber = scan.nextInt();
			scan.nextLine();
			
			switch(optionNumber) {
				case 0:
					printInstructions();
					break;
				case 1:
					mobilePhone.showContactList();
					break;
				case 2:
					addContact();
					break;
				case 3:
					modifyContact();
					break;
				case 4:
					deleteContact();
					break;
				case 5:
					searchForContact();
					break;
				case 6:
					quit = true;
					break;
			}
		}
	}
	
	public static void printInstructions() {
		System.out.println("Press ");
		System.out.println("0 - to print choice options");
		System.out.println("1 - to print Contacts list");
		System.out.println("2 - to add new contact");
		System.out.println("3 - to modify  contact");
		System.out.println("4 - to delete contact");
		System.out.println("5 - to search for a contact");
		System.out.println("6 - to exit the application");
	}
	
	public static void addContact() {
		
		System.out.println("Please enter new contact name");
		String contactName = scan.nextLine();
		
		System.out.println("Please enter a new phone number");
		String phoneNumber = scan.nextLine();
		
		Contacts contact = new Contacts(contactName, phoneNumber);
		mobilePhone.addContact(contact);
	}
	
	public static void modifyContact() {
		System.out.println("Modify contact: ");
		String oldContact = scan.nextLine();
		if(mobilePhone.findContact(oldContact)) {
			System.out.println("Enter new contact name: ");
			String newContactName = scan.nextLine();
			mobilePhone.modifyContactName(oldContact, newContactName);
		}else {
			System.out.println("Contact does not exist");
		}
	}
	
	public static void deleteContact() {
		System.out.println("Remove contact: ");
		mobilePhone.removeContact(scan.nextLine());
	}
	
	public static void searchForContact() {
		System.out.println("Search in contacts: ");
		mobilePhone.findContact(scan.nextLine());
	}

}
