import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagramusingarraylist 
{

	public static void main(String[] args) 
	{
		
		try {
		String a = "abcdefg";
		String b = "gfedzbc";
		System.out.println("Are String Anagrams ? - " + areStringsAnagrams(a, b));
		} catch(IndexOutOfBoundsException e) {
			System.out.print("Please enter words of same size");
		}
				
	}
	
	public static boolean areStringsAnagrams(String x, String y)
	{
		ArrayList<Character> list = new ArrayList<Character>();
		ArrayList<Character> anotherlist = new ArrayList<Character>();
				
		for(int  i = 0 ; i < x.length() ; i++) {
			
			list.add(x.charAt(i));				
			anotherlist.add(y.charAt(i));
		}
		
		Collections.sort(list);
		Collections.sort(anotherlist);
		
			
		if(list.equals(anotherlist)) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
		
	}
}
