import java.util.Arrays;

public class ArrayRearrangement {

	public static void main(String[] args) {
		// Take an array and initialize
		
		int[] origArray = {1,2,3,4,5};
		
		// Get the last number present in the array and put it in a variable
		
		int lastNumber = origArray[origArray.length-1];
		
		// write a loop to shift numbers to right
		
		
		for(int i = origArray.length-1 ; i >0 ; i--) {
			
			origArray[i] = origArray[i-1] ;
			
		}
		
		origArray[0] = lastNumber;
		
		for(int i = 0 ; i < origArray.length ; i++) {
			System.out.println(origArray[i]);
		}
		
		//System.out.println(Arrays.asList(origArray).toString());
		
		
		

	}

}
