package SDETInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveSecondhighestelementfromtheHashMap {

	public static void main(String[] args) {
		

		 HashMap<String, Integer> map = new HashMap<>();
	        map.put("A", 10);
	        map.put("B", 40);
	        map.put("C", 20);
	        map.put("D", 30);
		System.out.println(map);
			
		//Step 1 : find Highest and second highest
		
		int first =Integer.MIN_VALUE;
		int second= Integer.MIN_VALUE;
		
		for (int value: map.values())
		{
			     if (value> first)
			     {
			    	 second= first;
			    	 first=value;			    	 
			     }else  if
			     ( value >second && value <first)
			     {
			    	 second=value;
			     }
		}	 
			    	//step 2: REmove the second highest value
			    
		String keyToRemove =null;
			     
			     for (Map.Entry<String, Integer>  entry :map.entrySet())
			     {
			    	  if(entry.getValue() == second) {
			    		  keyToRemove= entry.getKey();
			    		  break;
			    		  
			    	  }
			     }
			
			if (keyToRemove != null) {
				
				map.remove(keyToRemove);
			}
			
		
		
		System.out.println("After removing second highest: " + map);
	}

}
