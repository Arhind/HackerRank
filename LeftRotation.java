/*	HackerRank Problem
 * 	Left rotation of array
 * 	https://www.hackerrank.com/challenges/array-left-rotation/problem?h_r=next-challenge&h_v=zen
 */
package hackerRank;
import java.util.*;

public class LeftRotation{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n = sc.nextInt();
		System.out.print("Enter left rotations : ");
		int rotation = sc.nextInt();
		int[] arr = new int[100];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		 //Rotate the given array by rotation times toward left  
		for(int i=0; i<rotation; i++)
		{
			int first = arr[0];
			
			for(int j=0; j<n; j++)
			{
				arr[j] = arr[j+1];
			}
			
			arr[n-1] = first;
		}
		
		// Display Left rotated array
		System.out.println("Final Array");
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");

		sc.close();		// Saving from memory leak
	}
}