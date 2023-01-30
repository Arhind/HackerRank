package coding;

import java.util.Scanner;

public class add_digit_funcall2 {

	static int add_digit( int N)
	{
		int sum=0;
		
		while( N>0)
		{
			sum = sum+N%10;
			N/=10;
		}
	return sum;	
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N=add_digit(N);
		System.out.println(N);
		sc.close();
	}
}