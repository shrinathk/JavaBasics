
public class Table {

	
	public static void printTable(int t) {
		
		for (int i = 1; i <= 10 ; i++) {
			
			System.out.println(t + " x " + i + " = " + t*i);
		}
	}
	public static void main(String[] args) {
		
		printTable(7);
	}
	
}
