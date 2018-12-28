package Ex03;

public class Doubles_Part2 {
	
	
	public float Product_term(int k,int n){
		float fact = 1f;
		float value = 1f;
		for(int i=1; i<=n; i++){
			if (i<k){
				value =0.9f; 
			}
			else {
				value=0.1f;
			}
			fact= fact*(value/(1-value));
		}
		return fact;
	}
	
	public float POS(int k,int n){
		int kvalue=k;
		int nvalue=n;
		float answer= 	1f-(1/(1+Product_term(kvalue,nvalue)));
		return answer;
	}
	
	public float Mathod2(int k,int n){
		int kvalue=k;
		int nvalue=n;
		double secondterm =Math.pow((0.9/(1.0-0.9)), kvalue-1)*Math.pow((0.1/(1.0-0.1)), (nvalue-kvalue+1));
		float answer= (float)(1-(1/(1+secondterm)));
		return answer;
	}
	
	 public static void main(String[] args)
	 {
		 double startTime,endTime,countTime;
		 Doubles_Part2 one=new Doubles_Part2();
		 float s= one.POS(10,20);
		 
		 startTime = System.nanoTime();
		 s= one.POS(100,120);
		 endTime   = System.nanoTime();
	     countTime = endTime - startTime;
	     System.out.println("Time for normal method "+countTime);
		 System.out.printf("Time for k,n = 100,120--- %.2f", s);
		 System.out.println("\n");
		 
		 startTime = System.nanoTime();
		 s= one.POS(1000,1200);
		 endTime   = System.nanoTime();
	     countTime = endTime - startTime;
	     System.out.println("Time for normal method "+countTime);
		 System.out.printf("Time for k,n = 1000,1200--- %.2f", s);
		 System.out.println("\n");
		 
		 startTime = System.nanoTime();
		 s= one.POS(10000,10200);
		 endTime   = System.nanoTime();
	     countTime = endTime - startTime;
	     System.out.println("Time for normal method "+countTime);
		 System.out.printf("Time for k,n = 10000,10200--- %.2f", s);
		 System.out.println("\n");
		 
		 startTime = System.nanoTime();
		 float value=one.Mathod2(100,120);
		 endTime   = System.nanoTime();
		 countTime = endTime - startTime;
		 System.out.println("Time for efficient method "+countTime);
		 System.out.printf("Method 2- Time for k,n = 100,120--- %.2f", value);
		 System.out.println("\n");
		 
		 startTime = System.nanoTime();
		 value=one.Mathod2(1000,1200);
		 endTime   = System.nanoTime();
		 countTime = endTime - startTime;
		 System.out.println("Time for efficient method "+countTime);
		 System.out.printf("Method 2- Time for k,n = 1000,1200--- %.2f", value);
		 System.out.println("\n");
		 
		 startTime = System.nanoTime();
		 value=one.Mathod2(10000,10200);
		 endTime   = System.nanoTime();
		 countTime = endTime - startTime;
		 System.out.println("Time for efficient method "+countTime);
		 System.out.printf("Method 2- Time for k,n = 10000,10200--- %.2f", value);
		 System.out.println("\n");
		 
		 //For higher values of k, the function value equates to 1.
	 }
}