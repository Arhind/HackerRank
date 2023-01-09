/*	Friend Function in Java
 * 	Friend function used to call other private functions of same class in which Friend function also present
 * 	Other functions should be private while friend function should be public
 * 	When no access modifier is used, then by default the member of a class is public within its own package, but cannot be accessed outside of its package.
 */
import java.util.Scanner;

class FriendFunctionExample{
	
	private int a=2,b=4;
	
	private void set()		//Set the value of variables
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		a = sc.nextInt();
		System.out.print("Enter value of b : ");
		b = sc.nextInt();
		sc.close();
	}
	
	private int calc()		//Calculate values of variables
	{
		return a*b;
	}
	
	private void get()		//Print values of variables
	{
		System.out.println("Product of "+a+" and "+b+" : "+calc());
	}
	
	void friend() 	//When no access modifier is used, then by default the member of a class is public within its own package, but cannot be accessed outside of its package.
	{
		set();
		calc();
		get();
	}
}

public class FriendFunction {

	public static void main(String[] args) {
		
		FriendFunctionExample ffe = new FriendFunctionExample();
		
		ffe.friend();
	}
}