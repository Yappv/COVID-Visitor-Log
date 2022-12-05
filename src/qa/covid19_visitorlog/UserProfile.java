package qa.covid19_visitorlog;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserProfile {
	private final String userID;
	private FullName userFullName;
	private Date userBirthDate;
	private Date userEnterDateTime;
	private String userPhoneNumber;
	
	//default constructor
	public UserProfile() {
		//TODO use the static method NameGenerator.randomUserID
		//to initialize a random userID on the newly created user
                this.userID = NameGenerator.randomUserID();
		this.userFullName = new FullName();
		this.userBirthDate = new Date();
		this.userEnterDateTime = new Date();
                this.userPhoneNumber = " ";
	}
	
	public String getUserID() {
            return this.userID;
        }
        
        public String getFullName() {
            String temp = this.userFullName.getFirstName() + " " + this.userFullName.getMiddleName() + " " + this.userFullName.getLastName();
            return temp;
        }
        
        public String getFirstName() {
            return this.userFullName.getFirstName();
        }
        
        public String getMiddleName() {
            return this.userFullName.getMiddleName();
        }
        
        public String getLastName() {
            return this.userFullName.getLastName();
        }
        
        public String getBirthDate() {
            return new SimpleDateFormat("MM/dd/yyyy").format(this.userBirthDate);
        }
        
        public String getEnterDateTime() {
            return new SimpleDateFormat("HH:mm:ss dd/MM/YYYY EEEE").format(this.userEnterDateTime);
        }
        
        public String getPhoneNumber() {
            return this.userPhoneNumber;
        }
        
        public void setFullName(){
            this.userFullName = new FullName();
        }
        
        public void setFullName(String f, String m, String l){
            this.userFullName.setFirstName(f);
            this.userFullName.setMiddleName(m);
            this.userFullName.setLastName(l);
        }
        
        public void setBirthDate(int month, int day, int year){
            String birthDateCombine = month + "/" + day + "/" + year;
            try {
                this.userBirthDate = new SimpleDateFormat("MM/dd/yyyy").parse(birthDateCombine);
            } catch (ParseException ex) {
                Logger.getLogger(UserProfile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void setPhoneNumber(String phoneNumber){
            this.userPhoneNumber = phoneNumber.substring(0,11);
        }
        

        //TODO create accessors and mutators for the following conditions
	//1. userID can not be modified by any class, but can be accessed
	//2. userFullName can be modified and accessed by any class, however
	//	you need to create:
	//		a. four (4) getters for the full name, only first name, only middle name, and only last name.
	//		b. two (2) setters for the full name using the FullName Class and using the strings
	//			first name, middle name, and last name
	//3. userBirthDate can be modified and accessed by any class
	//4. userCreateDate can be only accessed
}
