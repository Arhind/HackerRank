/* Hacker Rank 
 * Data Structure problem 
 * https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
 */
package hackerRank;

import java.util.*;
import java.util.Scanner;

public class TwoDArray1 {
	    
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        List<Integer> list = new ArrayList<>();
	        int n;
	        
	        n = sc.nextInt();
	        for(Integer i=0; i<n; i++)
	        {
	            list.add(sc.nextInt());
	        }
	        
	        sc.close();
	        for(Integer i=n-1; i>=0; i--)
	        	System.out.print(list.get(i)+" ");
	    }
}