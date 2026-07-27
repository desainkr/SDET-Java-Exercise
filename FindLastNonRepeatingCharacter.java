package SDETInterview;

import java.util.HashMap;
import java.util.Map;

public class FindLastNonRepeatingCharacter {
	
/*
Direction	                     Condition	                         Result
Left → Right	                    == 1	                                First non-repeating
Right → Left                  	== 1	                                 Last non-repeating
Left → Right	                      > 1	                                  First repeating
Right → Left                      > 1	                                   Last repeating
*/
	public static void main(String[] args) {

		String str="stress";
		
		Map<Character, Integer>  map= new HashMap<>();
		
		for(char  ch: str.toLowerCase().toCharArray())
		{
			
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}

		for(int i=str.length()-1; i>=0; i--)
		{
			
			 char ch=Character.toLowerCase(str.charAt(i));  // it will work for ...str.charAt(i);
			 if (map.get(ch)==1)	{
				 
				 System.out.println("Last none repeating character " + ch);
				 break;
			 }		
		}
			
		}

	}


