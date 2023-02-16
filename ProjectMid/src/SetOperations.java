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
		
		Set<String> set = new HashSet<>();
		
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
		
		//for(i=0;i<list1.size();i++) {
			
		//}
		ArrayList<String> list3 = new ArrayList<String>();
		for (String t: list1) {
            if(list2.contains(t)) {
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
		ArrayList<String> difference = new ArrayList<String>(list1);
		difference.removeAll(list2);
		return (ArrayList<String>) difference;
		
	}
	/**
	 * Gets the complement of list 1
	 * @param ArrayList 1 and 2
	 * @return complement of list1
	 */
	public ArrayList<String> getComplementListTwo(ArrayList<String> list1, ArrayList<String> list2){
		ArrayList<String> difference = new ArrayList<String>(list2);
		difference.removeAll(list1);
		return (ArrayList<String>) difference;
		
	}

}
