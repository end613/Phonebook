	package index;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		displayMenu();

	}

	public static void displayMenu() {

		Scanner in = new Scanner(System.in);

		System.out.println("Phonebook\n");
		System.out.print("Please select an option: \n");

		System.out.println("\n1. Search by First Name");
		System.out.println("2. Search by Last Name");
		System.out.println("3. Search by Full Name");
		System.out.println("4. Search by Phone Number");
		System.out.println("5. Search by City");
		System.out.println("6. Search by State");
		System.out.println("7. Add a New Entry");
		System.out.println("8. Delete an Entry");
		System.out.println("9. Update an Entry");
		System.out.println("10. Display All Records");
		System.out.println("11. Exit Program");
		
		int option = in.nextInt();
		in.nextLine();

		switch (option) {
		case 1:
			System.out.println("First Name: ");
			String fname = in.nextLine();
			searchFirstName(fname);
			break;
		case 2:
			System.out.println("Last Name: ");
			String lname = in.nextLine();
			searchLastName(lname);
			break;
		case 3:
			System.out.println("Full Name: ");
			fname = in.nextLine();
			lname = in.nextLine();
			searchFullName(fname, lname);
			break;
		case 4:
			System.out.println("Phone Number: ");
			String phonenumber = in.nextLine();
			searchPhoneNumber(phonenumber);
			break;
		case 5:
			System.out.println("City: ");
			String city = in.nextLine();
			searchCity(city);
			break;
		case 6:
			System.out.println("State: ");
			String state = in.nextLine();
			searchState(state);
			break;
		case 7:
			System.out.println("New Entry");
			newEntry();
			break;
		case 8:
			System.out.println("Select an Entry to Delete");
			deleteEntry();
			break;
		case 9:
			System.out.println("Select an Entry to Update");
			updateEntry();
			break;
		case 10:
			System.out.println("Displaying All Records");
			displayRecords();
			break;
		case 11:
			System.out.println("Exiting Program");
			exitProgram();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		in.close();
	}

	private static void exitProgram() {
		// TODO Auto-generated method stub
		
	}

	private static void displayRecords() {
		Phonebook display = new Phonebook(0);
		System.out.println(display);
	}

	private static void updateEntry() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteEntry() {
		// TODO Auto-generated method stub
		
	}

	private static void newEntry() {
		// TODO Auto-generated method stub
		
	}

	private static void searchState(String state) {
		// TODO Auto-generated method stub
		
	}

	private static void searchCity(String city) {
		// TODO Auto-generated method stub
		
	}

	private static void searchPhoneNumber(String phoneNumber) {
		// TODO Auto-generated method stub
		
	}

	private static void searchFullName(String fname, String lname) {
		// TODO Auto-generated method stub
		
	}

	private static void searchLastName(String lname) {
		// TODO Auto-generated method stub
		
	}

	private static void searchFirstName(String fname) {
	
		
		
	}
	
	

}
