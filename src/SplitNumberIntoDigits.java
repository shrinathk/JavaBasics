import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SplitNumberIntoDigits {

	public static void main(String[] args) {

		int number = 12345;

		int[] digitArray = new int[5];

		for (int i = 0; i < 5; i++) {

			int digit = number % 10;
			System.out.println(digit);
			digitArray[i] = digit;
			number = number / 10;

			System.out.println(digitArray[i]);
		}

		System.out.println(Arrays.toString(digitArray));

	}

}
