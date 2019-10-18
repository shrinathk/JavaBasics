
public class MDArraysInterviewQs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Find min no in the entire array, then find the max no in the min no's column.

		
		int a[][] = {{12,34,36},{11,25,78},{65,96,100}};
		int min = a[0][0];
		
					
		for(int i= 0 ; i < a.length ; i++)
		{
			
			for(int j= 0 ; j < 3 ; j++)
				
			{
				if(a[i][j] < min)
				{
					min = a[i][j];
					int max = a[0][j];

					for (int p = 0 ; p < a.length ; p++)
					{
						if (a[p][j] > max)

							{ 
							max = a[p][j];
							}
					}
					
					System.out.println(max);
				}
				
			}
			
		}
		
		
		
	}


}
