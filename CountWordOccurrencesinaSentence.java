package SDETInterview;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrencesinaSentence {
	
	public static void main(String[] args) {
		
		String str="my name is Claude Claude";
		
		String [] words= str.split("\\s+");
		Map<String,Integer> map=new HashMap<>();
		for (String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
	}

}
