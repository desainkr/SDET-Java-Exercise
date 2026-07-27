package SDETInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWordsInSentence {
	

	public static void main(String[] args) {
		//Approach  1
		String str="Keep it simple";
		String [] words= str.split("\\s+");
		//System.out.println(words.length);
		//Approach  2
	List<String> list= new ArrayList<>();
	  
	  for (String word:words)
	  {
	      list.add(word);
	  }
	  	  System.out.println(list.size());
			
    //Approach 3
	   
	  	int count = str.trim().split("\\s+").length;
	  	System.out.println(count);
	}
}
