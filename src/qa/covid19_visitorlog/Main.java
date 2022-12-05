package qa.covid19_visitorlog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcu
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
            
        UserProfile user = new UserProfile();
        LinkedList<UserProfile> logs = new LinkedList<>();
        
        /*
	UserProfile one = new UserProfile();
        one.setFullName("Marcus","Philip","Yap");
        one.setBirthDate(01,01,2001);
        one.setPhoneNumber("09436579680");

        UserProfile two = new UserProfile();   
        two.setFullName("Smith", "Young", "Walker");
        two.setBirthDate(02,02,2002);
        two.setPhoneNumber("09358078978");

        UserProfile three = new UserProfile();
        three.setFullName("Johnson", "Lewis", "Robinson");
        three.setBirthDate(03,03,2003);
        three.setPhoneNumber("09678932344");

        UserProfile four = new UserProfile();
        four.setFullName("Williams", ""Sanchez, "Ramirez");
        four.setBirthDate(04,04,2004);
        four.setPhoneNumber("09063909753");

        UserProfile five = new UserProfile();
        five.setFullName("Brown", "Harris", "White");
        five.setBirthDate(05,05,2005);
        five.setPhoneNumber("09668077756");

        UserProfile six = new UserProfile();
        six.setFullName("Jones", "Perez", "Thompson");
        six.setBirthDate(06,06,2006);
        six.setPhoneNumber("09588856456");

        UserProfile seven = new UserProfile();
        seven.setFullName("Garcia", "Martin", "Lee");
        seven.setBirthDate(07,07,2007);
        seven.setPhoneNumber("09430095864");

        UserProfile eight = new UserProfile();
        eight.setFullName("Miller", "Moore", "Jackson");
        eight.setBirthDate(08,08,2008);
        eight.setPhoneNumber("09167448123");

        UserProfile nine = new UserProfile();
        nine.setFullName("Davis", "Taylor", "Thomas");
        nine.setBirthDate(09,09,2009);
        nine.setPhoneNumber("09696822342");

        UserProfile ten = new UserProfile();
        ten.setFullName("Rodriguez", "Anderson", "Wilson"); 
        ten.setBirthDate(10,10,2010);
        ten.setPhoneNumber("09987654321"); 

        UserProfile eleven = new UserProfile();
        eleven.setFullName("Martinez", "Lopez", "Gonzalez");
        eleven.setBirthDate(11,11,2011);
        eleven.setPhoneNumber("09123456789");

        UserProfile twelve = new UserProfile();
        twelve.setFullName("John", "Doe", "Hernandez");  
        twelve.setBirthDate(12,12,2012);     
        twelve.setPhoneNumber("09135246777");           
        
        logs.add(one);
        logs.add(two);
        logs.add(three);
        logs.add(four);
        logs.add(five);
        logs.add(six);
        logs.add(seven);
        logs.add(eight);
        logs.add(nine);
        logs.add(ten);
        logs.add(eleven);
        logs.add(twelve);
        */
        
        boolean mainLoop = true, searchLoop = true;
        char userChoice = ' ', searchChoice = ' ';
        int day = 0, month = 0, year = 0, x = 1;
        int n = 0; //n = 12; for testing purposes more than 10 people
        String firstName = " ", middleName = " ", lastName = " ", phoneNumber = " ";
        String passwordVal = "c", password = " ", searchKeyword = " "; 
        
        System.out.println("=================================================");
            System.out.println("COVID-19 Visitor Log");
       
        while(mainLoop == true){
            searchLoop = true;
            
            System.out.println("=================================================");
            System.out.println("Please Identify:");
            System.out.println("(A) Administrator");
            System.out.println("(S) Store Visitor");
            System.out.print("> ");
            try {
                userChoice = reader.readLine().charAt(0); 
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
            }
            
            switch(userChoice){
                case 'A', 'a' -> {
                    System.out.println("=================================================");
                    System.out.print("Please enter your password: ");
                        try {
                           password = reader.readLine(); 
                        } catch (IOException ex) {  
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    if (password.equals(passwordVal)){
                        while(searchLoop == true){
                            System.out.println("=================================================");
                            System.out.println("Search Options:");
                            System.out.println("(R) Recent Logs");
                            System.out.println("(D) Date and Time");
                            System.out.println("(F) First Name");
                            System.out.println("(L) Last Name");
                            System.out.println("(P) Phone Number");
                            System.out.println("(O) Log-out");
                            System.out.println("(X) Terminate Program");
                            System.out.print("> ");
                            try {
                                searchChoice = reader.readLine().charAt(0); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                            }
                            
                            switch(searchChoice){
                                case 'R', 'r' -> {
                                    System.out.println("================================================="); 
                                    if(n < 10){
                                        for(int i=0;i<n;i++){
                                            System.out.println("Result " + (i+1));
                                            System.out.println(logs.get(i).getUserID());
                                            System.out.println(logs.get(i).getPhoneNumber());
                                            System.out.println(logs.get(i).getEnterDateTime());
                                            System.out.println("");
                                        }
                                    } else {
                                        for(int i=n-1;i>(n-11);i--){
                                            System.out.println("Result " + (x));
                                            System.out.println(logs.get(i).getUserID());
                                            System.out.println(logs.get(i).getPhoneNumber());
                                            System.out.println(logs.get(i).getEnterDateTime());
                                            System.out.println("");
                                            x += 1;
                                        }
                                        x = 1;
                                    }
                                    
                                    break;
                                }

                                case 'D', 'd' -> {
                                    System.out.println("=================================================");
                                    System.out.print("Input Date (Default Format): ");
                                    try {
                                        searchKeyword = reader.readLine(); 
                                    } catch (IOException ex) {
                                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                                    }
                                    
                                    System.out.println(user.getEnterDateTime());
                                    for(int i=0;i<10;i++){
                                        if (logs.get(i).getEnterDateTime().equals(searchKeyword)){
                                            System.out.println("Result " + (i+1));
                                            System.out.println(logs.get(i).getUserID());
                                            System.out.println(logs.get(i).getPhoneNumber());
                                            System.out.println(logs.get(i).getEnterDateTime());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                }

                                case 'F', 'f' -> {
                                    System.out.println("=================================================");
                                    System.out.print("Input First Name: ");
                                    try {
                                        searchKeyword = reader.readLine(); 
                                    } catch (IOException ex) {
                                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                                    }
                                    for(int i=0;i<10;i++){
                                        if (logs.get(i).getFirstName().equals(searchKeyword)){
                                            System.out.println("Result " + (i+1));
                                            System.out.println(logs.get(i).getUserID());
                                            System.out.println(logs.get(i).getPhoneNumber());
                                            System.out.println(logs.get(i).getEnterDateTime());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                }

                                case 'L', 'l' -> {
                                    System.out.println("=================================================");
                                    System.out.print("Input Last Name: ");
                                    try {
                                        searchKeyword = reader.readLine(); 
                                    } catch (IOException ex) {
                                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                                    }
                                    for(int i=0;i<10;i++){
                                        if (logs.get(i).getLastName().equals(searchKeyword)){
                                            System.out.println("Result " + (i+1));
                                            System.out.println(logs.get(i).getUserID());
                                            System.out.println(logs.get(i).getPhoneNumber());
                                            System.out.println(logs.get(i).getEnterDateTime());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                }

                                case 'P', 'p' -> {
                                    System.out.println("=================================================");
                                    System.out.print("Input Phone Number: ");
                                    try {
                                        searchKeyword = reader.readLine(); 
                                    } catch (IOException ex) {
                                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                                    }
                                    for(int i=0;i<=10;i++){
                                        if (logs.get(i).getPhoneNumber().equals(searchKeyword)){
                                            System.out.println("Result " + (i+1));
                                            System.out.println(logs.get(i).getUserID());
                                            System.out.println(logs.get(i).getPhoneNumber());
                                            System.out.println(logs.get(i).getEnterDateTime());
                                            System.out.println("");
                                        }
                                    }
                                    break;
                                }

                                case 'O', 'o' -> {
                                    System.out.println("=================================================");
                                    System.out.println("Logging Off COVID Tracker..."); 
                                    searchLoop = false;
                                    break;
                                }

                                case 'X', 'x' -> {
                                    System.out.println("=================================================");
                                    System.out.println("Ending Program..."); 
                                    System.exit(0); 
                                }
                            }
                        }
                }
                    else {
                        System.out.println("Wrong password!");
                    }
                    break;
                }
                
                case 'S', 's' -> {
                    System.out.println("=================================================");
                    System.out.println("Please enter your details");
                    System.out.println("=================================================");
                    System.out.println("FULL NAME");
                        System.out.print("First Name: ");
                            try {
                                firstName = reader.readLine(); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                            }
                        System.out.print("Middle Name: ");
                            try {
                                middleName = reader.readLine(); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                            }
                        System.out.print("Last Name: ");
                            try {
                                lastName = reader.readLine(); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                            }
                        user.setFullName(firstName, middleName, lastName);
                       
                    System.out.println("\nBIRTH DATE");                    
                        System.out.print("Month (XX): ");
                            try {
                                month = Integer.parseInt(reader.readLine()); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                            } catch (NumberFormatException ex){
                                System.out.println("Please input a valid month"); 
                                continue;
                            } if (month <= 0 || month >= 13){
                                System.out.println("Please input a valid month");
                                continue;
                            } 

                        System.out.print("Day (XX): ");
                            try {
                                day = Integer.parseInt(reader.readLine()); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                            } catch (NumberFormatException ex){
                                System.out.println("Please input a valid day"); 
                                continue;
                            } if (day <= 0 || day >= 32){
                                System.out.println("Please input a valid day");
                                continue;
                            }

                        System.out.print("Year (XXXX): ");
                            try {
                                year = Integer.parseInt(reader.readLine()); 
                            } catch (IOException ex) {
                                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (NumberFormatException ex){
                                System.out.println("Please input a valid year"); 
                                continue;
                            } if (year <= 1902 || year >= 2022){
                                System.out.println("Please input a valid year");
                                continue;
                            }
                        user.setBirthDate(month, day, year);
                    
                    System.out.print("\nPhone Number (11 Digits): "); 
                        try {
                            phoneNumber = reader.readLine(); 
                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
                        }
                        int length = phoneNumber.length();
                        if (length != 11){
                           System.out.println("Please input a valid phone number"); 
                           continue;
                        }
                        user.setPhoneNumber(phoneNumber);
                        
                    System.out.println("\nUser Registered:");
                    System.out.println("Full Name: " + user.getFullName());
                    System.out.println("Birth Date: " + user.getBirthDate());
                    System.out.println("Phone Number: " + user.getPhoneNumber());
                    System.out.println("Recorded At: " + user.getEnterDateTime());
                        logs.add(user);
                        n += 1;
                }
                
                default -> {
                    System.out.println("Please enter a valid option");
                }
            }
        }
    }
}
