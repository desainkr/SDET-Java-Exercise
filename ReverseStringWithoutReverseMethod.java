package SDETInterview;

public class ReverseStringWithoutReverseMethod {
	
	public static void main(String[] args) {
		//two pointer -Using Char Array
		String str="Selenium";
		char[] arr= str.toCharArray();
		int left=0, right=arr.length-1;
		while (left<right)
			
		{
			char temp= arr[left];
			         arr[left]=arr[right];
			         arr[right]=temp;
				      left++;
				      right--;
		}
		System.out.println("Using two point method : " +arr);
		//new String(arr) converts char array into a proper String object, making your code clearer and more reusable.
		//“Convert char array → String”--Creates a String object from char array
		 // Approach 2
		
		StringBuilder sb= new StringBuilder();
		
		for(int i=str.length()-1; i>=0;i--) {
			
			sb.append(str.charAt(i));
			
		}
		System.out.println("Using for loop with stringbuilder : " + sb);
		/*
		 *“For readability I use StringBuilder, but for optimal space complexity I prefer two-pointer approach.”
		 Key Difference (VERY IMPORTANT)
							Approach                              	Memory	                                               Behavior
							StringBuilder loop	                     Extra memory	                                  Creates new string
							Two-pointer	                              In-place	                                           Modifies array
		 */
	}
}
