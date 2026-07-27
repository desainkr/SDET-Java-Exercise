package SDETInterview;

import java.util.HashSet;
public class LongestSubstring {
	

	public static void main(String[] args) {
		//LongestSubstring no repeats  
	    String str="abcabcbb";
    	HashSet<Character> set =new HashSet<>();
    	int left =0;
    	int maxlength =0;
		 
		for(int right=0; right<str.length(); right++)
		{
			// If duplicate, shrink window
			while(set.contains(str.charAt(right))) {
					  set.remove(str.charAt(left));
				      left ++;
			}
			// Add current char
			 set.add(str.charAt(right));
		 
			 // update  max length
			  maxlength= Math.max(maxlength, right-left+1);
			  /*
			   * right - left + 1 gives the size of the current sliding window, 
			   and Math.max() ensures we always keep the longest substring without repeating characters.
			   👉 It compares:
							current window length
							best length so far
							👉 and stores the maximum
							
							Expression	                               Meaning
								right - left	                              gap between indices
								+1	                                       include both ends
								final	                                       actual length
			   */
					  
			 	}
		 System.out.println(maxlength);
		
	}
}
