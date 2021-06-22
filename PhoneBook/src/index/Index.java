package index;

import java.util.Scanner;

public class Index {

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
		/*
 •	Add new entries 
•	Search for an existing entry
•	Search by first name *
•	Search by last name *
•	Search by full name *note name is not unique therefore the result should be an array of Person Objects.
•	Search by telephone number
•	Search by city or state
•	Delete a record for a given telephone number
•	Update a record for a given telephone number
•	Show all records in asc order *note you will need to research sorting on an array.
•	An option to exit the program 

		 */
		
		switch (option) {
		case 1:
			System.out.println("First Name: ");
			String fname = in.nextLine();
			searchFirstName(fname);
			break;
		case 2:
			System.out.println("Last Name: ");
			break;
		case 3:
			System.out.println("Full Name: ");
			break;
		case 4:
			System.out.println("Phone Number: ");
			break;
		case 5:
			System.out.println("City: ");
			break;
		case 6:
			System.out.println("State: ");
			break;
		case 7:
			System.out.println("New Entry");
			break;
		case 8:
			System.out.println("Select an Entry to Delete");
			break;
		case 9:
			System.out.println("Select an Entry to Update");
			break;
		case 10:
			System.out.println("Displaying All Records");
			break;
		case 11:
			System.out.println("Exiting Program");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		in.close();
	}

	private static void searchFirstName(String fname) {
	
		
		
	}
	
	

}
