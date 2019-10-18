
public class Constructor {
	
	public Constructor ()
	{
		System.out.println("I am default constructor");
	}
	
	public Constructor (int a)
	{
		System.out.println("I take integers in parameters as I am parameterized constructor");
		System.out.println(a);
	}
	
	public Constructor (String b)
	{
		System.out.println("I take strings in parameters as I am parameterized constructor");
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Constructor c = new Constructor();
		Constructor cd = new Constructor(4);
		Constructor cde = new Constructor("a");
	}

}
