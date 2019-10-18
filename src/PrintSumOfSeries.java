
public class PrintSumOfSeries {

	public static void main(String[] args) {
		
		
		
		PrintSumOfSeries a = new PrintSumOfSeries();
		System.out.println(a.printSum(4));

	}
	
	public int printSum(int n) {
		
		
		 int sum = 0, i = 0;
		  for (int j = 1; j <= n; j++) 
		  {
		   for (i = 1; i <= j; i++) 
		   {
		    sum = sum + i;
		   }
		   i = 1;
		  }
		  
		  return sum;
	}

}
