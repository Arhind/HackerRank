//https://www.hackerrank.com/challenges/crush/problem?h_r=next-challenge&h_r=next-challenge&h_v=zen&h_v=zen&isFullScreen=false

package hackerRank;
import java.util.*;

class ArrayManipulation{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of Array : ");
		int n = sc.nextInt();
		System.out.print("Enter queries : ");
		int q = sc.nextInt();
		long[] array = new long[10000000];
		long max = 0;
				
		// Processing
		for(int i=1; i<=q; i++)
		{
			System.out.print("Enter a : ");
			int a = sc.nextInt();
			System.out.print("Enter b : ");
			int b = sc.nextInt();
			System.out.print("Enter k : ");
			long k = sc.nextInt();
			
			for(int index=a; index<=b; index++)
			{
				array[index] = array[index] + k;
			}
		}
		
		for(int i=1; i<=n; i++)
		{
			if(array[i]>max)
				max = array[i];
		}
		
		System.out.println("max : "+max);
			
		sc.close();
	}
}