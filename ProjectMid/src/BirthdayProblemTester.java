/**
 * @author Colin Glory
 * @version Version: 2022-12 (4.26.0)
 * Sources that helped me are: 
 * 		https://www.codeproject.com/Questions/1148713/The-birthday-problem-in-java
 * 		https://www.youtube.com/watch?v=TKOC68nc_tM
 * 		https://www.geeksforgeeks.org/birthday-paradox/
 */
import java.util.Random;
import java.util.Scanner;

public class BirthdayProblemTester {
	/**
	 * Runs the program, allows for user input, and finds the probability of 2 people sharing a birthday
	 * @param 
	 * @return probability
	 */
	public void run() {
		//Scanner creation
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Please enter the number of people: ");
        int people = sc.nextInt();
        //user input
        System.out.print("Please Enter the number of trials: ");
        int trials = sc.nextInt();
        //same birthday count&loop that goes through amt of trials
        int count = 0;
        for (int i = 0; i < trials; i++) {
        	
            if (sameBirthday(people)) {
            	
                count++;
            }
        }
        //probability calculation
        double probability = (double) count / trials;
        System.out.println("The probability of 2 people sharing the same birthday is " + probability+" with "+people+" people and "+trials +" trials.");
   
	}
	/**
	 * Finds out if two people share a birthday based on trials and amount of people
	 * @param people
	 * @return winning percentage result
	 */
    private boolean sameBirthday(int people){
    	
    	//date creation....365 days in a year, excluding year years
    	Random date = new Random();
    	//array list of birthdays
    	boolean[] birthday = new boolean[365];
    	
        //iterates through the amount of people in a room to assign a birthday to each person....returns true if same
        for(int i = 0; i < people; i++){
        	//assigns a random date 
            int day=date.nextInt(365);
            
            if(birthday[day]){
            	
                return true;
            }
            
            birthday[day]=true;
        }
        
        return false;
    }
}
