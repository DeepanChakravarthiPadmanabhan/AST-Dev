package Classes;
import java.util.ArrayList;


public class New_PrimeNumbers {
	
	
	public void GetInput()
	{
		int CheckRangeLow_large;
		int CheckRangeHigh_large;
		long CheckRangeLow_long;
		long CheckRangeHigh_long;
		CheckRangeHigh_large=20;
		CheckRangeHigh_long=30;
//		CheckRangeHigh_large=Integer.MAX_VALUE;
//		CheckRangeHigh_long=Long.MAX_VALUE;
		long startTime = System.nanoTime();
		PrimeNumbers(0,CheckRangeHigh_large);
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("The time taken is:");
		System.out.println(totalTime);
//		PrimeNumbers(0,CheckRangeHigh_long);
	
	}
	
	
	
	
	
	
	public void PrimeNumbers(int CheckRangeLow_large,int CheckRangeHigh_large){
		int all=0;
		int m=0;
		int n=0;
		
		for(int i=0; i<=CheckRangeHigh_large; i++)
		{
			n=i;
			m=n/2;
			int flag=0;
			
			if(n==0||n==1)
			{
				flag=1;
			}
			else
			{
				for(int k=2;k<=m;k++)
				{      
				    if(n%k==0)
				    {      
				     flag=1;      
				     break;      
				    }      
				 }      
			}
			
		if(flag==0)  
		{ 
			System.out.println(i);
			all=all+1;
		 }  
			
		}
		System.out.println(all);
	}
	
	public void PrimeNumbers(long CheckRangeLow_long,long CheckRangeHigh_long){
		long all=0;
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
				System.out.println(i);
				all=all+1; 
				}  
	
		}
		System.out.println(all);
	}
	
//	 public static void main(String[] args)
//	  {
//		New_PrimeNumbers one = new New_PrimeNumbers();
//	    one.GetInput();
//	    
//	  }
	
}

