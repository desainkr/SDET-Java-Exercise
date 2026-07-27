package SDETInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Countfrequencyofagivenwordinaparagraph {
/*
 * 
 Idea
Normalize text (lowercase, remove punctuation)
Split into words
Count matches
 */
	public static void main(String[] args) {
        
	        String paragraph = "Java is great. Java is powerful. Java I love Java!";
	        String[] words = paragraph.toLowerCase()
	                                  .replaceAll("[^a-z ]", "")
	                                  .split("\\s+");
	    	String word = "java";
	        Map<String, Integer> freq = new HashMap<>();

	        for (String wd : words) {
	            freq.put(wd, freq.getOrDefault(wd, 0) + 1);
	        }

	        // Print all words
	        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	        // Print only "java"
	        System.out.println("Frequency of java: " + freq.get("java"));
            // another approach
	        
	        
		      List<String> wordlist= new ArrayList<>();
		    
		        for (String  wd:words)
		        {
		        	 if(wd.contains(word))
		        	 {
		        		 wordlist.add(wd);
		        	 }
		        	 
		        }
		        System.out.println("Number of occurance of word is : " + wordlist.size());
	    }
	        
	}


