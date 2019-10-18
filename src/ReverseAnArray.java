import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] originalArray = { 1, 2, 3, 4, 5 };

		for (int i = (originalArray.length) - 1; i >= 0; i--) {

			int j = Array.getInt(originalArray, i);
			System.out.println(j);

		}

	}

}
