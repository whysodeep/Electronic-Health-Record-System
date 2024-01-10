

package Assignment01;
import java.util.*; // importing scanner

   /**
    * this is the driver class for this program. it runs the program with the method main.
    * it also uses scanner object to let the user input their information, 
    * it also then instantiates a new object of MyHealthData and assigns the variable values by using  a constructor
    * finally, a method is called from MyHealthData to print all of the patient's information 
    * @author Ramandeep Singh
    * @version 1
    * @since 17.0.8
    * @see MyHealthData
    */
     public class MyHealthDataTest  {

	/**
	 * this is the main method of the class , some variables are declared to store user's input
	 * it instantiates new object named 'healthData' of 'MyHealthData' to call constructor and a method to set and display the information
	 * @param  args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		
		Scanner go =new Scanner(System.in); // creating a new scanner object
                         
     
		 System.out.println("Enter patient's Data");
		 
               System.out.println("First Name:");
               String firstName=go.nextLine();
              
               System.out.println("Last Name:");
               String lastName=go.nextLine();
              
               
               System.out.println("Gender(Male/Female):");
               String gender=go.nextLine();
              
               
               System.out.println("Year of Birth");
               int birthYear =go.nextInt();
              
               
             System.out.println("Height in inches");
             double heightInInches=go.nextDouble();
            
             
             System.out.println("Weight in pounds");
             double weightInPounds=go.nextDouble();
            
             int currentYear = 2023;
           
             MyHealthData healthData = new MyHealthData(firstName,lastName,gender,birthYear,
            		                              currentYear,heightInInches,weightInPounds);
             
             healthData.displayMyHealthData();
             
             
             go.close();
                  
                  
	}}              
                 
                   


	
	
     
     
     
     
     
     
     
     
 










