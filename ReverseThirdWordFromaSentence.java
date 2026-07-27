package SDETInterview;

public class ReverseThirdWordFromaSentence {

	public static void main(String[] args) {
		
		String str="I love java coding";
		String [] words= str.split("\\s+");
	
	 for (int i=0; i<words.length; i++)
	 {              if(i==2)	 { words[i]=new StringBuilder(words[i]).reverse().toString();	 }
		 	 }
		System.out.println(String.join(" ", words));

	
		
		/*
	Interview-ready answer

“toString() converts an object to string, whereas String.join() is used to 
concatenate multiple strings with a delimiter, which is why 
it’s suitable for rebuilding a sentence from an array.”
✅ String.join()
👉 Used for:
Combining multiple strings → single string
🔍 In your case
You have:
String[] words = {"I", "love", "avaj", "coding"};
👉 Now you want:
"I love avaj coding"
✅ That’s why we use:
String.join(" ", words);
👉 Meaning:
Join all words with space in between
		
		
		When to use what
		Scenario	                                                  Use
		Single object → string	                         toString()
		Array/List → sentence	                         String.join() ⭐
		Performance critical loop	                 StringBuilder
		
		*/
	}

}
