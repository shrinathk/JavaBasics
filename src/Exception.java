
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 0 ;
		
		int j = 7;
		
		try
		{
			int mod = j/i;
			System.out.println(mod);
		}
		
		catch(ArithmeticException E)
		{
			System.out.println("A number cannot be divided by zero");
		}
		
		finally
		{
			System.out.println("This will get executed");
		}
		System.out.println("The end");
	}

}
