package SDETInterview;

public class Replacingvowelsinastring {

	public static void main(String[] args) {
		String str = "Hello World";
		  //approach one
		String result= str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(result);
		 
		//approach two-Case-insensitive flag:
		
		String result1 = str.replaceAll("(?i)[aeiouAEIOU]", "#");
		System.out.println(result1);
		
		//Approach three
		
		StringBuilder sb= new StringBuilder();
		 for (char c: str.toCharArray()) {
			 
			 if ("aeiouAEIOU".indexOf(c) >= 0) {
				    sb.append("*");
				} else {
				    sb.append(c);
				}

			 
					 }
		String result2= sb.toString();
		System.out.println(result2);
	}

}
