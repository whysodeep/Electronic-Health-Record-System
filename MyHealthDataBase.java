
package Assignment01;

/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Ramandeep Singh
* @version 1.1
* @since 17.0.8
* @see MyHealthData
*/

public class MyHealthDataBase {
	
	/**
	 * this method returns the maximum heart rate using the user's age
	 * @param ageParam age of the patient
	 * @return returns the maxHeartRate
	 */
	 public int maxHeartRate(int ageParam)
	 {
		 return 220 - ageParam;
	 }
	 
	 /**
	  * this method calculates minimum target heart rate for the user based on their age
	  * @param ageParam age of user
	  * @return returns the minimum target heart rate
	  */
	 public int minTargetHeartRate(int ageParam)
	 {
		 return (int) ( 0.5 * (220 - ageParam));
		   
	 }
	 
	 /**
	  * this method calculates maximum target heart rate for the user based on their age
	  * @param ageParam age of the user
	  * @return returns the maximum target heart rate
	  */
	 public int maxTargetHeartRate(int ageParam)
	 {
		 return (int) (0.85 * (220 - ageParam));
	 }
	   
   
	 /** This method returns the calculated Body Mass Index (BMI) from data provided.
	  * @param weightParam weightParam Weight of the patient in pounds.
	  * @param heightParam heightParam Height of the patient in inches.
	  * @return returns the BMI of the patient.
	  */
    public double calculateBMI( double weightParam, double heightParam)
    {
        return weightParam * 703 / ( heightParam * heightParam );
    }
    /**
     * this method named incorrectBMI is purposely done wrong to do the junit testing as per the assignment01 requirements
     * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
     * @return returns the BMI of the patient.
     */
    public double IncorrectBMI( double weightParam, double heightParam)
    {
        return weightParam * 100 / ( heightParam * heightParam );
    }
    
}
