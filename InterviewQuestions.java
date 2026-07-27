package SDETInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class InterviewQuestions {
	
	
	 public static void main(String[] args) {
		
	/*//1.Find frequency of each element
		
		String str="Java is program and playwright is modern web tool and playwright free";
		String [] words= str.split("\\s+");
		Map<String,Integer> map= new HashMap<>();
		for(String word:words ) {
			map.put(word, map.getOrDefault(word, 0)+1);
			}
		
		System.out.println(map);
	

		
	//2. Print duplicate elements
		
			
			String str1="Neelakanta";
			List<Character> duplicates= new ArrayList<>();
			Set<Character>  seen= new HashSet<>();
			
			for(char ch: str1.toLowerCase().toCharArray()) {
				
				if (seen.contains(ch))
				{
					duplicates.add(ch);
				}else
				{
					seen.add(ch);
				}
		
			}
		
 //System.out.println("Duplicates are :" +duplicates );
//			System.out.println("No Duplicates :" +seen );
			
			if(duplicates.isEmpty()) {
				System.out.println(" No Duplicates  : " + seen);
			}else
			{
				
				System.out.println("Duplicates are : "+ duplicates);
			}
			
		
	
		 //3. Print array in reverse order
		    // approch 1
		 int []arr= {1,2,3,4,5,6};
		 List<Integer> list1 =new  ArrayList<>();
		 for (int i=arr.length-1; i>=0;i--) {
			 
			 // System.out.println(arr[i]+ "");
			 list1.add(arr[i]);
				 
		}
		 System.out.println(list1);
		  //Approach 2
		int []arr11= {1,2,3,4,5,6};
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Collections.reverse(list);
        System.out.println(list);	 


		 
	 //4.Find the largest element
		 
		  // Approach 1
		 List<Integer> listMax= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,20,40,80,100));
		  System.out.println(Collections.max(listMax));
		  //Approach 2
			 int []arrlarge= {1,2,3,4,5,6,20,40,80};
		 
		   int max = arrlarge[0];
		  for (int i=0; i<arrlarge.length;i++) {
		   if (arrlarge[i] >max) {
			     max= arrlarge[i];
			   		   }		   
		   }
		   
		   System.out.println("largest number is :" + max);
	
	 //5. Find the smallest element
		   
			 List<Integer> listMin= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,20,40,80,100));
			  System.out.println(Collections.min(listMin));
			  //Approach 2
				 int []arrmin= {1,2,3,4,5,6,20,40,80};
			    int min = arrmin[0];
			   for (int i=0; i<arrmin.length;i++) {
			   if (arrmin[i] <min) {
				     min= arrmin[i];
				   		   }		   
			   }
		    System.out.println("Minimum number is :" + min);

	 //6. Print sum of all items
		 
		  int num= 123456;
		  int sum=0;
	   while(num>0) {
		  int digit= num % 10;
		  sum=sum+digit;
		  num= num/10;
		     }
		 System.out.println("Sum of the all elements : " +sum); 
	
*/		// 7. Sort elements in ascending order
		 
		 int []  array= {1,2,3,4,5,6,7};
		 List<Integer> arrsort= new ArrayList<>(Arrays.asList(1,2,3,4,5,20,40,80,70,100,50));
		 Collections.sort(arrsort);
	     System.out.println(arrsort);
	     
	     //8. Find the 2nd largest number
	     
	    	     
	     List<Integer> secondNum= new ArrayList<>(Arrays.asList(1,2,3,4,5,20,40,80,70,100,50));
	     Collections.sort(secondNum);
	     Collections.reverse(secondNum);
	     int count =secondNum.size();
	     System.out.println(secondNum.get(1));
		 
	     
	     // Streams
/*	    //secondNum.stream().filter(Comparator.reverseOrder()).skip(1).first().forEach(System.out::println)
	
	     //9.Find the 2nd smallest number
	     List<Integer> secondSmallNum= new ArrayList<>(Arrays.asList(1,2,3,4,5,20,40,80,70,100,50));
	     Collections.sort(secondSmallNum);
	     int count1 =secondSmallNum.size();
	     System.out.println(secondNum.get(1));
	     
	    
	     
	    // 10. Separate odd and even numbers
		 //“Two-pointer approach is a technique where we use two indices to traverse a data structure, 
		 //often from different directions, to optimize time complexity and avoid nested loops”
	      int [] evenodds= {2,4,3,5,6,8,10,11};
	     
	     int left=0,right=evenodds.length-1;
	     int temp=0;
	     while(left<right)
	     {
	    	 if(evenodds[left] % 2 == 0) {
	       	 left++;
		     }else {
	    	 temp = evenodds[left];
	    	 evenodds[left]=evenodds[right];
	    	 evenodds[right]=temp;
	    	 right --;
	     }
}
	     System.out.println(Arrays.toString(evenodds));
	     

		// 11. Remove all white spaces
		 
		 //approach 1
		  String str10 = "neela kanta reddy desai";
		  String removeSpace = str10.replaceAll(" ", "");
		  System.out.println(removeSpace);
		  
		  //approach 2
	  
	 	//12. Prove String is immutable (with code)
	 
		 //approach 1
	    String str11= "Welcome";
	    String str21= "Welcome";
	    
	    str11+="Java";
	    if(str11== str21) {
	    System.out.println("Both are pointing to same object");
	  
	    }else
	    {
	    	System.out.println("Both are pointing to different object"); //Both are pointing to different object
	    }
	    //approach 2
	    
	    String str13= new String("Java");
	    System.out.println(str13);  //Java
	    str13.concat("Language");
	    System.out.println(str13);  //Java
	  
    //13. Count number of words in a string
	    
	     String word= "Playwright is modern web automation tool";
	     String [] words11= word.split("\\s+");
	      	 System.out.println(words11.length);
	    
	    
	    //14. Check if a number is a palindrome  -121
		 
		 int  number = 111;
		 int original = number;
		 int reversed=0;
		
		  while (number>0) 
		            {
			  int digit= number%10;
			  reversed= reversed*10 +digit;
			  number= number/10;
	             	  }
			 
		 if (original ==reversed)
		 {
			  System.out.println("Number as palindrome");
		 }else
		 {
			 System.out.println("Not palindrome Number");
			 
		 }
		 
		 
	
		// 14.A  Check if a String is a palindrome  -121
		 
		   String palindrome= "madam";
		   String origonal1=palindrome;
		    char [] chars= palindrome.toLowerCase().toCharArray();
		   String Reverse1="";
		   for(int i=chars.length-1; i>=0;i--) {
			   Reverse1 += palindrome.charAt(i);
			   
		   }
		   
		 if(origonal1.equalsIgnoreCase(Reverse1))
		 {
			 System.out.println("String as palindrome");
		 }else
		 {
			 System.out.println("NOT a palindrome String"); 
			 
		 }
		 
	
		 //15. Reverse a string
		        //approach one
		     String rev= "desai";
		     StringBuilder sb= new StringBuilder(rev);
		     System.out.println(sb.reverse().toString());
		    
		  //approach two
		    
		      String revstr= "Neelakanta";
		      String rev11="";
		      for (int i=revstr.length()-1; i>=0; i--)
		      {
		    	  rev11 +=revstr.charAt(i);
		      }
		    
		 System.out.println("Reverse string is : "+rev11);

		 */
		 
	
		// 16. Remove leading zeros
		 
		     String input = "000123400";
		     //Approach 1
		     String result= input.replaceAll("^0+", ""); //^0+ → matches all zeros at the start   replaceFirst removes them
		     //System.out.println(result);
		   // handle case like "0000"
		 
		   if(result.isEmpty()) {
			   result="o";
		   }
		    System.out.println(result); //123400
		  //Approach 2
		    String input1 = "000123400";
		    int i=0;
		    
		    while(i < input1.length() && input1.charAt(i)=='0')
		    {
		    	i++;
		    }
		  //  👉 It moves index i forward ONLY while characters are '0'
		  //  👉 The moment it sees anything other than '0' → it stops
		    String result1= input1.substring(i);  //“input.substring(3)      Give me the string starting from index i till the end”
		    
		    // if all zeros
		    
		    if(result1.isEmpty()) {
		    	result1="0";
		    }
		    
		    System.out.println(result1); // 123400
		    
		    
		//if you wanted trailing zeros removed  ---->    input.replaceFirst("0+$", "")
		//If you wanted to remove ALL zeros    - --->    input.replace("0", "")   
		   
	/*	 //17. Print first letter of each word
		 
		 String firstLetter= "Neelakanta Reddy Desai";
		 String [] words= firstLetter.split("\\s+");
		 for (String wd:words) {
		 System.out.println(wd.charAt(0)+ ".");
		 
		 //18. Longest substring without repeating characters
		 
		 
		 }
		 */
		 
		 
}	
}		
		