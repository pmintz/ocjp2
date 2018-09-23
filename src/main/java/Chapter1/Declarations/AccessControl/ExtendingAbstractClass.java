package Chapter1.Declarations.AccessControl;

public class ExtendingAbstractClass extends AbstractClass {
	
	String s = "Extending Abstract Class";
	
	
	
	@Override
	protected void printHelloWord() {
		// TODO Auto-generated method stub
		System.out.println("Hello Word");
		
	}

	@Override
	public void printHelloWorld() {
		// TODO Auto-generated method stub
		System.out.println("Hellow World");
		
	}
	
	void printEAC(){
		System.out.println("Had to create separate object otherwise not visible from"
				+ " superclass");
	}
	
	@Override
	void print(){
		System.out.println("Overriding print to demonstrate runtime behavoir");
	}

}
