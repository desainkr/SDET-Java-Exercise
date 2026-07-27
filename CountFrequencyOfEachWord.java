package SDETInterview;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfEachWord {

	public static void main(String[] args) {
		String str= "Cat Dog Cat";
		String [] words= str.split("\\s+");
//		Map<String,Integer> fequencyMap= new HashMap<String,Integer>();
//		
//		for (String word:words) {
//				 if(fequencyMap.containsKey(word)) {
//			 fequencyMap.put(word, fequencyMap.get(word)+1);
//			 }else
//			 {
//				 fequencyMap.put(word, 1);
//			 }
//		}
//		System.out.println(fequencyMap);
//		 
		//OR
		
		String str1= "My name is Neel  Neel system";
		String [] words1= str1.split("\\s+");
		Map<String,Integer> map= new HashMap<String,Integer>();
		for (String wd: words1) {
			
			map.put(wd, map.getOrDefault(wd,0)+1);
		
		}
	 
		System.out.println(map);
	}

}
