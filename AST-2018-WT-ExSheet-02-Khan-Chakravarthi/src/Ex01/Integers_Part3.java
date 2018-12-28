package Ex01;
import java.util.ArrayList;
import java.util.Scanner; 
public class Integers_Part3 {
	private double counttime;
	private long count;
	private double counttime_2n;
	private double counttime_10n;
	private static Scanner scanner = new Scanner( System.in );
	
	public void Prime()
	{
		int CheckRangeLow_large=0;
		int CheckRangeHigh_large;
		long CheckRangeLow_long=0;
		long CheckRangeHigh_long;
		CheckRangeHigh_large=20;
		CheckRangeHigh_long=30;
//		CheckRangeHigh_large=Integer.MAX_VALUE; 
//		CheckRangeHigh_long=Long.MAX_VALUE;
//The values are commented for testing purpose, at final run can be uncommented and tested.
//		PrimeNumbers(0,CheckRangeHigh_large);
//The integer and long integer values can be switched and each functionality be tested.
		PrimeNumbers(0,CheckRangeHigh_long);
	
	}
	
	public double CountNumbers(long countlimit){
		long counter=0;
		double startTime = System.nanoTime();
		for(long i=0;i<countlimit;i++){
			counter=counter+1;
		}
		double endTime   = System.nanoTime();
		this.counttime = endTime - startTime;
		double totalTime = endTime - startTime;
		startTime = System.nanoTime();
		for(long i=0;i<2*countlimit;i++){
			counter=counter+1;
		}
		endTime   = System.nanoTime();
		this.counttime_2n = endTime - startTime;
		startTime = System.nanoTime();
		for(long i=0;i<10*countlimit;i++){
			counter=counter+1;
		}
		endTime   = System.nanoTime();
		this.counttime_10n = endTime - startTime;
		
		return totalTime;
	}

	public ArrayList<Long> PrimeNumbers(long CheckRangeLow_long,long CheckRangeHigh_long){
		ArrayList<Long> listOfPrimes = new ArrayList<Long>();
	
		long m=0;
		long n=0;
		for(long i=CheckRangeLow_long; i<CheckRangeHigh_long; i++)
		{
			n=i;
			m=n/2;
			int flag=0;
			if(n==0||n==1)
			{
				flag=1;
			}
			else{
				
				for(long k=2;k<=m;k++)
				{      
					if(n%k==0)
					{      
						     
						flag=1;      
						break;      
					}      
				}      
			}
			if(flag==0)  { 
				listOfPrimes.add(i);
				System.out.println(i);
				
				}  
	
		}
		return listOfPrimes;
	}
	
	public void Countgetter(){
		System.out.println("Enter a long integer for counting");
	    this.count = scanner.nextInt();
	}
	
	public void Printtime(){
		System.out.println("The time taken to count n integer of count " + this.count + " is " + this.counttime+" nanoseconds ");
		System.out.println("The time taken to count 2n integer of count " + 2*this.count + " is " + this.counttime_2n+" nanoseconds ");
		System.out.println("The time taken to count 10n integer of count " + 10*this.count + " is " + this.counttime_10n+" nanoseconds ");
	}
	
	 public static void main(String[] args)
	 {
		
		double counttime;
		Integers_Part3 one = new Integers_Part3();
	    one.Prime();
	    one.Countgetter();
	    one.counttime=one.CountNumbers(one.count);
	    one.Printtime();
	    System.out.println("Done");
	    
	    
	    
	  }
}
