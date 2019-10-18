package mypackage;

public class Test123 {
	static int objCount = 0;

	Test123() throws Exception {
		if (objCount > 4) {
			throw new Exception();
		} else {
			objCount++;
			System.out.println(objCount);
		}
	}

	public void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		Test123 a = null;
		Test123 b = null;
		Test123 c = null;
		Test123 d = null;
		Test123 e = null;
		Test123 f = null;
		
		try {
			a = new Test123();
			b = new Test123();
			c = new Test123();
			d = new Test123();
			e = new Test123();
			f = new Test123();
			
		} catch (Exception exw) {
			System.out.println("Object cannot be created");
		}
		
		a.display();
		f.display();
	}

}
