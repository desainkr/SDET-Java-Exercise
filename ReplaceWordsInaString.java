package SDETInterview;

public class ReplaceWordsInaString {

	public static void main(String[] args) {
		String str="I like Tea";   // replace Tea by Java
		// Approach 1
		String result =str.replace("Tea", "Java");  
		System.out.println(result);
		// Approach 2
//		String newStr = str.replaceFirst("Tea", "Java");
//		System.out.println(newStr); // Output: I like Java
		
		// Approach 3
	
		StringBuilder sb = new StringBuilder(str);
		 int index= sb.indexOf("Tea");
		 
		 if (index != -1) {
			 sb.replace(index, index + 3, "Java");
		 }
		 System.out.println(sb.toString());
		
	}}