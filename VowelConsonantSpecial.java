package SDETInterview;

public class VowelConsonantSpecial {

    public static void main(String[] args) {

        String input = "aB#c!eD@f$O";
        String vowels = "";
        String consonants = "";
        String special = "";

        for (char ch : input.toCharArray()) {

            if (Character.isLetter(ch)) {

            	/*
            	 If the character exists, it returns its index (0,1,2…)
                 If the character does NOT exist, it returns -1
                 "aeiouAEIOU".indexOf('a') → 0
				"aeiouAEIOU".indexOf('E') → 6
				"aeiouAEIOU".indexOf('x') → -1

            	 */
            	
                // Check vowel
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels += ch;
                } else {
                    consonants += ch;
                }

            } else {
                special += ch;
            }
        }

        
        String result = vowels + consonants + special;
        System.out.println("Input:  " + input);
        System.out.println("Output: " + result);
    }
}
/*
 Final takeaway
"aeiouAEIOU".indexOf(ch) != -1 is used because:
"aeiouAEIOU" is a string of vowels
indexOf(ch) checks if ch exists in that string
!= -1 means found
It is the cleanest, fastest, and most readable way to check vowels in Java
 */
