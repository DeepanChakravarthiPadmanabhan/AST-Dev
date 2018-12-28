package Helper;

import static org.junit.Assert.*;

public class HelperFunctions {
	
	public static void  AssertAlmostEquals(float num1, float num2, float accuracy){
		if(Math.abs(num2-num1) >= accuracy)
			fail();		
	}
	
	public static void  AssertAlmostEquals(double num1, double num2, double accuracy){
		if(Math.abs(num2-num1) >= accuracy)
			fail();		
	}

}
