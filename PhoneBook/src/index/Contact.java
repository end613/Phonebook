package index;

public class Contact {
	
	private String firstName, middleName, lastName, phoneNumber, email, street, city, state, zipcode;
	
	
	
		public Contact(String firstName, String middleName, String lastName, String phoneNumber,
						String email, String street, String city, String state, String zipcode) {
			
			this.setFirstName(firstName);
			this.setMiddleName(middleName);
			this.setLastName(lastName);
			this.setPhoneNumber(phoneNumber);
			this.setEmail(email);
			this.setStreet(street);
			this.setCity(city);
			this.setState(state);
			this.setZipcode(zipcode);
			
		}



		public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getMiddleName() {
			return middleName;
		}



		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		public String getPhoneNumber() {
			return phoneNumber;
		}



		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getStreet() {
			return street;
		}



		public void setStreet(String street) {
			this.street = street;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			this.state = state;
		}



		public String getZipcode() {
			return zipcode;
		}



		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		
		

}
