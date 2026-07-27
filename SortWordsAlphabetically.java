package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SortWordsAlphabetically {

	public static void main(String[] args) {
		String   [] arr= {"Mango","Banana","Apple"};
		List<String> list= new ArrayList<>();
//	    for( int i=0; i<arr.length; i++) {
//	    	   list.add(arr[i]);
//	    	    }
		for(String word:arr)
		{list.add(word);};
	   Collections.sort(list);
	   System.out.println(list);
	   // approach two
		List<String> list1= new ArrayList<>(Arrays.asList("Mango","Banana","Apple"));
		Collections.sort(list1);
		 System.out.println(list1);
		 
	   
	}

	
}
