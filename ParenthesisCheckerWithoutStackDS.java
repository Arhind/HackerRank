
public class ParenthesisCheckerWithoutStackDS {

	public static void main(String[] args) {

		String s = "{[()]}{}";
		
		if(isValid(s))
			System.out.println("String is valid");
		else
			System.out.println("String is invalid");
	}
	
	static boolean isValid(String s)
	{
		char[] st1 = new char[s.length()];
		boolean ans = true;
		int top = -1;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(')
			{
				top++;
				st1[top] = s.charAt(i);
			}
				
			else if(s.charAt(i)==')')
			{
				if(!isEmpty(st1) && st1[top]=='(')
				{
					st1[top] = '\0';
					top--;
				}
				else
				{
					ans = false;
					break;
				}
			}
			
			else if(s.charAt(i)==']')
			{
				if(!isEmpty(st1) && st1[top]=='[')
				{
					st1[top] = '\0';
					top--;
				}
				else
				{
					ans = false;
					break;
				}
			}
			
			else if(s.charAt(i)=='}')
			{
				if(!isEmpty(st1) && st1[top]=='{')
				{
					st1[top] = '\0';
					top--;
				}
				else
				{
					ans = false;
					break;
				}
			}
		}
		
		isEmpty(st1);
		return ans;
	}

	static boolean isEmpty(char[] st)
	{
		boolean ans = true;
		for(int i=0; i<st.length; i++)
		{
			if(st[i]!='\0')
			{
				ans = false;
			}
		}
		return ans;
}
}