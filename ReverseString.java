package SDETInterview;

public class ReverseString {

	public static void main(String[] args) {
		
	 String str="Java";
	 String rev="";
	 //Approach 1 using regular for loop
	 for (int i=str.length()-1; i>=0;i--) {
		 rev=rev+str.charAt(i);
	 }
		System.out.println("Reverse String is : " + rev);
		//Approach 2 using StringBuilder
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println("Reverse String is thru StringBuilder is: " + sb);
		
		 //or 
	
		
		for (int i = str.length() - 1; i >= 0; i--) {
		    sb.append(str.charAt(i));
		}

		System.out.println(sb.toString());
		
		//Approach 3 StringBuffer
		
		StringBuffer sbuff = new StringBuffer(str);
		sbuff.reverse();
		System.out.println("Reverse String is thru StringBuffer is: " + sbuff);
			}

}
