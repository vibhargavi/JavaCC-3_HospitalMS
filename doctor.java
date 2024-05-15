package entity;

public class doctor {
	private int doctorID;
	private String firstName;
	private String lastName;
	private String specialization;
	private int contactNumber;
	
	
	
	public doctor() {
	}
	
	public doctor(  int doctorID,String firstName,String lastName,String specialization,int contactNumber) {
		
		this.doctorID=doctorID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.specialization=specialization;
		this.contactNumber=contactNumber;
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	 
}
