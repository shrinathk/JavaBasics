import java.util.ArrayList;
import java.util.HashSet;

public class ConverthashsetToArraylist {

	public static void main(String[] args) {
		
		ConverthashsetToArraylist list = new ConverthashsetToArraylist();
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(2);
		hashset.add(3);
		hashset.add(4);
		hashset.add(8);
		
		System.out.println(list.convertToArrayList(hashset));
		
	}
	
	public ArrayList<Integer> convertToArrayList (HashSet<Integer> hashset) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
				
			list.addAll(hashset);
			
			
		return list;
		
	}

}
