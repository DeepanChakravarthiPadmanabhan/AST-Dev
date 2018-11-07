package Classes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Pi {

	public double CalculateCircumfrence(int piPrecision, double diameter){
		double pi = GetPi(piPrecision);		
		return pi * diameter;
	}
	
	public double CalculateArea(int piPrecision, double diameter){
		double pi = GetPi(piPrecision);	
		double radius = diameter/2;
		return pi * radius * radius;
	}
	
	public ArrayList<Double> GetRelativeErrorsCircumfrence(double diameter){
		ArrayList<Double> relativeErrors = new ArrayList<Double>();
		ArrayList<Double> absoluteErrors = GetAbsoluteErrorsCircumfrence(diameter);
		double MaxPrecisionCircumfrence = CalculateCircumfrence(-1, diameter);
		
		for(int i=0; i<absoluteErrors.size(); i++){
			relativeErrors.add(Math.abs(absoluteErrors.get(i))/MaxPrecisionCircumfrence);
		}
		
		return relativeErrors;
	}
	
	private ArrayList<Double> GetAbsoluteErrorsCircumfrence(double diameter){
		ArrayList<Double> absoluteErrors = new ArrayList<Double>();
		double MaxPrecisionCircumfrence = CalculateCircumfrence(-1, diameter);
		
		for(int i=0; i<GetPiMaxPrecision(); i++){
			absoluteErrors.add(MaxPrecisionCircumfrence - CalculateCircumfrence(i, diameter));
		}
		
		return absoluteErrors;		
	}
	
	public ArrayList<Double> GetRelativeErrorsArea(double diameter){
		ArrayList<Double> relativeErrors = new ArrayList<Double>();
		ArrayList<Double> absoluteErrors = GetAbsoluteErrorsArea(diameter);
		double MaxPrecisionArea = CalculateArea(-1, diameter);
		
		for(int i=0; i<absoluteErrors.size(); i++){
			relativeErrors.add(Math.abs(absoluteErrors.get(i))/MaxPrecisionArea);
		}
		
		return relativeErrors;
	}
	
	private ArrayList<Double> GetAbsoluteErrorsArea(double diameter){
		ArrayList<Double> absoluteErrors = new ArrayList<Double>();
		double MaxPrecisionArea = CalculateArea(-1, diameter);
		
		for(int i=0; i<GetPiMaxPrecision(); i++){
			absoluteErrors.add(MaxPrecisionArea - CalculateArea(i, diameter));
		}
		
		return absoluteErrors;		
	}
	
	private double GetPi(int piPrecision){
		if(piPrecision == -1)
			return Math.PI;
		return new BigDecimal(Math.PI).setScale(piPrecision, RoundingMode.HALF_EVEN).doubleValue();
	}
	
	private int GetPiMaxPrecision(){
		// reference: https://stackoverflow.com/a/6264613
		String text = Double.toString(Math.abs(Math.PI));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
		
		return integerPlaces + decimalPlaces;
	}

}
