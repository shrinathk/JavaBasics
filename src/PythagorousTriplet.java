
public class PythagorousTriplet {

	public static void main(String[] args) {

		PythagorousTriplet pt = new PythagorousTriplet();

		System.out.println(pt.checkPythagorousLogic(5, 12, 13));

	}

	public boolean checkPythagorousLogic(int side1, int side2, int side3) {

		 while(side1 > side2 && side1 > side3) {

			if (side1 * side1 == (side2 * side2) + (side3 * side3)) {

				return true;
			} else {

				return false;
			}
			
		}

		while(side3 > side2 && side3 > side1) {

			if (side3 * side3 == (side2 * side2) + (side1 * side1)) {

				return true;
			} else {

				return false;
			}
		}

		while(side2 > side1 && side2 > side3) {

			if (side2 * side2 == (side1 * side1) + (side3 * side3)) {

				return true;
			} else {

				return false;
			}
		}

		return false;
	}

}
