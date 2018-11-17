package Ex02;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;
public class Doubles_Part1 {
	
	private int[ ] list = new int[3];
	
	ArrayList<Double> listOfIntegers=new ArrayList<Double>();
	
	private static Scanner scanner = new Scanner( System.in );
	
	public int[] Getter(){
		System.out.println("Enter a first integer for the computation needs");
	    this.list[0] = scanner.nextInt();
	    System.out.println("Enter a second integer");
	    this.list[1] = scanner.nextInt();
	    System.out.println("Enter a third integer");
	    this.list[2] = scanner.nextInt();
	    if (this.list[1]>this.list[2]||this.list[1]==this.list[2]){
	    System.out.println("Enter the third integer value greater than second integer value entered "+this.list[2]);
		this.list[2] = scanner.nextInt();
		}
	    
	    if (this.list[0]<2){
		    System.out.println("Enter the a positive integer above 1 ");
			this.list[0] = scanner.nextInt();
			}
	    
	    return this.list;
	}
	

	public void Randarray(){
		float min=1.0f;
		float max=10.0f;
				for(long i=0;i<this.list[0];i++){
				double a=randFloat(min,max);

				this.listOfIntegers.add(a);
				}
		
	}
	
	
	public static double randFloat(float min, float max) {

	    Random rand = new Random();

	    float result = rand.nextFloat() * (max - min) + min;
	    double newton=result;
	    return newton;

	}
	
	public void SetDoubles(ArrayList<Double> listOfdoubles){
		this.listOfIntegers = listOfdoubles;
	}
	
	public double CalculateSum(){
		double sum = 0;
		for(int i=0; i<listOfIntegers.size(); i++){
			sum += listOfIntegers.get(i);
		}
		return sum;
	}
	
	public double CalculateAverage(){
		return CalculateSum()/listOfIntegers.size();
	}
	
	public double CalculateProduct(){
		double product = 1;
		for(int i=0; i<listOfIntegers.size(); i++){
			product *= listOfIntegers.get(i);
		}
		return product;
	}
	
	public double CalculateVariance(){
		double mean = CalculateAverage();
		double sum = 0;		
		
		for(int i=0; i<listOfIntegers.size(); i++){
			double diff = listOfIntegers.get(i) - mean;
			sum += (diff*diff);
		}
		
		return sum/(listOfIntegers.size()-1);		
	}
	
	public double CalculateMax(){
		double max = listOfIntegers.get(0);
		for(int i=1; i<listOfIntegers.size(); i++){
			if(listOfIntegers.get(i) > max)
				max = listOfIntegers.get(i);
		}
		return max; 
	}
	
	public double CalculateMin(){
		double min = listOfIntegers.get(0);
		for(int i=1; i<listOfIntegers.size(); i++){
			if(listOfIntegers.get(i) < min)
				min = listOfIntegers.get(i);
		}
		return min;
	}
	
	
	 public static void main(String[] args)
	 {
		
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Program execution started at "+ sdf.format(cal.getTime()) );
		Doubles_Part1 one = new Doubles_Part1();
		
		int[] a=one.Getter();

	    one.Randarray();
	    double sum=one.CalculateSum();
		System.out.println("Sum of the random numbers is "+sum);
		double mean=one.CalculateAverage();
		System.out.println("Average of the random numbers is "+mean);
		double product=one.CalculateProduct();
		System.out.println("Product of the random numbers is "+product);
		double variance=one.CalculateVariance();
		System.out.println("Variance of the random numbers is "+variance);
		double maxi=one.CalculateMax();
		System.out.println("Maximum of the random numbers is "+maxi);
		double mini=one.CalculateMin();
		System.out.println("Minimum of the random numbers is "+mini);
		System.out.println("Program successfully completed");
	    
	     }

}
