package qa.covid19_visitorlog;

public class FullName{
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public FullName() {
		this.firstName = "Dummy First Name";
		this.middleName = "Dummy Middle Name";
		this.lastName = "Dummy LastName";
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
	
	public String getMiddleName() {
		return middleName;
	}
        
        public String getMiddleInitial() {
                return middleName.substring(0,1) + ".";
        }
        
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	//TODO create a method that will return the Middle Initial
}