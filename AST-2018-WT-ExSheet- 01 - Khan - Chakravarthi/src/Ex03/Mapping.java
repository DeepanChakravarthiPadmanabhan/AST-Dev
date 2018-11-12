package Ex03;
import java.util.ArrayList;
import java.math.*; 
public class Mapping {
	ArrayList<Integer> listOfProducts;;
//	ArrayList<Double> listOfDoubles;;
//	ArrayList<Long> listOfLongs;;
	
	public ArrayList<Integer> Products(){
		return Products(1, 100);
	}
	public ArrayList<Integer> Products(int start, int stop){
		ArrayList<Integer> listOfProducts = new ArrayList<Integer>();
		for(int i=start; i<=stop; i++){
			listOfProducts.add(2*i);
			System.out.println(2*i);
		}
		return listOfProducts;
	}

	public ArrayList<Double> Roots(){
		return Roots(1, 100);
	}
	public ArrayList<Double> Roots(int start, int stop){
		ArrayList<Double> listOfDou = new ArrayList<Double>();
		for(int i=start; i<=stop; i++){
			listOfDou.add(Math.sqrt(i));
			System.out.println(Math.sqrt(i));
		}
		return listOfDou;
	}

	public ArrayList<Long> Powerten(){
		return Powerten(1, 100);
	}
	public ArrayList<Long> Powerten(int start, int stop){
		ArrayList<Long> listOfLong = new ArrayList<Long>();
		for(long i=start; i<=stop; i++){
			listOfLong.add((long) Math.pow((10),i));
			System.out.println((long) Math.pow((10),i));

		}
		return listOfLong;
	}

	public ArrayList<Integer> Cubes(){
		return Cubes(1, 100);
	}
	public ArrayList<Integer> Cubes(int start, int stop){
		ArrayList<Integer> listOfInt = new ArrayList<Integer>();
		for(int i=start; i<=stop; i++){
			listOfInt.add(i*i*i);
			System.out.println(i*i*i);
		}
		return listOfInt;
	}

	public ArrayList<Double> Twopowern(){
		return Twopowern(1, 100);
	}
	public ArrayList<Double> Twopowern(int start, int stop){
		ArrayList<Double> listOfDou = new ArrayList<Double>();
		for(float i=start; i<=stop; i++){
			listOfDou.add((Double) Math.pow((2),(1/i)));
			System.out.println((Double) Math.pow((2),(1/i)));

		}
		return listOfDou;
	}
	

	public ArrayList<Double> exppowern(){
		return exppowern(1, 100);
	}
	public ArrayList<Double> exppowern(int start, int stop){
		ArrayList<Double> listOfDou = new ArrayList<Double>();
		for(float i=start; i<=stop; i++){
			listOfDou.add(Math.exp((i)));
			System.out.println(Math.exp((i)));

		}
		return listOfDou;
	}
	
	
//	
//	public static void main(String[] args)
//	  {
//		Mapping one = new Mapping();
////		one.exppowern();
////		one.Twopowern();
////	    one.Cubes();
////	    one.Powerten();
////	    one.Roots();
//	    one.Products();
//	   
////	   
//	    
//	    
//	    
//	  }
	
}
