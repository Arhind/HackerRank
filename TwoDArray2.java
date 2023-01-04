/* Hacker Rank 
 * Data Structure problem 
 * https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true&h_r=next-challenge&h_v=zen 
*/
package hackerRank;
//import java.util.*;

public class TwoDArray2 {
    
    public static void main(String[] args)
    {
//    	Scanner sc = new Scanner(System.in);
    	int[][] list = { {-9, -9, -9, 1, 1, 1},
    					 {0, -9, 0, 4, 3, 2},
    					 {-9, -9, -9, 1, 2, 3},
    					 {0, 0, 8, 6, 6, 0},
    					 {0, 0, 0, -2, 0, 0},
    					 {0, 0, 1, 2, 4, 0}};
    	int top=0, mid=0, bottom=0, sum=0, max=0;
   	
    	// Taking input from user
//    	for(int i=0; i<=5; i++)
//    	{
//        	for(int j=0; j<=5; j++)
//        	{
//        		list[i][j] = sc.nextInt();
//        	}
//    	}
    	
    	
    	//Processsing
    	for(int i=0; i<4; i++)
    	{
    		for(int j=0; j<4; j++)
    		{
    			sum=0;
    			top = list[i][j] + list[i][j+1] + list[i][j+2] ;
    			mid = list[i+1][j+1];
            	bottom = list[i+2][j] + list[i+2][j+1] + list[i+2][j+2];
            	sum = sum + top+mid+bottom;
            	if(sum>max)
       		 		max = sum;
            	System.out.println(top+" "+mid+" "+bottom+" "+max);
    		}
    	}
    	System.out.println(max);
    }
}