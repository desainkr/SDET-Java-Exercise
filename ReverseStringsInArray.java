package SDETInterview;
import java.util.Arrays;

public class ReverseStringsInArray {
	//reverse each string individually but keep it in the same array index,

   public static void  main(String [] args) {
	String[] arr = {"name", "tom", "java"};

     for (int i = 0; i < arr.length; i++) {
         arr[i] = new StringBuilder(arr[i]).reverse().toString();
     }
 System.out.println(Arrays.toString(arr));
     for (String str : arr) {
         System.out.print(str + " ");
     }
     
     
 }
}