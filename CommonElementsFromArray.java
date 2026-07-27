package SDETInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsFromArray {

	public static void main(String[] args) {
		
		String  [] arr1= {"A", "B", "C", "D", "E"};
		String  [] arr2= {"A", "B", "G", "D", "F"};
		
//		Set<String> set= new HashSet<>();
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//		
//				if (arr1[i].equals(arr2[j]))
//				{
//				    set.add(arr1[i]);
//				}
//		
//		System.out.println(set);  //[A, B, D]
//		for(String s:set)
//		{
//			System.out.println(s); //A			B			D
//
//		}
//		
		
		 // OR 
		
		String[] arr11 = {"A", "B", "C", "D", "E"};
		String[] arr22 = {"A", "B", "G", "D", "F"};

		Set<String> set1 = new HashSet<>(Arrays.asList(arr11));
		Set<String> set2 = new HashSet<>(Arrays.asList(arr22));

		set1.retainAll(set2);  // keeps only common elements

		System.out.println(set1);  // [A, B, D]
		
	}


}