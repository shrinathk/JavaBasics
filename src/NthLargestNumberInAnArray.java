import java.util.Arrays;

public class NthLargestNumberInAnArray {
	
	public static int getNthLargestNumber(int[] arr, int n) 
	{
		Arrays.sort(arr);		
		return arr[arr.length - n];
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,3,6,8,9,2};
		System.out.println(getNthLargestNumber(a,3));
		
	}

}
