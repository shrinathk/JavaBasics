import java.util.HashSet;

public class Anagramusinghashset 
{

	public static void main(String[] args) 
	{
		
		try {
		String a = "aaaaab";
		String b = "abbbbb";
		System.out.println("Are String Anagrams ? - " + areStringsAnagrams(a, b));
		} catch(IndexOutOfBoundsException e) {
			System.out.print("Please enter words of same size");
		}
				
	}
	
	public static boolean areStringsAnagrams(String x, String y)
	{
		if(x.length() != y.length())
			return false;
		
		HashSet<Character> hs1 = new HashSet<Character>();
		HashSet<Character> hs2 = new HashSet<Character>();
		
		for(int i = 0 ; i < x.length(); i++) {
			
			hs1.add(x.charAt(i));
			hs2.add(y.charAt(i));
		}
		
		return hs1.equals(hs2);
		
		
	}
}
