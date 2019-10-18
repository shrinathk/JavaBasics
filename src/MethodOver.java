
public class MethodOver 
{

	public static void main(String[] args) 
	{
		MrBig b = new MrBig();
		b.square(5);
		b.square(5, 10);
		b.square((double) 5);
		
		MrSmall s = new MrSmall();
		s.square(6);
		
		MrBig b2 = s;
		b2.square(7);
		
		
	}
}
