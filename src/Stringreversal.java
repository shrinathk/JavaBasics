
public class Stringreversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Madam";
		String reversestr = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			reversestr = reversestr + str.charAt(i); 
		}
		
		if(str.equalsIgnoreCase(reversestr))
		{
			System.out.println("String is a palindrome");
		}
		
		else 
		{
			System.out.println("String is NOT a palindrome");
		}
	}

	public void ABC() {
		System.out.println("Jeallo");
	}
}
