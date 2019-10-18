import java.util.Arrays;

public class NthHighestNumberInAnArray {

	public static void main(String[] args) {
		
		NthHighestNumberInAnArray nhn = new NthHighestNumberInAnArray();
		
		int[] array = {11,2,12,41,5};
		
		System.out.println(nhn.findNthHighestnumber(3, array ));
		
		
	}
	
	public int findNthHighestnumber(int n, int[] array) {
		
		// TODO sort the array
		
		Arrays.sort(array);
		
		// TODO find nth highest
		
		int requirednumber = array[n-1];
		
		
		return requirednumber;
	}

}
