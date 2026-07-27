package SDETInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateFindInaArray {

	public static void main(String[] args) {
	
		
		int[] numbers = {1,2,3,4,5,6,2,3,1,2,3,3};
		Set<Integer> seen= new HashSet<Integer>();
		List<Integer> dup= new ArrayList<Integer>();
		
	for (int num1  :numbers)
		{
			if(seen.contains(num1))
			{
				dup.add(num1);  // store every duplicate occurrence
			}else {				
				seen.add(num1);
			}	}
		//System.out.println("All duplicate occurrences: " + dup);

		//Print the result 
		if(dup.isEmpty()) {
				System.out.println("No duplicates " + seen);
		}else	{
			System.out.println("Duplicates array is " + dup);
		}
		
}
}