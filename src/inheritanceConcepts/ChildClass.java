package inheritanceConcepts;

public class ChildClass extends ParentClass {

	
	public void go() {
		
		System.out.println("This is child class");
	}
	
	public void getChildClassMethods() {
		
		System.out.println("All the child class methods are listed");
	}
	
	
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		
		c.getChildClassMethods();
		
		ParentClass p = new ChildClass();
		
		p.getParentClassMethods();
		
		p.go();
	}
}
