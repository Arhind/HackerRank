//Java HashSet
//https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=false

package hackerRank;
import java.util.*;

class JavaHashSet {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter length of array : ");
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
        	System.out.print("Enter pair : ");
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

		HashSet<String> myhash = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			myhash.add(pair_left[i]+"#"+pair_right[i]);
			System.out.println(myhash.size());
		}
		
		s.close();
	}
}