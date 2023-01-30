/**
 * @author Colin Glory, Galo Villacis was here
 * @version Version: 2022-12 (4.26.0)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class StatsLibrary {
	
	/**
	 * Finds the mean of a given Array List
	 * @param inputNumbers
	 * @return the mean result
	 */
	public double mean(ArrayList<Integer> inputNumbers) {
		double sum = 0;
		for(int singleElement : inputNumbers) {
			sum = sum + singleElement;
		}
		double result = sum / inputNumbers.size();
		return result;
	}
	
	/**
	 * Finds the median of a given Array List
	 * @param inputNumbers
	 * @return the Median of an ArrayList
	 */
	public double median(ArrayList<Integer> inputNumbers) {
		//for(double singleElement : inputNumbers) {
			
		//}
		Collections.sort(inputNumbers);

        if (inputNumbers.size() % 2 == 1) {
        	
        	 return inputNumbers.get((inputNumbers.size() + 1) / 2 - 1);
        }
           
        else {
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
		int maxValue = 0, maxCount = 0, i, j;

	      for (i = 0; i < inputNumbers.size(); ++i) {
	         int count = 0;
	         for (j = 0; j < inputNumbers.size(); ++j) {
	            if (inputNumbers.get(j) == inputNumbers.get(i))
	            ++count;
	         }

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
		double listMean=mean(inputNumbers);
		double standardDeviation = 0;
		for(double singleElement : inputNumbers) {
			standardDeviation = standardDeviation + Math.pow((singleElement - listMean), 2);
		}
		double sd = standardDeviation / (inputNumbers.size()-1);
		double finalDeviation = Math.sqrt(sd);
		return finalDeviation;
	}
}
