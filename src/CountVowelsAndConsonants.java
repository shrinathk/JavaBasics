import java.util.ArrayList;
import java.util.HashMap;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {


		String str = "AEIOUQQR";
		int ccount = 0;
		int vcount = 0;
		
		String lowerCaseStr = str.toLowerCase();
		
		for(int i = 0 ; i < str.length() ; i ++) {
			
			char ch = lowerCaseStr.charAt(i);
			System.out.println(ch);
			
			if((ch=='a') || (ch =='e') || (ch =='i') || (ch=='o') || (ch=='u')) {
				
				vcount++;
			}
			
			else if(ch>'a' && ch <='z') {
				
				ccount++;
			}
		}
		
		System.out.println("The count of consonants is : " + ccount + " and the count of vowels is : " + vcount);
		
		

	}

	
		
	}

