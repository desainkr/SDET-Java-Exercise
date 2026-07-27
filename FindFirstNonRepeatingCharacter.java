package SDETInterview;
import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingCharacter {
	public static void main(String[] args) {
		
		String str= "Software Services";
		
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for (char ch : str.toLowerCase().toCharArray()) {
			if (ch == ' ') continue;  
			    	map.put(ch, map.getOrDefault(ch, 0)+1);
				}
		System.out.println(map);
		for (char ch : str.toLowerCase().toCharArray()) {
			
			 if(map.get(ch)==1)
			 {
				 if (ch == ' ') continue;
				  System.out.println("First non repeating char character is :" + ch);
				 break;
			 }
		}		
		
		/*
 Key difference (VERY IMPORTANT)
Problem	                                                      Best Approach
Count duplicates	                                        Map
First non-repeating	                                    Map + loop
First repeating	                                             Set ⭐
 */
	}

}
