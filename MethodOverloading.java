import java.io.BufferedReader;
import java.io.InputStreamReader;

class Add{
			static int add( int a1, int a2) {
				int temp = a1+a2;
				System.out.println(a1+"+"+a2+"="+temp);
				return temp;
			}
			static int add( int a1, int a2, int a3) {
				int temp = a1+a2+a3;
				System.out.println(a1+"+"+a2+"+"+a3+"="+temp);
				return temp;
			}
			static int add( int a1, int a2, int a3, int a4, int a5) {
				int temp = a1+a2+a3+a4+a5;
				System.out.println(a1+"+"+a2+"+"+a3+"+"+a4+"+"+a5+"="+temp);
				return temp;
			}
			static int add( int a1, int a2, int a3, int a4, int a5, int a6) {
				int temp = a1+a2+a3+a4+a5+a6;
				System.out.println(a1+"+"+a2+"+"+a3+"+"+a4+"+"+a5+"+"+a6+"="+temp);
				return temp;
			}
}
	
public class Solution{

	public static void main( String args[])
	{
		try 
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter values one by one : ");
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			
			Add ob = new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);
			ob.add(n1,n2,n3,n4,n5,n6);
		}
		
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}
}