package SDETInterview;

public class StringContainsOnlyDigits {
/*
 Core Difference
            Method	                                                   Purpose
            matches()	                                             ✔ Check (true/false)
            replaceAll()	                                         ✔ Modify string
 */
	
	public static void main(String[] args) {
		
		String str="123";
		boolean result=str.matches("\\d+");
		System.out.println(result);
		
			//Approach 2
		
		Boolean allDigits=true;
		for(char ch:str.toCharArray()) {
		if(!Character.isDigit(ch)) {
            allDigits=false;
            break;
	}
		}
		System.out.println(allDigits);
	}}
/*
 When to use what
Scenario	                                                                                       Method
Check if string is numeric	                                                             matches() ⭐
Remove digits	                                                                             replaceAll() ⭐
Validate email/phone	                                                             matches()
Clean data	                                                                                 replaceAll()
🚀 Interview answer
“matches() checks whether the entire string satisfies a regex pattern, whereas replaceAll() is used 
to replace substrings that match a regex.”
 */
 
