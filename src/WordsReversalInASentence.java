import java.util.ArrayList;

public class WordsReversalInASentence {

	public static void main(String[] args) {
		
		String origSentence = "I jumped over the fence";
		//System.out.println(reverseWordsInASentence(origSentence));
		
		String[] strArray = origSentence.split(" ");
		
		String word;
		
		String reverseSentence;
		
		
		StringBuilder sb = new StringBuilder();
		
		//ArrayList<Character> charList = new ArrayList<Character>();
		
		for(int i = 0 ; i < strArray.length ; i++) {
			sb = new StringBuilder();
			word = strArray[i];
			sb.append(word);
			
			word = sb.reverse().toString();
			strArray[i] = word;
			
		}
		sb.setLength(0);
		for(String ch : strArray) {
			sb.append(ch);
			sb.append(" ");
		}
		
		reverseSentence = sb.toString();
		
//		String reverseSentence = sb.append(strArray.toString()).toString();
//		
		System.out.println(reverseSentence);
		
		
	}
	
//	public static String reverseWordsInASentence(String sentence)
//	{
//		StringBuilder finalSentence = new StringBuilder();
//
//		// TODO Split words
//		String[] words = sentence.split(" ");
//
//		// TODO For each word, reverse words
//		for(String word : words)
//		{
//			String reversedWord = new StringBuilder(word).reverse().toString();
//			
//			// TODO Append to final sentence
//			finalSentence.append(reversedWord);
//			finalSentence.append(" ");
//		}
//		
//		return finalSentence.toString();
//	}
	
	
	
	

}
