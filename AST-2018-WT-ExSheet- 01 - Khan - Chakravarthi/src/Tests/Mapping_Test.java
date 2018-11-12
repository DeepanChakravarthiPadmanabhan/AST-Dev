package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Classes.Mapping;


public class Mapping_Test {

	@Test
	public void testProductsIntInt() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = -2;
		int stop = 2;
		ArrayList<Integer> expectedResult = ConvertArrayToList(new int[]{ 2*-2, 2*-1, 2*0, 2*1, 2*2 });
		ArrayList<Integer> actualResult;
		// Act 
		actualResult = testObject.Products(start, stop);
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testRootsIntInt() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = -2;
		int stop = 4;
		ArrayList<Double> expectedResult = ConvertArrayToList(new double[]{ Math.sqrt(-2), Math.sqrt(-1), 0, Math.sqrt(1), Math.sqrt(2), Math.sqrt(3), Math.sqrt(4) });
		ArrayList<Double> actualResult;
		// Act 
		actualResult = testObject.Roots(start, stop);
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testPowertenIntInt() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = -2;
		int stop = 2;
		ArrayList<Long> expectedResult = ConvertArrayToList(new long[]{ (long) Math.pow(10,-2), (long) Math.pow(10,-1), (long) Math.pow(10,0), (long) Math.pow(10,1), (long) Math.pow(10,2) });
		ArrayList<Long> actualResult;
		// Act 
		actualResult = testObject.Powerten(start, stop);
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCubesIntInt() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = -2;
		int stop = 2;
		ArrayList<Integer> expectedResult = ConvertArrayToList(new int[]{ -2*-2*-2, -1*-1*-1, 0*0*0, 1*1*1, 2*2 *2 });
		ArrayList<Integer> actualResult;
		// Act 
		actualResult = testObject.Cubes(start, stop);
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testTwopowernIntIntNeg() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = -2;
		int stop = -1;
		ArrayList<Double> expectedResult = ConvertArrayToList(new Double[]{ 1/Math.sqrt(2), (Double) 1.0/2.0 });
		ArrayList<Double> actualResult;
		// Act 
		actualResult = testObject.Twopowern(start, stop);
		
		// Assert
		for(int i=0; i<expectedResult.size(); i++)
			if(expectedResult.get(i) - actualResult.get(i) > 0.0001)
				fail("Expected : " + expectedResult.get(i) + ", actual: " + actualResult.get(i));
	}

	@Test
	public void testTwopowernIntIntPos() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = 1;
		int stop = 2;
		ArrayList<Double> expectedResult = ConvertArrayToList(new Double[]{   Math.pow(2,1), Math.sqrt(2) });
		ArrayList<Double> actualResult;
		// Act 
		actualResult = testObject.Twopowern(start, stop);
		
		// Assert
		for(int i=0; i<expectedResult.size(); i++)
			if(expectedResult.get(i) - actualResult.get(i) > 0.0001)
				fail("Expected : " + expectedResult.get(i) + ", actual: " + actualResult.get(i));
	}

	@Test
	public void testExppowernIntInt() {
		// Arrange
		Mapping testObject = new Mapping();
		int start = -2;
		int stop = 4;
		ArrayList<Double> expectedResult = ConvertArrayToList(new double[]{ Math.exp(-2), Math.exp(-1), 1, Math.exp(1), Math.exp(2), Math.exp(3), Math.exp(4) });
		ArrayList<Double> actualResult;
		// Act 
		actualResult = testObject.exppowern(start, stop);
		
		// Assert
		assertEquals(expectedResult, actualResult);
	}
	
	// Helper Functions
	ArrayList<Integer> ConvertArrayToList(int[] array){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for(int i=0; i<array.length; i++)
			arrayList.add(array[i]);
		return arrayList;
	}
	ArrayList<Double> ConvertArrayToList(double[] array){
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for(int i=0; i<array.length; i++)
			arrayList.add(array[i]);
		return arrayList;
	}
	ArrayList<Double> ConvertArrayToList(Double[] array){
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for(int i=0; i<array.length; i++)
			arrayList.add(array[i]);
		return arrayList;
	}
	ArrayList<Long> ConvertArrayToList(long[] array){
		ArrayList<Long> arrayList = new ArrayList<Long>();
		for(int i=0; i<array.length; i++)
			arrayList.add(array[i]);
		return arrayList;
	}

}
