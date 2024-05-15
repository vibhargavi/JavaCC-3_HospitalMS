package entity;

public class patient {
	private int patientID;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private int contactNumber;
	private String address;
	
	public patient() {
	}
	
	
	public patient(int patientID,String firstName,String lastName,String dateOfBirth,String gender,int contactNumber,String address) {
		
		this.patientID=patientID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
		this.gender=gender;
		this.contactNumber=contactNumber;
		this.address=address;
				
	
	}


	public int getPatientID() {
		return patientID;
	}


	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public class doctor{
		int doctorID;
		String firstName;
		String lastName;
		String specialization;
		int contactNumber;
		
	}
	
	

}
