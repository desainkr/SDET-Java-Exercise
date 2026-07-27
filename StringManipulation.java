package SDETInterview;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String input = " r@56vi Ku $%mar67";

		char[] chars = input.toCharArray();
		int sum = 0;

		StringBuilder sb = new StringBuilder();

		for (char ch : chars) {
		    if (Character.isLetter(ch)) {
		        sb.append(ch);
		    } else if (Character.isDigit(ch)) {
		       // sum += ch - '0';
		    	sum += Character.getNumericValue(ch);
		    }
		}
		

		sb.append(" ").append(sum);

		System.out.println(sb.toString());

	}

}
