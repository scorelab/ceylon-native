package abc;
import java.util.*;
import java.math.*;
public class Factorial {
	/*
	 *public static void main(String[] args) { final int NUM_FACTS = 100;
	 *for(int i = 0; i < NUM_FACTS; i++) System.out.println( i + "! is " +
	 *factorial(i)); }
	 */
	//Using Dynamic Programming...
    static Map<Integer,BigInteger> map = new HashMap<Integer,BigInteger>();
    static{
    	map.put(1,BigInteger.ONE);
    	map.put(0, BigInteger.ZERO);
    }
    //BigInteger is used to accomodate factorials of large numbers
	public static BigInteger factorial(int n) {
		if(map.containsKey(n)) return map.get(n);
		BigInteger result = factorial(n-1).multiply(BigInteger.valueOf(n));
		map.put(n, result);
		return result;
	}
}
