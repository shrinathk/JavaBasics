
public class Superkeyword extends Parentforsuper {

	String name = "Raghav";
	
	public void nametobeselected()
	
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public Superkeyword()
	{
		super();
		System.out.println("This is the child constructor");		
	}
			
	public void getmethod()
	{
		System.out.println("This is the child class");
		super.getmethod();
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Superkeyword sk = new Superkeyword();
		
		sk.nametobeselected();
		sk.getmethod();
		
	}

}
