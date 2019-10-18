import java.util.HashMap;

public class Anagramusinghashmap 
{

	public static void main(String[] args) 
	{
		
		try {
		String a = "bababbbba";
		String b = "babaaaaaq";
		System.out.println("Are String Anagrams ? - " + areStringsAnagrams(a, b));
		} catch(IndexOutOfBoundsException e) {
			System.out.print("Please enter words of same size");
		}
				
	}
	
	public static boolean areStringsAnagrams(String x, String y)
	{
		if(x.length() != y.length())
			return false;
		
		HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();
		
		for(int i = 0 ; i < x.length(); i++) {
			
			if(!hm1.containsKey(x.charAt(i)) ) {
				
				hm1.put(x.charAt(i), 1);
				
			}else {
				int occurence = hm1.get(x.charAt(i));
				hm1.put(x.charAt(i), ++occurence);
			}
			
			if(!hm2.containsKey(y.charAt(i)) ) {
				
				hm2.put(y.charAt(i), 1);
				
			}else {
				int occurence = hm2.get(y.charAt(i));
				
				hm2.put(y.charAt(i), ++occurence);
			}
		}
		System.out.println(hm1);
		System.out.println(hm2);
		
		
		return hm1.equals(hm2);	
		
		
	}
}
