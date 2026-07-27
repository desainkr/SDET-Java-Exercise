package SDETInterview;

import java.util.Stack;

public class BalancedParenthesesTest {
	/*
	 * This statement instantiates an empty LIFO (Last-In, First-Out) stack that holds objects of the Character
	 1.Open brackets must be closed by the same type of brackets
	 2.Open brackets must be closed in the correct order
	 3.Every close bracket has a corresponding open bracket of the same type
	 
	 push(char item): Places a character onto the top of the 
	 stack.pop(): Removes and returns the top character.
	 peek(): Looks at the top character without removing it.
	 isEmpty(): Returns true if the stack contains no elements
	 search(Object o): Returns the 1-based distance of an item from the top
	 */
	public static boolean isBalanced(String str) {
		
	Stack<Character>  stack = new Stack<>();
	/*
	 *Stack<Character> stack = new Stack<>(); creates a Last-In, 
	 *First-Out (LIFO) data structure designed specifically to hold Character objects
	 */
	 for (char ch : str.toCharArray()) {

	        // Opening brackets → push to stack
	        if (ch == '{' || ch == '[' || ch == '(') {
	            stack.push(ch);
	        }

	        // Closing brackets → check match
	        else if (ch == '}' || ch == ']' || ch == ')') {

	            if (stack.isEmpty()) return false;

	            char top = stack.pop();

	            // Matching logic
	            if ((ch == ')' && top != '(') ||
	                (ch == '}' && top != '{') ||
	                (ch == ']' && top != '[')) {
	                return false;
				}
		}
		   
		
	}
	
	return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		
	//System.out.println(isBalanced("({[)}]))")); //false
		System.out.println(isBalanced("{[()]}"));
		

	}

}
