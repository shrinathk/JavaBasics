
public class NumbersDivisibleBy3n5 {
	
	
	public static void divisibleNumbers(int a, int b) {
		
		
		System.out.println("Divided by 3:");
		for(int i = 1 ; i <= 100 ; i++ ) {
			if(i%a==0) {				
				System.out.print(" " + i+",");
			}
		}
		
		System.out.println();
		System.out.println("Divided by 5:");
		
		for(int i = 1 ; i <= 100 ; i++ ) {
			if(i%b==0) {
				System.out.print(" "+i+",");
			}
		}
		
		System.out.println();
		System.out.println("Divided by 3 & 5:");
		for(int i = 1 ; i <= 100 ; i++ ) {
			if(i%a==0 && i%b==0) {
				System.out.print(" "+i+",");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		divisibleNumbers(3,5);
		
	}

}
