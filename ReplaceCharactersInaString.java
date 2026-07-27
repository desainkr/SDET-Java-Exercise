package SDETInterview;

public class ReplaceCharactersInaString {

	public static void main(String[] args) {
		String str="apple";   // replace p by z
		// Approach 1
		String result= str.replace('p', 'z');
		System.out.println(result);
		
		// Approach 2		
		StringBuilder sb= new StringBuilder(str);
		for (int i=0; i<str.length();i++) {
			 if (str.charAt(i)=='p') {
				 sb.setCharAt(i, 'z'); // setCharAt is used to modify a character at a specific index
			 }		}
		String str1 = sb.toString(); // Convert the StringBuilder back to a String
		System.out.println(str1); // Output: azzle
		
	}}

