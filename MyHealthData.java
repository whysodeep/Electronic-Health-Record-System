

package Assignment01;


/**
 * MyHealthData is a sub-class extended from MyHealthDataBase for the Electronic Health Records (EHR) System,
 * this system maintains important health information about a patient.
 * This class contains all the attributes for the patient's information as well as their getter and setters.
 * it also uses printf statements used to display all the information in a formatted way. 
 * @author Ramandeep Singh
 * @version 1.1
 * @since 17.0.8
 */
public class MyHealthData extends  MyHealthDataBase 

{

   /**
    * first name of the patient
    */
	private String firstName;
	/**
	 * last name of the patient
	 */
	private String lastName;
	/**
	 * gender of the patient
	 */
	private String gender;
	/**
	 * year of birth of the patient
	 */
	private int birthYear;
	/**
	 * current year to get the age of the patient
	 */
	private int currentYear;
	/**
	 * height of the patient
	 */
	private double height;
	/**
	 * weight of the patient
	 */
	private double weight;
	
	
	/**
	 * this constructor sets all the attributes, 'first name,last name,gender, birth year ,current year, height, and weight' 
	 * of the patient as they are passed
	 * @param firstName first name of the patient
	 * @param lastName last name of the patient
	 * @param gender  gender of the patient
	 * @param birthYear  year of birth of the patient
	 * @param currentYear current year to get the age of the patient
	 * @param height height of the patient
	 * @param weight  weight of the patient
	 */
	public MyHealthData(String firstName,String lastName,String gender,int birthYear,
			             int currentYear,double height,double weight)
     {
             this.firstName=firstName;
	         this.lastName=lastName;
	         this.gender=gender;
	         this.birthYear=birthYear;
	         this.currentYear=currentYear;
	         this.height=height;
	         this.weight=weight;
	
	  }
   

    /**
     * returns the first name of the patient
     * @return first name of the patient
     */
	public String getFirstName() {
		return firstName;
	}

     /**
      * sets the first name of the patient
      * @param firstName the first name of the patient
      */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * returns the last name of the patient
	 * @return the lastName of the patient
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * sets the last name of the patient
	 * @param lastName the lastName to be set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * returns the gender of the patient
	 * @return the gender 
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * sets the gender of the patient
	 * @param gender the gender to be set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * returns the year of birth of the patient
	 * @return the birthYear of the patient
	 */
	public int getBirthYear() {
		return birthYear;
	}


	/**
	 * returns the year of birth of the patient
	 * @param birthYear the birthYear to be set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}


	/**
	 * returns the Year of use
	 * @return the currentYear
	 */
    public int getCurrentYear() {
  	return currentYear;
    }


	

	/**
	 * returns the height of the patient
	 * @return the height of the patient
	 */
	public double getHeight() {
		return height;
	}


	/**
	 * sets the height of the patient
	 * @param height the height to be set
	 */
	public void setHeight(double height) {
	this.height = height;	}


	/**
	 * returns the weight of the user
	 * @return the weight of the patient
	 */
	public double getWeight() {
		return weight;
	}


	/**
	 * sets the weight of the patient
	 * @param weight the weight to be set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	} 
	
	/**
	 * this method is used to calculate the age of the patient by subtracting the patient's birth year from the current year.
	 * @return the age of the patient
	 */
	public int getAge() {
		return currentYear - birthYear;
		
	}
   

     /**
      * this method displays all the patient's information like, full name, gender,birth year, current year, height,
      * weight, age and different calculations performed by methods of MyHealthDatabase
      *  like maximum heart rate, target heart range, and BMI based on each patient's unique information
      * it then also prints some BMI values to provide some information to the users about specific range values. 
      */
    public void displayMyHealthData() 
    { 
    	System.out.printf("Health Data:%n");
    	System.out.printf("First name: %s%n", firstName);
    	System.out.printf("last name: %s%n",lastName);
    	System.out.printf("Gender: %s%n", gender);
    	System.out.printf("Birth Year: %d%n", birthYear);
    	System.out.printf("Current Year: %d%n", currentYear);
    	System.out.printf("Height: %.2f%n", height);
    	System.out.printf("Weight: %.2f%n", weight);
    	System.out.printf("Age: %d%n", getAge());
    	System.out.printf("Maximum Heart Rate: %d%n", maxHeartRate(getAge()));
    	System.out.printf("Target Heart Rate Range: %d - %d%n", minTargetHeartRate(getAge()),
    			                                                maxTargetHeartRate(getAge()));
    	System.out.printf("BMI: %.2f%n", calculateBMI(weight,height));
   
    

       System.out.println("BMI VALUES");
       System.out.println("Underweight: less than 18.5");
       System.out.println("Normal:      between 18.5 and 24.9");
       System.out.println("Overweight:  between 25 and 29.9");
       System.out.println("Obese:       30 or greater");   
     }
	
	
	





} 
