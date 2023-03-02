/**
 * @author Colin Glory
 * @version Version: 2022-12 (4.26.0)
 */
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
public class StatsLibrary {
	
	/**
	 * Finds the mean of a given Array List
	 * @param inputNumbers
	 * @return the mean result
	 */
	public double mean(ArrayList<Integer> inputNumbers) {
		//initialize sum
		double sum = 0;
		//iterates through each element in inputNumbers
		for(int singleElement : inputNumbers) {
			//adds them all together
			sum = sum + singleElement;
		}
		//finds the mean then returns
		double result = sum / inputNumbers.size();
		return result;
	}
	
	/**
	 * Finds the median of a given Array List
	 * @param inputNumbers
	 * @return the Median of an ArrayList
	 */
	public double median(ArrayList<Integer> inputNumbers) {
	
		//array sorting short cut
		Collections.sort(inputNumbers);
		//if the array size is odd
        if (inputNumbers.size() % 2 == 1) {
        	
        	 return inputNumbers.get((inputNumbers.size() + 1) / 2 - 1);
        }
        //if the array size is even  
        else {
        	//lower and upper declaration
            double lower = inputNumbers.get(inputNumbers.size() / 2 - 1);
            double upper = inputNumbers.get(inputNumbers.size() / 2);

            return (double) ((lower + upper) / 2.0);
            
        }
 
		
	}
	
	/**
	 * Finds the mode of a given Array List
	 * @param inputNumbers
	 * @return the Mode of an ArrayList
	 */
	public int mode(ArrayList<Integer> inputNumbers) {
		//initialize value and count
		int maxValue = 0, maxCount = 0, i, j;
		//iterates through the array size
	    for (i = 0; i < inputNumbers.size(); ++i) {
	    	
	         int count = 0;
	         //iterates through array size
	         for (j = 0; j < inputNumbers.size(); ++j) {
	        	 //updates count if a number is found twice, thrice, etc
	            if (inputNumbers.get(j) == inputNumbers.get(i))
	            ++count;
	         }
	         //gets the highest counted number
	         if (count > maxCount) {
	            maxCount = count;
	            maxValue = inputNumbers.get(i);
	         }
	      }
	      return maxValue;
		
	}
	
	/**
	 * Finds the Standard Deviation of a given Array List
	 * @param inputNumbers
	 * @return the Standard Deviation of an ArrayList
	 */
	public double standardDeviation(ArrayList<Integer> inputNumbers) {
		//gets the mean of the list
		double listMean=mean(inputNumbers);
		//initialize standard deviation
		double standardDeviation = 0;
		//iterates through each element in the array
		for(double singleElement : inputNumbers) {
			//first part of formula
			standardDeviation = standardDeviation + Math.pow((singleElement - listMean), 2);
		}
		//second and third part of formula
		double sd = standardDeviation / (inputNumbers.size()-1);
		double finalDeviation = Math.sqrt(sd);
		
		//returns the standard deviation
		return finalDeviation;
	}
	/**
	 * Finds the factorial using Big Int
	 * @param n
	 * @return the factorial of n
	 */
	public static BigInteger factorial(int n) {
		//Big int declaration
		BigInteger factorial=BigInteger.ONE;
		
		for(int i=n;i>0;i++) {
			//Big Int does not use *, so .multiply has to be used.
			factorial=factorial.multiply(BigInteger.valueOf(i));
		}
		
		return factorial;
	}
	
	/**
	 * Finds the Geometric Distribution
	 * @param p and k
	 * @return Geometric distribution given p and k
	 */
	public double geometric(double p, double k) {
		//formula for geometric distribution
		return Math.pow(1-p, k-1)*p;
		
	}
	
	/**
	 * Factorial calculator using int 
	 * @param n >= 20
	 * @return Factorial of n
	 */
	public long factorial1(int n) {
			
		    long fact = 1;
		    
		    for (int i = 2; i <= n; i++) {
		    	
		        fact = fact * i;
		    }
		    
		    return fact;
		}
	
	/**
	 * Combination calculator for int 
	 * @param n and x
	 * @return Combination of n and x
	 */
	public long combinations1(int n, int x) {
		
		return factorial1(x)*factorial1(n-x) / factorial1(n);
		
	}
	
	/**
	 * Permutation calculator for int
	 * @param n and x
	 * @return Combination of n and x
	 */
	public long permutations1(int n, int x) {
		
		return factorial1(n)/factorial1(n-x);
		
	}
	
	/**
	 * Binomial Distribution Calculator for in t
	 * @param n, x, and p
	 * @return Binomial Distribution
	 */
	public double binomial1(int n, int x, int p) {
		
		double combo=combinations1(n,x);
		//formula
		return Math.pow(p, x)*combo*Math.pow(1-p, n-1);
		
	}
	
	/**
	 * Combination calculator
	 * @param n and x
	 * @return Combination of n and x
	 */
	public BigInteger combinations(int n, int x) {
		
		if (n<0 || x<0 || x>n) {
			
            return null;
        }
		
		BigInteger a = factorial(x).multiply(factorial(n - x));
		BigInteger b = factorial(n);
		return b.divide(a);
       
    }
	
	/**
	 * Finds the binomial distribution
	 * @param n, x, and p
	 * @return binomial distribution
	 */
	/*
	public BigInteger binomial(int n, int x, int p) {
		
		BigInteger a = factorial(n);
		BigInteger b = factorial(x).multiply(factorial(n-x));
		BigInteger c = a.divide(b);
		
		//BigInteger d = p.pow(x);
		//int dE = x;
		//BigInteger dF=/
		//double e = Math.pow(1-p, n-x);
		
		return n;
	}
	*/
	}
	
	

