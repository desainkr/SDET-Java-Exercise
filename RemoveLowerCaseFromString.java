package SDETInterview;

public class RemoveLowerCaseFromString {
/*
 Explanation:
[a-z] is a regular expression that matches any character from 'a' to 'z' (inclusive).
The replaceAll() method finds every occurrence of a lowercase letter and replaces it with "" (an empty string), effectively removing it.
The original string in Java is immutable, so a new string object is created with the modifications. 
 */
	public static void main(String[] args) {
		//Approach 1
		String str="abc ABC 123 abc";
		String result= str.replaceAll("[a-z]", "");
		System.out.println(result);
		
		//Approach 2
		StringBuilder sb= new StringBuilder();
		for (char ch: str.toCharArray()) {
			 if (!Character.isLowerCase(ch)) {
				 sb.append(ch);
			 }
		}
System.out.println(sb.toString());
	}

}

