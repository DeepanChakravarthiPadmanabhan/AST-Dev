import java.util.ArrayList;
import java.math.*; 
public class Mapping {
	ArrayList<Integer> listOfProducts;;
//	ArrayList<Double> listOfDoubles;;
//	ArrayList<Long> listOfLongs;;
	public ArrayList<Integer> Products(){
		ArrayList<Integer> listOfProducts = new ArrayList<Integer>();
		for(int i=1; i<=100; i++){
			this.listOfProducts.add(2*i);
			System.out.println(2*i);
		}
		return listOfProducts;
	}
	
	public ArrayList<Double> Roots(){
		ArrayList<Double> listOfDou = new ArrayList<Double>();
		for(int i=1; i<=100; i++){
			listOfDou.add(Math.sqrt(i));
			System.out.println(Math.sqrt(i));
		}
		return listOfDou;
	}
	
	public ArrayList<Long> Powerten(){
		ArrayList<Long> listOfLong = new ArrayList<Long>();
		for(long i=1; i<=100; i++){
			listOfLong.add((long) Math.pow((10),i));
			System.out.println((long) Math.pow((10),i));

		}
		return listOfLong;
	}
	
	public ArrayList<Integer> Cubes(){
		ArrayList<Integer> listOfInt = new ArrayList<Integer>();
		for(int i=1; i<=100; i++){
			listOfInt.add(i*i*i);
			System.out.println(i*i*i);
		}
		return listOfInt;
	}
	
	public ArrayList<Double> Twopowern(){
		ArrayList<Double> listOfDou = new ArrayList<Double>();
		for(float i=1; i<=100; i++){
			listOfDou.add((Double) Math.pow((2),(1/i)));
			System.out.println((Double) Math.pow((2),(1/i)));

		}
		return listOfDou;
	}
	

	public ArrayList<Double> exppowern(){
		ArrayList<Double> listOfDou = new ArrayList<Double>();
		for(float i=1; i<=100; i++){
			listOfDou.add(Math.exp((i)));
			System.out.println(Math.exp((i)));

		}
		return listOfDou;
	}
	
	
	
	public static void main(String[] args)
	  {
		Mapping one = new Mapping();
//		one.exppowern();
//		one.Twopowern();
//	    one.Cubes();
//	    one.Powerten();
//	    one.Roots();
	    one.Products();
	   
//	   
	    
	    
	    
	  }
	
}
