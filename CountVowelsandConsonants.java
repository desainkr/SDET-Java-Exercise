package SDETInterview;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		
		String str="Automation";
		
		char [] chars= str.toLowerCase().toCharArray();
		int vowels=0;
		int consonents=0;
		for (char ch:chars) {
			if(Character.isLetter(ch)) {
					  if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
					   vowels++;
				  }else {
							  consonents++;
				  }		}			
		}
  System.out.println("Vowels are :" +vowels);
  System.out.println("consonents are :" +consonents);
	}

}
