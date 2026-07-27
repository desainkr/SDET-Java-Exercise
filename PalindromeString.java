package SDETInterview;

public class PalindromeString {
public static void main(String[] args) {
		
	System.out.println(isPal("anna")); // true
	System.out.println(isPal("civic")); // true
	System.out.println(isPal("apple")); // false
	System.out.println(isPal("level")); // true
}

public static boolean isPal(String str){
	
	int start =0;
	int end= str.length()-1;
	
	while(start < end)
	{
		if(str.charAt(start) != str.charAt(end)) {
			return false;
		}
		start++;
		end--;
	}
	
	return true;
	}
}

	//Approach 2
/*
String str = "madam1";
String reversed = "";
// Step 1: Reverse the string
for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i);
*/
