package deneme;

import java.util.*;

public class Randomize {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println(rand.nextBoolean()); // returns true or false
		System.out.println(rand.nextDouble());	// returns [0.0, 1.0)
		System.out.println(rand.nextFloat());	// returns [0.0, 1.0) 
		System.out.println(rand.nextInt(1000)); // returns [0.0,1000)
		System.out.println(rand.nextInt());		// returns (2^(-32),2^32)
		System.out.println(rand.nextLong());	// returns [0,2^48)	
		
	}

}
