package SDETInterview;

public class Reverseeachwordindividuallywhilekeepingspacesinplace {

	public static void main(String[] args) {
		// Reverse each word individually while keeping spaces in place
		String  str= "abc de f";
		String[] words= str.split("\\s+");
		 String result="";
		for (String word: words) {
			 String rev="";
		      for(int i=word.length()-1; i >=0; i--) {
		    	  	  rev= rev+word.charAt(i);
		    	      }
				  	result= result+rev+" ";			  }
			System.out.println(result);
		
	           //OR
			
			
			StringBuilder result1 = new StringBuilder();
			for (String word: words) {
				
				 result1.append(new StringBuilder(word).reverse().append(" "));
			}
			
			System.out.println(result1.toString());

			
}
}