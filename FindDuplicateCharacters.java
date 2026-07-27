package SDETInterview;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		
		String str="testing";
		List<Character>  duplicates= new ArrayList<>();
		Set<Character>  seen=new HashSet<>();
		for(char ch : str.toCharArray()) {
			if (ch ==(' ')) continue;
			 if (seen.contains(ch)) {
				  duplicates.add(ch);
			 }else {
				 seen.add(ch);
			 }		}
		
		if(duplicates.isEmpty()) {
			 System.out.println("No Duplicates " +str);
		}
		else {
      System.out.println("Duplicates " +duplicates);}
		}
	}

