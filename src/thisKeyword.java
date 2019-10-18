
public class thisKeyword {

	
	int a = 2;
	
	public void method()
	{
		int a = 3;
		
		System.out.println(a);
		System.out.println(this.a);
		//this.a = a;
		System.out.println(a+this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKeyword word = new thisKeyword();
		
		word.method();
	}

}
