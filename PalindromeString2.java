package SDETInterview;

public class PalindromeString2 {

	public static void main(String[] args) {

		String str = "civic";
		String org_str = str;

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		//System.out.println("Reverse string  is :" + rev);

		if (org_str.equalsIgnoreCase(rev)) 
		{
			System.out.println(org_str  + "   is Plaindrome  String");
		} else
		{
			System.out.println(str + "     is  NOT a Plaindrome String");

		}

	}

}
