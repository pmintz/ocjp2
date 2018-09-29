package Chapter1.Declarations.AccessControl;

public class InstantiateAbstractObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ac = new ExtendingAbstractClass();
		//NonAbstractClass nac = new NonAbstractClass();
		
		//InterfaceInterface ic = new InterfaceInterface();
		//AbstractClass abstractClass = new AbstractClass();
		
		ExtendingAbstractClass eac = new ExtendingAbstractClass();
		
		ExtendingAbstractClass test = (ExtendingAbstractClass) ac;
		
		System.out.println(ac.s);
		ac.print();
		System.out.println(eac.p);
		System.out.println(test.p);
		System.out.println(test.p);
		System.out.println(ExtendingAbstractClass.p);
		//System.out.println(nac.s);
		ExtendingAbstractClass ec = (ExtendingAbstractClass) ac;
		System.out.println(ec.s);
		ac.printHelloWord();
		ac.printHelloWorld();
		ac.print();
		AbstractClass newac = (AbstractClass) ac;
		newac.print();
		newac.print();
		System.out.println(newac.s);
		ec.printEAC();
		eac.printEAC();
		

	}

}
