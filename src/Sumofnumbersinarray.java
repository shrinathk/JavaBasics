
public class Sumofnumbersinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c[] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		
		for(int i = 0; i < c.length; i++)
		{
		    sum = sum + c[i];
		}
		
		System.out.println(sum);
	}

}
