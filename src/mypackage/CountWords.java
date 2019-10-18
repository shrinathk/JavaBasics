package mypackage;

import java.util.HashMap;

public class CountWords {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "This is the way we wash our face wash our face wash our face";
		
		String[] split = sentence.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		System.out.println(split.length);
		
		for(int i = 0 ; i < split.length ; i++) {
			
			if(!hm.containsKey(split[i])) {
				hm.put(split[i], 1);
			}else {
				int occurence = hm.get(split[i]);
				hm.put(split[i], ++occurence);
			}
			
			System.out.println(split[i]);
			
		}
		
		System.out.println(hm);
	}

}
