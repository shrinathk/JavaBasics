import java.util.ArrayList;

public class Printuniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 9, 1 };

		ArrayList<Integer> alist = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int k = 0;

			if (!alist.contains(a[i])) {
				alist.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {

						k++;
					}
				}
				
				System.out.println(a[i] + " is repeated " + k + " time/times in the array");
				
			}
			
			

		}

	}

}
