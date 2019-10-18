public class RightMostNumbersSame {


	public static boolean getRightmostNumber(int a , int b , int c) {
		
		 if(a%10==b%10 || a%10==c%10 || b%10==c%10 ) {
			 
			return true;
		 }else {
			 return false; 
		 }
		
		 
	}

	public static void main(String[] args) {


		int i = 51 ; 
		int j = 10 ; 
		int k = 15;
		
		System.out.println(getRightmostNumber(i,j,k));
		

	}

}
