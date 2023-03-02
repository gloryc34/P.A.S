import java.math.BigInteger;
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
		
		int n = Numbers.size();
		int r = 3;
		//int resultCombo;
		//int resultPerm;
		double p = 10.0;
		double k = 9.0;
		int x = 10;
		
		
		//double comboResult=test.factorial(n);
		//BigInteger comboResult=test.factorial(n);
		//BigInteger permResult=test.factorial(n);
		
		double meanResult = test.mean(Numbers);
		double sdResult = test.standardDeviation(Numbers);
		double medResult = test.median(Numbers);
		double modeResult = test.mode(Numbers);
		double geoResult = test.geometric(p, k);
		//BigInteger comboResult = test.combinations(n, x);
		
		System.out.println("The mean of the input is: "+ meanResult);
		
		System.out.println("The Standard deviation of the input is: "+sdResult);
		
		System.out.println("The median of the list is: "+medResult);
		
		System.out.println("The mode of the list is: "+modeResult);
		
		System.out.println("Geometric Distribution: "+geoResult);
		
		//System.out.println("Combination: "+comboResult);
		
		System.out.println("Factorial testing: "+test.factorial1(5));
		System.out.println("Combination testing: "+test.combinations1(5,10));
		System.out.println("Binomial testing: "+test.binomial1(10, 20, 5));
		System.out.println("Permutation testing: "+test.permutations1(5, 10));
		
	}

}
