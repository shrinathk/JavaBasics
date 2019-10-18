import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Teetu");
		hs.add("Sheena");
		hs.add("Gaggu");
		hs.add("Arni");
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		
		
		
		
	}

}
