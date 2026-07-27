package SDETInterview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RemovethesecondhighestelementfromtheHashMap {

	public static void main(String[] args) {
	
		// Remove the second highest element from the HashMap
		
		Map<Integer,String> hmap= new HashMap<>();
		hmap.put(1, "Playwright");
		hmap.put(2, "Java");
		hmap.put(3, "TestNG");
		hmap.put(4, "Selenium");
		hmap.put(5, "Maven");
		//System.out.println(hmap);
		
		//  Using List ArrayList
		List<Integer> list= new ArrayList<>(hmap.keySet());
		Collections.sort(list);
		System.out.println(list);
		Integer secondHightest= list.get(1);
		System.out.println(secondHightest);
		// Remove from original map
		hmap.remove(secondHightest); //remove from hashmap
		System.out.println(list);
		System.out.println(hmap); 
		
		// Using Streams
		Set<Integer> secondHighest1 = hmap.keySet();
		Optional<Integer> shight= secondHighest1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(shight.get());
		// Remove if present
		shight.ifPresent(hmap:: remove);
		System.out.println(hmap);
	              //or
		hmap.keySet()
	    .stream()
	    .sorted(Comparator.reverseOrder())
	    .skip(1)
	    .findFirst()
	    .ifPresent(hmap::remove);

		
			
	                	//Using TreeMap

//				TreeMap<Integer,String> tmap= new TreeMap<>(hmap);
//		/*		 Step-by-step:
//									tmap.lastKey() → gives the highest key
//									tmap.lowerKey(key) → gives the greatest key strictly less than the given key
//		 */
//		// Get second highest key
//		//Integer Highest = ((TreeMap<Integer, String>) tmap).lastKey(); //5
//		Integer secondHighest = tmap.lowerKey(tmap.lastKey());  //4
//		
//		//System.out.println(secondHighest);
//		tmap.remove(secondHighest);
//		//System.out.println(tmap);
	}

}
