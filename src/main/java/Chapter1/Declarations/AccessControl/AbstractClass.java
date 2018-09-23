package Chapter1.Declarations.AccessControl;

public abstract class AbstractClass {
	
	public String s = "Abstract Class";
	
	abstract protected void printHelloWord();
	
	public abstract void printHelloWorld();
	
	void print(){
		System.out.println("Without abstract keyword the method is assumed to be a non abstract"
				+ " method and therefore needs a body");
	}

	

}
