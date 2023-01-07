import java.io.*;
import java.math.BigInteger;

public class Biginteger_class {
	    public static void main(String[] args) throws IOException
	    {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    	BigInteger n = new BigInteger("11111111111111111111111111111111111111111111111111111111111");
//	    	BigInteger n1 = BigInteger.valueOf(111111111111L);
//	    	BigInteger n2 = BigInteger.TEN;
	    	
	    	String n3 = br.readLine();
	    	br.close();
	    	
	    	BigInteger n4 = new BigInteger(n3);
//	    	BigInteger result = n4.isProbablePrime("100");
	    	if( n4.isProbablePrime(100))
	    	System.out.println("prime");
	    	
	    	else
		    	System.out.println("not prime");

	    }
	}
