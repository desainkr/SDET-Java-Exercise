package SDETInterview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesCharactersFomGivenString {

	public static void main(String[] args) {
		String str = "Neelakanta";
		char[] chars = str.toLowerCase().toCharArray();
		List<Character> duplicates = new ArrayList<>();
		Set<Character> seen = new LinkedHashSet<>();

		for (char ch : chars) {

			if (seen.contains(ch)) {

				duplicates.add(ch);

			} else {
				seen.add(ch);
			}

		}
	
		System.out.println("After removing duplicate characters : " + seen);
		System.out.println("Duplicate characters : " + duplicates);

	}

}
