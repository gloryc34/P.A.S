/**
 * @author Colin Glory
 * @version Version: 2022-12 (4.26.0)
 */
import java.util.ArrayList;
import java.util.*;

public class SetOperationsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetOperations test = new SetOperations();
	
		ArrayList<String> Days1 = new ArrayList<>();
		ArrayList<String> Days2 = new ArrayList<>();
		
		

		Days1.add("Monday");
		Days1.add("Tuesday");
		Days1.add("Wednesday");
		
		Days2.add("Monday");
		Days2.add("Thursday");
		Days2.add("Friday");
		
		ArrayList<String> unionResult=test.getUnion(Days1, Days2);
		ArrayList<String> intersectionResult=test.getIntersection(Days1, Days2);
		ArrayList<String> complement1Result=test.getComplementListOne(Days1, Days2);
		ArrayList<String> complement2Result=test.getComplementListTwo(Days1, Days2);
		System.out.println("List 1: "+Days1);
		System.out.println("List 1: "+Days2);
		System.out.println("The union of the two arrays are: "+unionResult);
		System.out.println("The intersection of the two arrays are: "+intersectionResult);
		System.out.println("The complement of the second array is: "+complement1Result);
		System.out.println("The complement of the first array is: "+complement2Result);

	}

}
