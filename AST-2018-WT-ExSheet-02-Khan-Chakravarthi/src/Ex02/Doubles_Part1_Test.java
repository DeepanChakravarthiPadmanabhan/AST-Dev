package Ex02;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Helper.HelperFunctions;

public class Doubles_Part1_Test {

	@Test
	public void testCalculateSumPositiveDoubles() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, 3};
		double expectedResult = 1+2+3;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateSumNegativeDoubles() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, -9, -8};
		double expectedResult = 0-1-9-8;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateSumPosNegDoubles() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, +2, -3};
		double expectedResult = -1+2-3;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateSumZero() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 5, -4, 6, -7 };
		double expectedResult = 5-4+6-7;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateSum();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}
	@Test
	public void testCalculateAveragePositiveDoubles() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, 3};
		double expectedResult = (1+2+3)/3.0;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateAverageNegativeDoubles() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, -9, -8};
		double expectedResult = (-1-9-8)/3.0;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateAveragePosNegDoubles() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, +2, -3};
		double expectedResult = (-1+2-3)/3.0;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateAverageZero() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 5, -4, 6, -7 };
		double expectedResult = 5-4+6-7;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateAverageMaximumInteger() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ Double.MAX_VALUE, Double.MAX_VALUE };
		double expectedResult = Double.MAX_VALUE;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateAverageMinimumInteger() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ Double.MIN_VALUE, Double.MIN_VALUE };
		double expectedResult = Double.MIN_VALUE;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateAverage();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateProductPositives() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, 4 };
		double expectedResult = 1 * 2 * 4;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateProductEvenNegatives() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, -4 };
		double expectedResult = -1 * -4;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateProductOddNegatives() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, -3, -4 };
		double expectedResult = -1 * -3 * -4;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateProductPositiveNegative() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, 3, -4 };
		double expectedResult = -1 * 3 * -4;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateProductZero() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, 3, 0, -4 };
		double expectedResult = 0;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateVariancePositives() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, 4 };
		double expectedResult = 1 * 2 * 4;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateProduct();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);		
	}

	@Test
	public void testCalculateMaxPositive() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, 3};
		double expectedResult = 3;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMaxNegative() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, -2, -3};
		double expectedResult = -1;
		double actualResult = 0;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMaxPositiveNegative() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, -3};
		double expectedResult = 2;
		double actualResult = 0;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMaxMax() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ Double.MIN_VALUE, 1, 2, -3, Double.MAX_VALUE};
		double expectedResult = Double.MAX_VALUE;
		double actualResult = 0;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMax();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMinPositive() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, 3};
		double expectedResult = 1;
		double actualResult = -1;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMinNegative() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ -1, -2, -3};
		double expectedResult = -3;
		double actualResult = 0;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMinPositiveNegative() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ 1, 2, -3};
		double expectedResult = -3;
		double actualResult = 0;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}

	@Test
	public void testCalculateMinMax() {
		// Arrange
		Doubles_Part1 testObject = new Doubles_Part1();
		double value[] = new double[]{ Double.MIN_VALUE, 1, 2, -3, Double.MAX_VALUE};
		double expectedResult = Double.MIN_VALUE;
		double actualResult = 0;
		// Act 
		testObject.SetDoubles(ConvertIntArrayToList(value));
		actualResult = testObject.CalculateMin();
		
		// Assert
		HelperFunctions.AssertAlmostEquals(expectedResult, actualResult, 0.01f);
	}
	

	// Helper Functions
	ArrayList<Double> ConvertIntArrayToList(double[] intArray){
		ArrayList<Double> IntegerArrayList = new ArrayList<Double>();
		for(int i=0; i<intArray.length; i++)
			IntegerArrayList.add(intArray[i]);
		return IntegerArrayList;
	}

}
