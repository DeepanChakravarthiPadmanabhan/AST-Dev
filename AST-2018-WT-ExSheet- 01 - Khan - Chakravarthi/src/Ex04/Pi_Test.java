package Ex04;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class Pi_Test {
	@Test
	public void testCalculateArea() {
		// Arrange
		Pi Pi_object = new Pi();
		double value;
		int precision = 1;
		double diameter = 1;
		double expected=3.1*0.5*0.5;
		// Act 
		value=Pi_object.CalculateArea(precision,diameter);
		System.out.println(value);
		// Assert
		assertEquals(expected, value,0.0001);
	}
	
	@Test
	public void testCalculateCircumference() {
		// Arrange
		Pi Pi_object = new Pi();
		double value;
		int precision = 1;
		double diameter = -1;
		double expected=3.1*2.0*0.5;
		// Act 
		value=Pi_object.CalculateCircumfrence(precision,diameter);
		System.out.println(value);
		// Assert
		assertEquals(expected, value,0.0001);
	}
	

	@Test
	public void testRelativeErrorsArea() {
		// Arrange
		Pi Pi_object = new Pi();
		ArrayList<Double> value;
		double diameter = 1;
		double expected1=((Math.PI*0.5*0.5)-(3.1*0.5*0.5))/(Math.PI*0.5*0.5);
		double expected2=((Math.PI*0.5*0.5)-(3.14*0.5*0.5))/(Math.PI*0.5*0.5);

		// Act 
		value=Pi_object.GetRelativeErrorsArea(diameter);
		System.out.println(value.get(0));
		System.out.println(expected1);
		System.out.println(Math.PI);
		// Assert
		assertEquals(expected1, value.get(1),0.0001);
		assertEquals(expected2, value.get(2),0.0001);
	}
	
	@Test
	public void testGetRelativeErrorsCircumfrence() {
		// Arrange
		Pi Pi_object = new Pi();
		ArrayList<Double> value;
		double diameter = 1;
		double expected1=((Math.PI*2.0*0.5)-(3.1*2.0*0.5))/(Math.PI*2.0*0.5);
		double expected2=((Math.PI*2.0*0.5)-(3.14*2.0*0.5))/(Math.PI*2.0*0.5);

		// Act 
		value=Pi_object.GetRelativeErrorsCircumfrence(diameter);
		System.out.println(value.get(0));
		System.out.println(expected1);
		System.out.println(Math.PI);
		// Assert
		assertEquals(expected1, value.get(1),0.0001);
		assertEquals(expected2, value.get(2),0.0001);
	}
	
	
}
