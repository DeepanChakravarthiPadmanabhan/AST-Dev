package Ex02;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeNumbers_Test {

	@Test
	public void testPrimeNumbersIntInt() {
		// Arrange
		PrimeNumbers testObject = new PrimeNumbers();
		int value[] = new int[]{ 2, 3, 5, 7 , 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
		int start = 0;
		int stop = 200;
		ArrayList<Integer> actualResult;
		ArrayList<Integer> expectedResult = ConvertIntArrayToList(value);
		// Act 
		actualResult = testObject.PrimeNumbers(start, stop);
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testPrimeNumbersLongLong() {
		// Arrange
		PrimeNumbers testObject = new PrimeNumbers();
		long value[] = new long[]{ 2, 3, 5, 7 , 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
		long start = 0;
		long stop = 200;
		ArrayList<Long> actualResult;
		ArrayList<Long> expectedResult = ConvertIntArrayToList(value);
		// Act 
		actualResult = testObject.PrimeNumbers(start, stop);
		
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
	
	// Helper Functions
	ArrayList<Long> ConvertIntArrayToList(long[] intArray){
		ArrayList<Long> IntegerArrayList = new ArrayList<Long>();
		for(int i=0; i<intArray.length; i++)
			IntegerArrayList.add(intArray[i]);
		return IntegerArrayList;
	}
	
}
