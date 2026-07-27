package SDETInterview;

public class RemoveSpecificCharacter {
	

	public static void main(String[] args) {
		String str="Cloud";// remove u
		//approach 1
		String result = str.replaceAll("u", "");
		System.out.println(result);
		//approach 2
		StringBuilder sb= new StringBuilder(str);
		int remove =3; //index of u
		sb.deleteCharAt(remove);
		System.out.println(sb);
		
		
	}

}
