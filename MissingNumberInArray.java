package SDETInterview;

public class MissingNumberInArray {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 7};
		//Missing one number
		//Array Should not have duplicates
		//Array no need to be sorted order
		//Values should be in range
		
		
		int sum1=0;
		int sum2=0;
		
	for(int i=0; i<arr.length;i++)
	{
		sum1=sum1+ arr[i];
	}
	System.out.println("Sumone" +sum1);
	for(int i=1; i<=7; i++)
	{
		sum2=sum2+i;
	}
	System.out.println("Sumtwo" +sum2);
	 System.out.println("Missing numer is  : " + (sum2-sum1));
	// Missing more than one number
	
	int[] missing = {1, 2, 4,  7};
	
	for (int i=0; i<missing.length-1 ; i++) {
		
		  int current = missing[i];
		  int next= missing[i+1];
		  
		  //check gap
		  
		  
		  for (int j=current+1; j<next; j++) {
			  
			  System.out.println(j);
		  }
		
		
		  
	}
	/*
	 Iteration-by-Iteration Breakdown
✅ Iteration 1 (i = 0)
current = arr[0] = 1
next    = arr[1] = 2

Inner loop:

for (int j = current + 1; j < next; j++)

👉 j = 2, but 2 < 2 ❌ → loop doesn’t run
👉 No missing number between 1 and 2

✅ Iteration 2 (i = 1)
current = 2
next    = 4

Inner loop:

j = 3 → 3 < 4 ✅ → print 3

👉 Missing number: 3

✅ Iteration 3 (i = 2)
current = 4
next    = 6

Inner loop:

j = 5 → 5 < 6 ✅ → print 5

👉 Missing number: 5

✅ Iteration 4 (i = 3)
current = 6
next    = 7

Inner loop:

j = 7 → 7 < 7 ❌ → loop doesn’t run

👉 No missing number

🧾 Final Output
3
5
🧠 Key Idea (Very Important)
for (int j = current + 1; j < next; j++)

This means:

Start just after current
Stop just before next
Whatever lies in between → missing numbers
📊 Visual Understanding

Array:

1   2   4   6   7
    ↑   ↑   ↑
   gap gap gap

Gaps:

Between 2 and 4 → 3 missing
Between 4 and 6 → 5 missing
	 */
	
	
	

	}

}
