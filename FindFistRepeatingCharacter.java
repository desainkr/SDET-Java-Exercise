package SDETInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindFistRepeatingCharacter {

	public static void main(String[] args) {
		String str= "apple";
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for (char ch : str.toLowerCase().toCharArray()) {
				
			    	map.put(ch, map.getOrDefault(ch, 0)+1);
				}
		for (char ch : str.toLowerCase().toCharArray()) {
			
			 if(map.get(ch)==2)
			 {
				  System.out.println("Fist Repeating Character : " + ch);
				 break;
			 }
		}	

	}

}
