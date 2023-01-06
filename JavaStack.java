//Parenthesis check
//https://www.hackerrank.com/challenges/java-stack/problem?isFullScreen=false

package hackerRank;
import java.util.*;

class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
     
     // Complete the code
         
         Stack<Character> st = new Stack<>();
         boolean ans = true;
         for(int i=0; i<input.length(); i++)
         {
             if( input.charAt(i)=='{' || input.charAt(i)=='[' || input.charAt(i)=='(')
             {
                 st.push(input.charAt(i));
                 ans = false;
             } 
             else if (input.charAt(i)==')') 
             {
                 if(!st.isEmpty() && st.peek()=='(')
                 {
                     st.pop();
                     ans = true;
                 }
                 else
                 {    ans = false;
                      break;
                 } 
             }
             else if (input.charAt(i)==']') 
             {
                 if(!st.isEmpty() && st.peek()=='[')
                 {
                     st.pop();
                     ans = true;
                 }
                 else
                 {    ans = false;
                      break;
                 } 
             }
             else if (input.charAt(i)=='}') 
             {
                 if(!st.isEmpty() && st.peek()=='{')
                 {
                     st.pop();
                     ans = true;
                 }
                else
                 {    ans = false;
                      break;
                 } 
             }
         }

         if(!st.isEmpty())
             ans = false;

         System.out.println(ans);
		}		
		
		sc.close();
	}
}