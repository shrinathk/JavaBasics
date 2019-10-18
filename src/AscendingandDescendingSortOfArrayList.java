import java.util.ArrayList;
import java.util.Collections;

public class AscendingandDescendingSortOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Character> originalList = new ArrayList<Character>();
		
		originalList.add('Q');
		originalList.add('B');
		originalList.add('P');
		
		System.out.println("Original list is : " + originalList);
		Collections.sort(originalList);
		System.out.println("Sorted list is :" + originalList);
		Collections.reverse(originalList);
		System.out.println("Reverse sorted list is :" + originalList);
	}

}
