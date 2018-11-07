package Classes;


import java.util.ArrayList;
import java.util.Scanner;

public class Integers_1 {
	
	ArrayList<Integer> listOfIntegers;;
	
	
	public void GetInput(){
		ArrayList<Integer> listOfInts = new ArrayList<Integer>();
		System.out.println("Enter the number of Integers to enter: ");
		Scanner scanner = new Scanner(System.in);
		int numberOfIntegers = scanner.nextInt();
		
		for(int i=0; i<numberOfIntegers; i++){
			System.out.println("Enter number " + i + " : ");
			listOfInts.add(scanner.nextInt());
		}		
		scanner.close();
		SetIntegers(listOfInts);
	}
	
	public void SetIntegers(ArrayList<Integer> listOfInts){
		this.listOfIntegers = listOfInts;
	}
	
	public int CalculateSum(){
		int sum = 0;
		for(int i=0; i<listOfIntegers.size(); i++){
			sum += listOfIntegers.get(i);
		}
		return sum;
	}
	
	public int CalculateAverage(){
		return CalculateSum()/listOfIntegers.size();
	}
	
	public int CalculateProduct(){
		int product = 1;
		for(int i=0; i<listOfIntegers.size(); i++){
			product *= listOfIntegers.get(i);
		}
		return product;
	}
	
	public int CalculateVariance(){
		int mean = CalculateAverage();
		int sum = 0;		
		
		for(int i=0; i<listOfIntegers.size(); i++){
			int diff = listOfIntegers.get(i) - mean;
			sum += (diff*diff);
		}
		
		return sum/(listOfIntegers.size()-1);		
	}
	
	public int CalculateMax(){
		int max = listOfIntegers.get(0);
		for(int i=1; i<listOfIntegers.size(); i++){
			if(listOfIntegers.get(i) > max)
				max = listOfIntegers.get(i);
		}
		return max; 
	}
	
	public int CalculateMin(){
		int min = listOfIntegers.get(0);
		for(int i=1; i<listOfIntegers.size(); i++){
			if(listOfIntegers.get(i) < min)
				min = listOfIntegers.get(i);
		}
		return min;
	}
	
	
	

}
