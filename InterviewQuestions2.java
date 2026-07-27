package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class InterviewQuestions2 {
	
	
	 public static void main(String[] args) {
		 
		//Reverse Every Word in a String While Keeping Word Positions Same 
		 String wdstr = "I like Tea";

		 String[] words = wdstr.split("\\s+");
		 String rev = "";

		 for (String wd : words) {
		     for (int i = wd.length() - 1; i >= 0; i--) {
		         rev += wd.charAt(i);   // add only character
		     }
		     rev += " ";  // add space AFTER finishing the word
		 }

		 System.out.println(rev.trim());

		 
		 
 /*   //reverse each string individually but keep it in the same array index,
		 		 
		 String[] arr = {"name", "tom", "java"};
		 
		  for (int i=0; i<arr.length; i++) {
			  
			  arr[i]=new StringBuilder(arr[i]).reverse().toString();
		  
		  }
		  System.out.println(Arrays.toString(arr));
      for (String   str:arr) {
    	  System.out.println(str);
      }
      
 //1.Write a program to print the reverse of the String? 
		// approach 1
		 
		 String  revstr="Reverse";
		 String rev="";
		 for(int i= revstr.length()-1; i>=0; i-- )
		 {
		            rev += revstr.charAt(i);
		 }
	
		 System.out.println("Reverse string  with for loop is : " +rev );
		 
 // approach 2
		 
		       StringBuilder revsb= new StringBuilder(revstr);
		       String revresult= revsb.reverse().toString();
		       System.out.println("Reverse string  with  StringBuilder is : " +rev );

		       //2.Write a program to print First non-repeated character from given String? 
		       
		       //Ex: Software Services  Output: o 
		       
		         String nonrepstr= "Software Services";
		          char[] chars = nonrepstr.toLowerCase().toCharArray();
		         Map<Character, Integer> freqMap= new HashMap<>();
		        
		         for (char ch:chars ) {
		        	 if (ch == ' ') continue;
		        	 freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
		         }
		         
		         System.out.println(freqMap);
		         
		         for (char ch:chars ) {
		        	 if (ch == ' ') continue;
		        	 if (freqMap.get(ch) ==1) {
		        		 
		        		  System.out.println("First non repeating char character is :" + ch);
		 				 break;
		        	 }
		         }
	  
	         //3.Write a program to print last non-repeated character from given String? 
		 
		              String str = "neelakanta";
		              char [] chars= str.toLowerCase().toCharArray();
		              Map<Character, Integer> freqRevMap= new HashMap<>();
		              
		              for(char ch:chars)
		              {
		            	  freqRevMap.put(ch, freqRevMap.getOrDefault(ch, 0)+1);
		            	  
		              }
		 System.out.println(freqRevMap);
		 
		              for(int  i=str.length()-1; i>=0; i--)
		              {		 char ch=Character.toLowerCase(str.charAt(i));
		              
		            	  if (freqRevMap.get(ch)==1) {
		            		  
		            		  System.out.println("Last non repeating char character is :" + ch);
				 				 break;
		            	  }
		            	  
		              }
	
		 
		 //Write a program to remove the duplicate  characters from the given String?
		 
		           //   Ex: banaans   Output: bans 
		              
		              String dupstr= "banaans";
		              char chars[]= dupstr.toCharArray();
		              List<Character>  duplicates = new ArrayList<>();
		              Set<Character>  seen= new LinkedHashSet<>();
		              
		              for(char ch:chars)
		              {
		            	   if (seen.contains(ch))
		            	   {
		            		   duplicates.add(ch);
		            	   }else {
		            		   seen.add(ch);
		            	   }
		            	  
		              }
		  if (duplicates.isEmpty()) {
			  System.out.println("After removing Duplicates : " +seen);
		  }else
		  {
			  System.out.println("Duplicates are : " + duplicates  );
			  
		  }
		  
	*
		 
		         
	// Convert Set to String
		 
		 StringBuilder result= new StringBuilder();
		  for(char ch :seen) {
			  result.append(ch);
		 }
		 System.out.println("Final String : " + result.toString());
		 
	 
		 //Write a program to count the number of  occurrences of each character in a string? 
		 
		 String feqstr="apple";
		 
		 Map<Character,Integer> frqmap= new HashMap<>();
		 for (char ch:feqstr.toLowerCase().toCharArray()) {
			 
			 frqmap.put(ch, frqmap.getOrDefault(ch, 0)+1);
		 }
		 
		 System.out.println(frqmap);
		 
		 for(Map.Entry<Character,Integer> entry: frqmap.entrySet()) {
			 
			 System.out.println(entry.getKey()+ "-->"+entry.getValue());
		 }
	 
	 //Write a program to print duplicate characters from the given String? 
		 
		  //ex: Programming  Output:  r, g, m 
		 String str= "Programming ";
		 char [] chars= str.toLowerCase().toCharArray();
		 List<Character>  duplicates = new LinkedList<>();
         Set<Character>  seen= new LinkedHashSet<>();
         
         for(char ch:chars)
         {
       	   if (seen.contains(ch))
       	   {
       		   duplicates.add(ch);
       	   }else {
       		   seen.add(ch);
       	   }
		  }
         
		  if (duplicates.isEmpty()) {
			  System.out.println("After removing Duplicates : " +seen);
		  }else
		  {
			  System.out.println("Duplicates are : " + duplicates  );
			  
		  }
       //  System.out.println("Duplicates are : " + duplicates);
         
         StringBuilder sb= new StringBuilder();
         for (char ch: duplicates) {
        	 
        	 sb.append(ch+",");
         }
         
    System.out.println(sb);
   
   //7. write a program to print all duplicate character  and their count form the given String? 
		 
		 String str= "Programming ";
		 char [] chars= str.toLowerCase().toCharArray();
		 Map<Character,Integer>  map = new HashMap<>();
       
              for(char ch:chars)
         {
        	 map.put(ch, map.getOrDefault(ch, 0)+1);
         }
   
       
    for(Map.Entry<Character,Integer> entry:map.entrySet() ) {
    	if (entry.getValue() >1)
    	{
    		System.out.println(entry.getKey() + " : "+entry.getValue());
    		
    	}
    	
    	
    }

		 //Write a program to print Highest occurred  character from given String? 
		 //Ex: aaaaabbcddddd  Output: a
		 
		  
		  String str="aaaaabbcddddd";
		 char [] chars= str.toLowerCase().toCharArray();
		 Map<Character,Integer>  map = new HashMap<>();
       
              for(char ch:chars)
         {
        	 map.put(ch, map.getOrDefault(ch, 0)+1);
         }
		 System.out.println(map);
	 // Approach  1 for Highest occurred
		 char maxChar = ' ';
		 int maxCount = 0;
		 for(Map.Entry<Character,Integer> entry:map.entrySet() ) {
		    	if (entry.getValue() >maxCount )
		    	{   
		    		maxCount=entry.getValue();
		    		maxChar= entry.getKey();
		    		
		    	}
}	
		 System.out.println("Highest occurred: " + maxChar + " = " + maxCount);	 
		                           
	                            // Approach  2 for Highest occurred
		 int maxCount = Collections.max(map.values());
		 for(Map.Entry<Character,Integer> entry:map.entrySet() ) {
		    	if (entry.getValue()  == maxCount )
		    	{   
		    		System.out.println("Highest occered  " +entry.getKey() + "=" + maxCount);
		    		
		    	}
}

		 // Write a program to remove the given Character from the given String? 
			//		 Ex: nacre Software 
			//		 Remove character: a 
			//		 Output: ncre Softwre 
		 String str= "nacre Software ";
		 char [] chars= str.toLowerCase().toCharArray();
		 List<Character> list= new ArrayList<>();
		 
		  for ( char ch:chars) 
		  {  
			  if (ch  != 'a')
			  {
				  list.add(ch);
			  }
			 			  
		  }
		 System.out.println(list);
		 
		 //Convert back to String
		 StringBuilder sb = new StringBuilder();
		 String result="";
		   for(char ch:list) {
			   
			  result= sb.append(ch).toString();
			 
		   }
		   System.out.println("Final String : " + result);
	
		   //Write a program to whether check given string   contains digits or not? 
		 
		 //Ex: nacre123     		 Output: Given String Contains Digits  
		 //  nacre#$                              Given  String not contain Digits 
		 
		   Scanner sc= new Scanner(System.in);
		  System.out.println("Enter String conatins DIGITS");
		  String strdigit= sc.nextLine();
		  char [] chars= strdigit.toCharArray();
		  
		  boolean hasDigit=false;
		  for (char ch:chars) {
			  
			 if(Character.isDigit(ch)) {
				 hasDigit=true;
			     break;
			  }
		  }
			 if (hasDigit) {
				    System.out.println("Given string contains Digits");
				} else {
				    System.out.println("Given string NOT contain Digits");
				}
	
		
			// 11. Write a program to whether check given string  contains Special Characters or not?   
			   //Ex: nacre123@#    nacre123 
		 
		      Scanner sc= new Scanner(System.in);
			  System.out.println("Enter String conatins Special characters");
			  String strspl= sc.nextLine();
			  char [] chars= strspl.toCharArray();
			  
			   boolean isSpecialChar= false;
			   
			   for (char ch:chars ) {
				   
				   if (!Character.isLetterOrDigit(ch)) {
					   isSpecialChar=true;
					   break;
				   }
			   }
			   
			   if(isSpecialChar) {
				   
				   System.out.println("Given string contains special characters");
			   }else
			   {
				   System.out.println("Given string NOT contains special characters");
				   
			   }
			  
		 
			  //2. Write a program to whether check given string  contains vowels or not?
		 
	              Scanner sc= new Scanner(System.in);
				  System.out.println("Enter String ");
				  String strspl= sc.nextLine();
				  char [] chars= strspl.toLowerCase().toCharArray();
				  
				 for(char ch: chars) {
					 
					 if (ch =='a' || ch =='e' ||ch =='I' ||ch =='o' ||ch =='u') {
						 System.out.println("String contains VOWELS");
						 break;
					 }else {
						 System.out.println("String contains NO VOWELS");
						 break;
					 }
				 }
	
		 //13. Write a program to count the characters, digits and Special Characters from the given String?
				 
				 String strall= "Nacre@123%";
				 char [] chars = strall.toCharArray();
				 int digits=0;
				 int character=0;
				 int specialchars=0;
				 for (char ch:chars) {
					 
					 if (Character.isLetter(ch)) {
						 character++;
					 } else if(Character.isDigit(ch))
					 {
						 digits++;
					 }else
					 {
						 specialchars++;
					 }
					 
					 
				 }
				 
				 System.out.println("Characters are : " +character );
				 System.out.println("Digits  are : " +digits );
				 System.out.println("specialchars are : " +specialchars );
				 
 
		 //4. Write a program to count the Capital letters and Small letters from the given String? 
		  //Ex: Nacre Software
		 String strall= "Nacre Software";
		 char [] chars = strall.toCharArray();
		 
		 int smallletters=0;
		 int capitaletters=0;
		 for(char ch:chars) {
			 
			 if (ch == ' ') continue;
			 
			 if ( ch >= 'A' &&  ch <='Z'){
				 capitaletters++;
		 } else if (ch >= 'a' &&  ch <='z') {
			 smallletters++;
		 }
		 }
		 System.out.println("Capital letters are : "+capitaletters);
		 System.out.println("Small letters are : "+smallletters);
	
 
		 //15Write a program to count the consonants and 	 vowels from the given String? 
		 
		 String  strvolcon="Nacre";
		 char [] chars= strvolcon.toLowerCase().toCharArray();
		 int vowels=0;
		 int consonents=0;
		  
		 for(char ch: chars) {
			 
			 if (ch =='a' || ch =='e' ||ch =='I' ||ch =='o' ||ch =='u') {
				 vowels++;
			 }else {
				 consonents++;
			 }
		 }
		 
		 System.out.println("Vowels count is : " + vowels);
		 System.out.println("consonents count is : " + consonents);
	 
	 //16. Write a program to find the percentages of characters, Digits and Special characters from the  given String?
		 
		 String strall= "Nacre@123%";
		 char [] chars = strall.toCharArray();
		 int digits=0;
		 int character=0;
		 int specialchars=0;
		 float len= strall.length();
		 for (char ch:chars) {
			 
			 if (Character.isLetter(ch)) {
				 character++;
			 } else if(Character.isDigit(ch))
			 {
				 digits++;
			 }else
			 {
				 specialchars++;
			 }
			 
			 
		 }
		  float c= (character/len)*100;
		  float d= (digits/len)*100;
		  float s= (specialchars/len)*100;
		 System.out.println("Characters % is : " +String.format("%.2f", c)+"%");
		 System.out.println("Digits  % is : " +String.format("%.2f", d)+"%");
		 System.out.println("specialchars % is : " +String.format("%.2f", s)+"%");
		
	 //17. Write a program to find the percentages of the 	 Consonants and vowels from the given String? 
		 
		 String  strvolcon="Consonents";
		 char [] chars= strvolcon.toLowerCase().toCharArray();
		 int vowels=0;
		 int consonents=0;
		  float len= strvolcon.length();
		 for(char ch: chars) {
			 
			 if (ch =='a' || ch =='e' ||ch =='I' ||ch =='o' ||ch =='u') {
				 vowels++;
			 }else {
				 consonents++;
			 }
		 }
		 
		   float v= vowels/len*100;
		   float c= consonents/len*100;
		 System.out.println("Vowels % is : " + String.format("%.2f", v)+"%");
		 System.out.println("consonents % is : " + String.format("%.2f", c)+"%");
		 
		 //18. Write a program to find the percentages of the Capital Characters , Small characters, 
		 //Special Characters and Digits from the given String?
		 		 String strall= "Nacre@123%";
				 char [] chars = strall.toCharArray();
				 float len= strall.length();
				 int smallletters=0;
				 int capitaletters=0;
				 int digits=0;
				 int character=0;
				 int specialchars=0;
				 for(char ch:chars) {
					 
					 if (ch == ' ') continue;
					 
					 if ( ch >= 'A' &&  ch <='Z'){
						 capitaletters++;
				 } else if (ch >= 'a' &&  ch <='z') {
					 smallletters++;
				 }
					 			 
				 if (Character.isLetter(ch)) {
					 character++;
				 } else if(Character.isDigit(ch))
				 {
					 digits++;
				 }else
				 {
					 specialchars++;
				 }
				 }
				  float c= (character/len)*100;
				  float d= (digits/len)*100;
				  float s= (specialchars/len)*100;
				  float cap= (capitaletters/len)*100;
				  float small= (smallletters/len)*100;
				 System.out.println("Characters % is : " +String.format("%.2f", c)+"%");
				 System.out.println("Digits  % is : " +String.format("%.2f", d)+"%");
				 System.out.println("specialchars % is : " +String.format("%.2f", s)+"%");
				 System.out.println("Capital % is : "+String.format("%.2f", cap)+"%");
				 System.out.println("Small % is : "+String.format("%.2f", small)+"%");
			
	 //19.Write a program to sort the given String? 
				 // Ex: nacre  Output: acenr
		 
		  String str= "avinash";
		  char [] chars= str.toCharArray();
		  Arrays.sort(chars);
		  System.out.println(chars);
		  
		  //20.Write a program to Check whether two given  Strings are anagram or not? 
		 
		 String Str1= "reaction";
		 String Str2 ="creation";
		 
		 if (Str1.length() != Str2.length())
		 {
			 System.out.println("it is NOT anagram");
			  }
		  // Covert string to Array 
		  char[] strarr1= Str1.toLowerCase().toCharArray();
		 char[] strarr2= Str2.toLowerCase().toCharArray();
		 
		 // Sort the array
		 
		  Arrays.sort(strarr1);
		  Arrays.sort(strarr2);
		  System.out.println(strarr1);
		  System.out.println(strarr2);
		  //compare the array
		  
		  if (Arrays.equals(strarr1,strarr2)) {
			  
			  System.out.println("Two Strings are anagrams ");
		  }else
		  {
			  System.out.println("Two strings are NOT anagram"); 
			  
		  }
  
      //21. Write a program to count occurrence of a given character from the String?	  
		  //	  Ex: Today is Monday 		  Given Character a 
		     //Approach 1
		     String str= "Today is Monday";
		     int totalCount= str.length();
		     int totalCount_afterremove= str.replace("a", "").length();
		     int count= totalCount-totalCount_afterremove;
		     System.out.println("Number of occurance  : "  + count);
		      //Approach 2
		     int count1=0;
		     for(int i=0;i<str.length();i++) {
		       	   if (str.charAt(i)=='a') {
		    		   count1++;
		    	   }   }
		     
		     System.out.println("Number of occurrence  : "  + count1);
     
	    
		 //22. Write a program to replace given character to other given Character in the string? 
		     
		 // Approach 1
		 String str="This is giil";
		 String result = str.replace("i", "#");
		 System.out.println(result);
		 // Approach 2
	 
		// 23. Write a program to Whether Given String is palindrome String or not?  
		 //A palindromic number is an integer that remains the same when its digits are reversed  (e.g., 121,3443,99)

                // Approach 1 for string
                  String str="madam";
                  String Original= str;
                  String reversed="";
                   
               for(int i=str.length()-1 ;i>=0;i--) {
            	   
            	   reversed= reversed+str.charAt(i);
               }
                  System.out.println(reversed);

             if (Original.equalsIgnoreCase(reversed) ) {
            	 System.out.println("Given String is Palindrome");
             }else {
            	 
            	 System.out.println("Given String is NOT Palindrome");
             }

    

             // Approach 1 for Number
             
              int num=121;
              int orgional1=num;
              int rev=0;
              
              while(num>0) {
            	  
            	  int digit= num%10;
            	  rev= rev*10+digit;
            	  num=num/10;
            	  
              }
              
              System.out.println(rev);
              if (orgional1 == rev) {
             	 System.out.println("Given String is Palindrome");
              }else {
             	 
             	 System.out.println("Given String is NOT Palindrome");
              }
 
		 //24. Write a Program to reverse words in a given String? 
		 
             //Ex: "Java is best programming language"      Output "language programming best is Java". 
		 
              
		 
		 String str="Java is best programming language";
		 
		 String words[]= str.split("\\s+");
		 
				 String rev="";
		  for (int i=words.length-1; i>=0;i--) {
		  
    		  rev= rev+words[i]+" ";
    		    }
			  
		 System.out.println(rev);

		 
		  //25. Write a program to reverse Words of the Given String? 
		  //Ex: "Today is Monday"  Output: yadoT si yadnoM 
		 
		  String str="Today is Monday";
		  String []words= str.split("\\s+");
		  String rev="";
		  for (String wd:words) {
		     for(int i =wd.length()-1;i>=0;i--)
			    	rev= rev+wd.charAt(i)+" ";
			   		    }
		  System.out.println(rev);
		  
	 //26. Write a program to copy one String to another String? 
		 //Ex: Str1=” nacre”, str2; 	 Output: sop(str2); //nacre 
		 
		 String Str11= "Neelakanta";
		 //String Str2=Stri1
		 String str22= new String(Str11);
		 System.out.println(str22);
		  
		//  Write a program to concat two Strings?
		// Ex: str1=” nacre” str2=” software”;   Output: nacre software
		 String str1 = "Neelakanta " ;
		 String str2 = " Reddy Desai";
		 String result =str1.concat(str2);
		 System.out.println(result);
	
		 //Write  a Program to print short name of given  string 
		 //Ex: Sanjeeva Reddy Nagar Output: SR Nagar 
		 
		 
		 
		 String fullName="Sanjeeva Reddy Nagar";
		 String [] words= fullName.split("\\s+");
		 String shortName = "";
		 
		 for(int i=0; i<words.length-1; i++)
		 {
		shortName +=Character.toUpperCase(words[i].charAt(0))+" ";
		 }
		System.out.println(shortName);
		 
		 // Add the last word fully
		
		shortName = shortName+words[words.length-1];
		 System.out.println("Original: " + fullName);
	     System.out.println("Short Name: " + shortName);
	   
//	     Explanation:
//	    	 Split: The split(" ") method divides the string into an array: ["Sanjeeva", "Reddy", "Nagar"].
//	    	 Loop: The loop iterates up to words.length - 1 (the last word).
//	    	 Character.toUpperCase: Takes the first character (charAt(0)) of each word and capitalizes it.
//	    	 Output: Appends the last word fully to the initials, resulting in "S R Nagar
	     
	     
		// 29. Swap first and last charecter of a given String   input:- NacrE   Output:-EacrN 
	   // input:- NacrE   Output:-EacrN 
		 
		 String input= "NacrE";
		 char [] chars= input.toCharArray();
		 char temp= chars[0];
//		 System.out.println(temp);
//		 System.out.println(chars[chars.length-1]);
		 chars[0]= chars[chars.length-1];
		 chars[chars.length-1]= temp;
		 String result = new String(chars); //converts the modified character array back into a String.
		 System.out.println(result); // EacrN
		 
	 
	 //30. remove duplicate elements/character from  array/String(dont use predefine logic) 
		 //Enter String:   Aabccdeeef 	 Aabcdef 
		 
		  String dup= "Aabccdeeef";
		  
		  Set<Character> set= new HashSet<>();
		  for(int i=0; i<dup.length();i++) {
			   set.add(dup.charAt(i));
		  }
		  System.out.println(set);
		    
		  //Convert back to String
			 StringBuilder sb = new StringBuilder();
			 String result="";
			 for(char ch:set) {
		  	 result= sb.append(ch).toString();
			   }
			 System.out.println("Final String : " + result);
	   
	//31. Display 2nd highest number from array. 
		 
		int[] arr = { 1, 8, 7, 6, 9, 4, 3, 2, 5, 6 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}            }
            System.out.println("Second highest: " + second);  // Output: 8	
            
            //Approach 2
           Arrays.sort(arr);
           System.out.println(Arrays.toString(arr));
           int secondHightes= arr[arr.length-2];
           System.out.println("Second highest with Sort and pic method: " + secondHightes);
      
	 //32.write a program of permutation. 
		 //input:- "abc"  output:-abc,acb,bac,bca,cab,cba 
		*/ 
		 
		}}