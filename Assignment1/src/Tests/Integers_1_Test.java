package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Classes.Integers_1;

public class Integers_1_Test {

	@Test
	public void testCalculateSumPositiveIntegers() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, 3};
		int expectedResult = 1+2+3;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateSumNegativeIntegers() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, -9, -8};
		int expectedResult = 0-1-9-8;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateSumPosNegIntegers() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, +2, -3};
		int expectedResult = -1+2-3;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateSumZero() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 5, -4, 6, -7 };
		int expectedResult = 5-4+6-7;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}
	@Test
	public void testCalculateAveragePositiveIntegers() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, 3};
		int expectedResult = (1+2+3)/3;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateAverageNegativeIntegers() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, -9, -8};
		int expectedResult = (-1-9-8)/3;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateAveragePosNegIntegers() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, +2, -3};
		int expectedResult = (-1+2-3)/3;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateAverageZero() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 5, -4, 6, -7 };
		int expectedResult = 5-4+6-7;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateAverageMaximumInteger() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ Integer.MAX_VALUE, Integer.MAX_VALUE };
		int expectedResult = Integer.MAX_VALUE;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateAverageMinimumInteger() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ Integer.MIN_VALUE, Integer.MIN_VALUE };
		int expectedResult = Integer.MIN_VALUE;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateProductPositives() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, 4 };
		int expectedResult = 1 * 2 * 4;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateProductEvenNegatives() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, -4 };
		int expectedResult = -1 * -4;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateProductOddNegatives() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, -3, -4 };
		int expectedResult = -1 * -3 * -4;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateProductPositiveNegative() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, 3, -4 };
		int expectedResult = -1 * 3 * -4;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateProductZero() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, 3, 0, -4 };
		int expectedResult = 0;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateVariancePositives() {
//		// Arrange
//		Integers_1 testObject = new Integers_1();
//		int value[] = new int[]{ 1, 2, 4 };
//		int expectedResult = 1 * 2 * 4;
//		int actualResult = -1;
//		// Act 
//		testObject.SetIntegers(ConvertIntArrayToList(value));
//		actualResult = testObject.CalculateProduct();
//		
//		// Assert
//		assertEquals(expectedResult, actualResult);		
	}

	@Test
	public void testCalculateMaxPositive() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, 3};
		int expectedResult = 3;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMaxNegative() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, -2, -3};
		int expectedResult = -1;
		int actualResult = 0;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMaxPositiveNegative() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, -3};
		int expectedResult = 2;
		int actualResult = 0;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMaxMax() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ Integer.MIN_VALUE, 1, 2, -3, Integer.MAX_VALUE};
		int expectedResult = Integer.MAX_VALUE;
		int actualResult = 0;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMinPositive() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, 3};
		int expectedResult = 1;
		int actualResult = -1;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMinNegative() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ -1, -2, -3};
		int expectedResult = -3;
		int actualResult = 0;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMinPositiveNegative() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ 1, 2, -3};
		int expectedResult = -3;
		int actualResult = 0;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCalculateMinMax() {
		// Arrange
		Integers_1 testObject = new Integers_1();
		int value[] = new int[]{ Integer.MIN_VALUE, 1, 2, -3, Integer.MAX_VALUE};
		int expectedResult = Integer.MIN_VALUE;
		int actualResult = 0;
		// Act 
		testObject.SetIntegers(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}
	

	// Helper Functions
	ArrayList<Integer> ConvertIntArrayToList(int[] intArray){
		ArrayList<Integer> IntegerArrayList = new ArrayList<Integer>();
		for(int i=0; i<intArray.length; i++)
			IntegerArrayList.add(intArray[i]);
		return IntegerArrayList;
	}

}
