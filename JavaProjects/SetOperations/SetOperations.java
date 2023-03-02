/**
 * @author Colin Glory
 * @version Version: 2022-12 (4.26.0)
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * Set Operation Functions
 */
public class SetOperations {
	/**
	 * Gets the union of two lists
	 * @param ArrayList 1 and 2
	 * @return union of the two lists
	 */
	public ArrayList<String> getUnion(ArrayList<String> list1, ArrayList<String> list2) {
		//hash set declaration
		Set<String> set = new HashSet<>();
		//adds all elements to the set
		set.addAll(list1);
		set.addAll(list2);
		
		return new ArrayList<String>(set);
		
	}
	
	/**
	 * Gets the intersection of two lists
	 * @param ArrayList 1 and 2
	 * @return intersection of the two lists==>list3
	 */
	public ArrayList<String> getIntersection(ArrayList<String> list1, ArrayList<String> list2){
		//Array List 3 declaration, used to add all elements from each list
		ArrayList<String> list3 = new ArrayList<String>();
		//iterates through list 1
		for (String t: list1) {
			//checks if list 2 contains that element from 1
            if(list2.contains(t)) {
            	//adds to 3
                list3.add(t);
            }
        }
		return list3;
		
	}
	/**
	 * Gets the complement of list 2
	 * @param ArrayList 1 and 2
	 * @return complement of list2
	 */
	public ArrayList<String> getComplementListOne(ArrayList<String> list1, ArrayList<String> list2){
		//new arraylist based off of list1
		ArrayList<String> difference = new ArrayList<String>(list1);
		//removes all elements that are in list 2 from the new list
		difference.removeAll(list2);
		
		return (ArrayList<String>) difference;
		
	}
	/**
	 * Gets the complement of list 1
	 * @param ArrayList 1 and 2
	 * @return complement of list1
	 */
	public ArrayList<String> getComplementListTwo(ArrayList<String> list1, ArrayList<String> list2){
		//new arraylist based off of list2
		ArrayList<String> difference = new ArrayList<String>(list2);
		//removes all elements that are in list 1 from the new list
		difference.removeAll(list1);
		
		return (ArrayList<String>) difference;
		
	}

}
