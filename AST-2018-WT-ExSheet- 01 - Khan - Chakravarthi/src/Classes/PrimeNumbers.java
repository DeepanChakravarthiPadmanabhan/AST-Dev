package Classes;
import java.util.ArrayList;


public class PrimeNumbers {
	
	
	public void GetInput()
	{
		int CheckRangeLow_large;
		int CheckRangeHigh_large;
		long CheckRangeLow_long;
		long CheckRangeHigh_long;
		ArrayList<Integer> listOfIntegers;
		ArrayList<Long> listOfIntegers_long;
//		CheckRangeLow_large=Integer.MAX_VALUE;
//		CheckRangeHigh_large=Integer.MAX_VALUE;
//		CheckRangeLow_long=Long.MAX_VALUE;
//		CheckRangeHigh_long=Long.MAX_VALUE;
		CheckRangeLow_large=0;
		CheckRangeHigh_large=2147483647;
//		CheckRangeLow_long=-0;
//		CheckRangeHigh_long=922337;
		
		listOfIntegers=PrimeNumbers(CheckRangeLow_large,CheckRangeHigh_large);
		for(int i = 0; i < listOfIntegers.size(); i++) {
            System.out.println(listOfIntegers.get(i));
            
        }
//		listOfIntegers_long=PrimeNumbers(CheckRangeLow_long,CheckRangeHigh_long);
//		for(int i = 0; i < listOfIntegers_long.size(); i++) {
//            System.out.println(listOfIntegers_long.get(i));
//            System.out.println("Dei Mendal3");
//        }
	}
	
	public ArrayList<Integer> PrimeNumbers(int CheckRangeLow_large,int CheckRangeHigh_large){
		ArrayList<Integer> listOfInts_large = new ArrayList<Integer>();
		int m=0;
		int n=0;
		for(int i=CheckRangeLow_large; i<CheckRangeHigh_large; i++){
			n=i;
			m=n/2;
			int flag=0;
			if(n==0||n==1){
				flag=1;
			}
			else{
				for(int k=2;k<=m;k++){      
				    if(n%k==0){      
				         
				     flag=1;      
				     break;      
				    }      
				   }      
			}
		if(flag==0)  { 
		listOfInts_large.add(i); }  
			
		}
	return listOfInts_large;
	}
	
	public ArrayList<Long> PrimeNumbers(long CheckRangeLow_long,long CheckRangeHigh_long){
		ArrayList<Long> listOfInts_long = new ArrayList<Long>();
		long m=0;
		long n=0;
		for(long i=CheckRangeLow_long; i<CheckRangeHigh_long; i++){
			n=i;
			m=n/2;
			int flag=0;
			if(n==0||n==1){
				flag=1;
			}
			else{
				for(int k=2;k<=m;k++){      
					if(n%k==0){      
						     
						flag=1;      
						break;      
					}      
				}      
			}
			if(flag==0)  { 
				listOfInts_long.add(i); 
				}  
	
		}
	return listOfInts_long;
	}
	
//	 public static void main(String[] args)
//	  {
//		PrimeNumbers one = new PrimeNumbers();
//	    one.GetInput();
//	    
//	  }
	
}

