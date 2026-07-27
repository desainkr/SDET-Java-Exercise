package SDETInterview;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachCharacter {

	public static void main(String[] args) {
//		String str= "aabbc";
//		
//		Map<Character,Integer> fequencyMap= new HashMap<Character,Integer>();
//		
//		for (char ch:str.toCharArray()) {
//			
//		//	 if(fequencyMap.containsKey(ch)) {
//				 fequencyMap.put(ch, fequencyMap.getOrDefault(ch, 0)+1);  // working
//				
//				 
////				 fequencyMap.put(ch, fequencyMap.get(ch)+1);
////				 
////			 }else
////			 {
////				 fequencyMap.put(ch, 1);
////			 }
//		}
//		
//		System.out.println(fequencyMap);
		
		String str= "My name is Neel  Neel system";
		Map<String,Integer> frequencyMap= new HashMap<String,Integer>();
		String [] words= str.split("\\s+");
		for (String word: words) {
			
			frequencyMap.put(word, frequencyMap.getOrDefault(word,0)+1);
					}
		/*
		 map.getOrDefault(word, 0)
👉 Means:
•	If key exists → return its value 
•	If key does NOT exist → return 0
“We don’t need an if-condition because getOrDefault() handles both cases
—when the key exists and when it doesn’t—by returning a default value.”

		 */
		System.out.println(frequencyMap);
	
}
}