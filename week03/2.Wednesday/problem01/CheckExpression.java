package problem01;

import java.util.Stack;

public class CheckExpression {
	public static boolean isCorrect(String text) {
		if (text.charAt(0) != '(' || text.charAt(text.length() - 1) != ')' || text.length() % 2 == 1)
			return false;
		Stack<Character> myStack = new Stack<>();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(')
				myStack.push('(');
			else if (text.charAt(i) == ')') {
				if (myStack.empty())
					return false;
				myStack.pop();
			}
		}
		return myStack.empty();
	}
	
	public static void main (String[] args)
	{
		System.out.println(isCorrect(new String ("((())(((()))")));
	}
	

}
