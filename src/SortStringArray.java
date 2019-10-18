import java.util.ArrayList;
import java.util.Collections;

public class SortStringArray {

	public static void main(String[] args) {


		String[] origArray = {"All" , "I" , "Ever" , "Wanted"};
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0 ; i < origArray.length ; i ++) {
			
			list.add(origArray[i]);
		}
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
