package SDETInterview;

public class A_comes_before_b {
	/*
	 Check if all ‘a’ come before ‘b’ in the string.
 Input: “aaabb” → true
 Input: “ababa” → false
	 */
	
	public static boolean checkOrder(String str)
	{
		boolean bSeen = false;
		
		for (char ch:str.toCharArray())
		{
			 if(ch == 'b')
			 {
				 bSeen = true; // mark that we have seen a 'b'
			 }
			 
			 if(ch == 'a'  && bSeen)
			 {
				 return false; // 'a' after 'b' -> invalid
			 }
		}
		return true;
		
	}
	public static void main(String[] args) {

        System.out.println(checkOrder("aaabb")); // true
        System.out.println(checkOrder("ababa")); // false
        System.out.println(checkOrder("aaaa"));  // true
        System.out.println(checkOrder("bbbb"));  // true
    }

}
