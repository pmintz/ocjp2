package Chapter1.Declarations.AccessControl;

public class InstantiateAbstractObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ac = new ExtendingAbstractClass();
		//NonAbstractClass nac = new NonAbstractClass();
		
		ExtendingAbstractClass eac = new ExtendingAbstractClass();
		
		System.out.println(ac.s);
		//System.out.println(nac.s);
		ExtendingAbstractClass ec = (ExtendingAbstractClass) ac;
		System.out.println(ec.s);
		ac.printHelloWord();
		ac.printHelloWorld();
		ac.print();
		AbstractClass newac = (AbstractClass) ac;
		newac.print();
		ec.printEAC();
		eac.printEAC();
		

	}

}
