import java.util.ArrayList;
import java.util.Collections;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class FindDuplicatesInString {

	public static void main(String[] args) {

		FindDuplicatesInString duplicates = new FindDuplicatesInString();
		
		System.out.println(duplicates.identifyDuplicates("Navaneeta"));

	}

	public String identifyDuplicates(String name) {
		
		ArrayList<Character> requiredString = new ArrayList<Character>(); 
		
		String finalWord;
		for(int i = 0 ; i <name.length() ; i ++) {
			
			if(!requiredString.contains(name.charAt(i))){
				
				requiredString.add(name.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(Character ch : requiredString) {
			sb.append(ch);
		}
		
		finalWord = sb.toString();
		
		//System.out.println(finalWord);
		return finalWord;
	}
	
}
