import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "Teetu");
		hm.put(1, "Gaggu");
		hm.put(2, "TokkaloAnni");
		hm.put(3, "Sheena");
		
		
		
		Set iteration = hm.entrySet();
		  Iterator it = iteration.iterator();
		
		  while(it.hasNext())
		  {
			Map.Entry me =  (Map.Entry)it.next();
			System.out.println(me.getValue());
		  }
//		System.out.println(hm);
	}

}
