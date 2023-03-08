/**
 * @author Colin Glory
 * @version Version: 2022-12 (4.26.0)
 * Got ideas on what the problem means and ways to go about coding from : https://sites.google.com/site/michaelcharlesbillings/code/monty-hall
 * & from https://www.knowprogram.com/java/monty-hall-java-program/
 * 
 * Problem 2.20:
 * -Part A: The probability that the contestant selects the curtain that is hiding the prize is 1/3. P(G)=P(D1)=P(D2)=1/3
 * -Part B:
 * 		i: The probability is 1/3
 * 		ii: The probability would be 0/3
 * 		iii: The probability would be 3/3
 * 		iv: The probability would be 2/3
 * 		v: The better strategy would be switching the door
 */
import java.util.Random;

public class MontyHall {
	//initialize trials and random number
	double gameTrials=10000;
	Random number = new Random();
	
	/**
	 * Finds the winning percentage for door changes
	 * @param 
	 * @return winning percentage result
	 */
	public double doorChange(){
		//initialize gamesWon
		int gamesWon = 0;
		//iterates through the amount of game trials
	    for (int i = 1; i <= gameTrials; i++){
	    	//generates the winning door, chosen door, etc
	    	int chosenDoor = number.nextInt(3);
	    	int winningDoor = number.nextInt(3);
	        int wrongDoor = winningDoor;
	        //logical OR operator
	        while(wrongDoor==winningDoor || wrongDoor==chosenDoor){
	        	
	        	wrongDoor = number.nextInt(3);
	        	
	        }
	        //the switched door is (3-choice-shown), ==> 0+1+2=3
	        int otherDoor=3-(chosenDoor + wrongDoor);
	        
	        ///if the two random doors have the same value, then add to gamesWon
	        if(otherDoor==winningDoor){
	        	
	        	gamesWon++;
	        	
	         }
	    }
	    //output and results
	    System.out.println("Here are your results if you do change the door:");
	    System.out.println("Amount of trials: "+gameTrials+" and the amount of winning Games: "+gamesWon);
	    //probability
		System.out.println("Your winning percentage is: "+(double)gamesWon/gameTrials+"\n");
		return gamesWon;
		
		
	}
	
	/**
	 * Finds winning percentage with no door change
	 * @param 
	 * @return the winning percentage result
	 */
	public double noChange(){
		//initialize gamesWon
		int gamesWon = 0;
		//runs through the amount of trials
		for (int i = 1; i <= gameTrials; i++){
			
			//generates the winning door and chosen door
			int chosenDoor = number.nextInt(3);
			int winningDoor = number.nextInt(3);
            //if the two random doors have the same value, then add to gamesWon
            if (chosenDoor==winningDoor){
            	
            	gamesWon++;
            	
            }
                
        }
		//output and results
		System.out.println("Here are the results if you do not change the door:");
		System.out.println("Amount of trials: "+gameTrials+" and the amount of winning games: "+gamesWon);
		//probability
		System.out.println("Your winning percentage is: "+(double)gamesWon/gameTrials);
		return gamesWon;
	
		
	}
	}
