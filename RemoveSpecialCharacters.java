package SDETInterview;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		//Approach 1
		String str="Hi! @Home";
		
		String result= str.replaceAll("[^a-zA-Z]", " ");
		System.out.println(result);
		
		//Approach 2
		
		StringBuilder sb= new StringBuilder();
		for(char ch:str.toCharArray())
		{
			 if(Character.isLetterOrDigit(ch) || ch == ' ')
			 {
				 sb.append(ch);
				 
			 }
		}
		System.out.println(sb);
	
		
	}	}


