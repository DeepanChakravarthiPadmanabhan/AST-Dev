package Ex03;

import static org.junit.Assert.*;

import org.junit.Test;

import Helper.HelperFunctions;

public class Doubles_Part2_Test {

	@Test
	public void testPOSSmallNumbers() {
		// Arrange
		Doubles_Part2 testObject = new Doubles_Part2();
		int k = 1;
		int n = 2;
		float expectedResult = 0.01f;
		float actualResult = -1;
		// Act 
		actualResult = testObject.POS(k, n);
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}
	@Test
	public void testPOSLargeNumbers() {
		// Arrange
		Doubles_Part2 testObject = new Doubles_Part2();
		int k = 20;
		int n = 30;
		float expectedResult = 1;
		float actualResult = -1;
		// Act 
		actualResult = testObject.POS(k, n);
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.0001f);
	}
	@Test
	public void testMethod2SmallNumbers() {
		// Arrange
		Doubles_Part2 testObject = new Doubles_Part2();
		int k = 1;
		int n = 2;
		float expectedResult = 0.01f;
		float actualResult = -1;
		// Act 
		actualResult = testObject.Mathod2(k, n);
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}
	@Test
	public void testMethod2LargeNumbers() {
		// Arrange
		Doubles_Part2 testObject = new Doubles_Part2();
		int k = 20;
		int n = 30;
		float expectedResult = 1;
		float actualResult = -1;
		// Act 
		actualResult = testObject.Mathod2(k, n);
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.0001f);
	}

}
