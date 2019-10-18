
public class ReverseANumber {

	public static void main(String[] args) {

		int number = 12345;
		int reverse = 0;
		int r = 0;

		while (number != 0) {

			r = number % 10;
			reverse = reverse * 10 + r;
			number = number/10;
		}

		System.out.println(reverse);
	}

}
