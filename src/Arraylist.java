import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>  a = new ArrayList<String>();
		
		a.add("Shrinath");
		a.add(0, "Kuppa");
		System.out.println(a.getClass());
				a.add("Kuppa");
				System.out.println(a);
				System.out.println(a.indexOf("Kuppa"));
				
	}

}
