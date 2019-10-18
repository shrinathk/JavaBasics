
public class MDArraysPrintMINNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][] = {{1,2,3},{4,5,6},{7,8,0}};
		int k[] = {3,5,7,9};
		int min = a[0][0];
					
		for(int i= 0 ; i < a.length ; i++)
		{
			
			for(int j= 0 ; j < 3 ; j++)
				
			{
				if(a[i][j] < min)
				{
					min = a[i][j];
				}
				
			}
			
		}
		
		System.out.println(min);
		
	}


}
