package SDETInterview;

import java.util.HashSet;
import java.util.LinkedList;

public class ConvertLinkedListtoHashSet {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A"); 
		linkedList.add("B"); 
		linkedList.add("A");
		System.out.println(linkedList);

		HashSet<String> hashSet = new HashSet<>(linkedList);
		
		System.out.println(hashSet);
		
		
	}

}
