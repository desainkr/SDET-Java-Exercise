package SDETInterview;

public class ReverseEveryWordinaString {

	public static void main(String[] args) {
		//Reverse Every Word in a String 
		String wdstr = "I like Tea";

		String[] words = wdstr.split("\\s+");
		String rev = "";

		for (String wd : words) {
		    for (int i = wd.length() - 1; i >= 0; i--) {
		        rev += wd.charAt(i);   // add only character
		    }
		    rev += " ";  // add space AFTER finishing the word
		}

		System.out.println(rev.trim());
   
		
		
	}

}
