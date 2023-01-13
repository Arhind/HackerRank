/* Parenthesis checker using Stack DS
 * 
 */
import java.util.Stack;

public class ParenthesisCheckerStackDS {

	public static void main(String[] args) {

		String s = "{[{[()}]]}";
		
		if(isValid(s))
			System.out.println("String is valid");
		else
			System.out.println("String is invalid");			
	}
	
	static boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<>();
		boolean ans = true;
		
		for(int i=0; i<s.length(); i++)
		{
			if( s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(' )
			{
				stack.push(s.charAt(i));
			} 
			
			else if( s.charAt(i)==')' )
			{
				if( !stack.isEmpty() && stack.peek()=='(')
				stack.pop();
				else
				{
					ans = false;
					break;	
				}
			}

			else if( s.charAt(i)==']' )
			{
				if( !stack.isEmpty() && stack.peek()=='[')
				stack.pop();
				else
				{
					ans = false;
					break;	
				}
			}
			
			else if( s.charAt(i)=='}' )
			{
				if( !stack.isEmpty() && stack.peek()=='{')
				stack.pop();
				else
				{
					ans = false;
					break;	
				}
			}
		}
		
		if( !stack.isEmpty())
			ans = false;
		
		return ans;
	}
}
