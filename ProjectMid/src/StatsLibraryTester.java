import java.util.ArrayList;
import java.util.Arrays;

public class StatsLibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		StatsLibrary test = new StatsLibrary();
		ArrayList<Integer> Numbers = new ArrayList<>();
		
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(6);
		Numbers.add(7);
		Numbers.add(5);
		Numbers.add(6);
		Numbers.add(4);
		Numbers.add(7);
		
		
		double meanResult = test.mean(Numbers);
		double sdResult = test.standardDeviation(Numbers);
		double medResult = test.median(Numbers);
		double modeResult = test.mode(Numbers);
		
		System.out.println("The mean of the input is: "+ meanResult);
		
		System.out.println("The Standard deviation of the input is: "+sdResult);
		
		System.out.println("The median of the list is: "+medResult);
		
		System.out.println("The mode of the list is: "+modeResult);
		

	}

}
