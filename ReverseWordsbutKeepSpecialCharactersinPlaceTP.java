package SDETInterview;

public class ReverseWordsbutKeepSpecialCharactersinPlaceTP {

	public static void main(String[] args) {
		   //Reverse Words but Keep Special Characters in Place TP
		String str="ab#cd$ef"; // output "fe#dc$ba"
		/* We use a two-pointer approach, skipping special characters and 
		 *swapping only alphanumeric characters, 
		ensuring special characters remain in their original positions. */
		 char [] arr= str.toCharArray();
		  int left=0, right=arr.length-1;  //left = 0 (a)  right = 7 (f)
		 
		 while(left < right) { // arr[left] = 'a' (valid)  arr[right] = 'f' (valid)
			 
			 if (!Character.isLetterOrDigit(arr[left])) {
				 	 left++;
			 } else if(!Character.isLetterOrDigit(arr[right])) {
				 	 right--;
			 } else {
				 
				 char temp= arr[left];
				 arr[left]= arr[right] ;
				 arr[right]= temp;
				left++;
				right--;
				 
			 }	 
			 }
		 
			 System.out.println(arr);
			 
			 
			 
		 }
		
		
	
	}

/*
 Step-by-Step Execution
👉 Input:
a b # c d $ e f
0 1 2 3 4 5 6 7
left = 0 (a)
right = 7 (f)
✅ Step 1
arr[left] = 'a' (valid)
arr[right] = 'f' (valid)

👉 Swap

f b # c d $ e a
left → 1
right → 6
✅ Step 2
arr[left] = 'b' (valid)
arr[right] = 'e' (valid)

👉 Swap

f e # c d $ b a
left → 2
right → 5
✅ Step 3
arr[left] = '#' ❌ (special)

👉 Skip it:

left → 3
✅ Step 4
arr[right] = '$' ❌ (special)

👉 Skip it:

right → 4
✅ Step 5
arr[left] = 'c' (valid)
arr[right] = 'd' (valid)

👉 Swap

f e # d c $ b a
left → 4
right → 3
⛔ Stop Condition

left >= right → loop ends

✅ Final Output
fe#dc$ba
🧠 Key Logic (Very Important)
3 Conditions inside loop:
1️⃣ Left is special
if (!Character.isLetterOrDigit(arr[left]))
    left++;
2️⃣ Right is special
else if (!Character.isLetterOrDigit(arr[right]))
    right--;
3️⃣ Both are valid → swap
else {
    swap
}
🎯 Why This Works
Special characters are never moved
Only valid characters are swapped
Two pointers ensure O(n) time & no extra space

*/