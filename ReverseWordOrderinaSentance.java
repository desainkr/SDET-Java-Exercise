package SDETInterview;

public class ReverseWordOrderinaSentance {

	
	public static void main(String[] args) {
		
		String str="Java is fun "; // output: Fun is Java
			String [] words= str.split("\\s+");
			String rev="";
			for(int i=words.length-1;i >= 0;i--) {
						rev= rev+words[i]+ " ";
			}
		System.out.println(rev);	
		
		//Approach 2
		
		StringBuilder sb= new StringBuilder();
		for (int i=words.length-1; i>=0 ;i--)
		{			sb.append(words[i]).append(" ");
					}
		System.out.println(sb.toString());
		
			}

}
