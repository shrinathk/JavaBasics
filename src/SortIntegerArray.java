import java.util.ArrayList;
import java.util.Collections;

public class SortIntegerArray {

	public static void main(String[] args) {
		
		int[] origArray = {3,6,1,9,0};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i = 0 ; i < origArray.length ; i ++) {
			
			list.add(origArray[i]);
		}

		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
