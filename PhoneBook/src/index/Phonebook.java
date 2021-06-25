package index;

public class Phonebook {
	
	Contact everett = new Contact("Everett", "Nicholas", "De Bree", "5622429216", "Riverside", "everett.debree@gmail.com", 
									"3917 Pierce St",  "CA", "92505");
	
	private static int entry;
	Contact[] phonebook;
	
	public Phonebook(int entry) {
		this.setEntry(entry);
		this.getPhonebook();
		phonebook = new Contact[5];
		phonebook[0] = everett;
	}
	
	

	public Contact[] getPhonebook() {
		return phonebook;
	}



	public void setPhonebook(Contact[] phonebook) {
		this.phonebook = phonebook;
	}



	public static int getEntry() {
		return entry;
	}

	public static void setEntry(int entry) {
		Phonebook.entry = entry;
	}
	
	
	
}

	
	
	