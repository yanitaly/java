package package2;
import package1.*;

public class Asub extends A {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.defaultMsg);
		// System.out.println(c.privateMsg); // NA, as pivateMsg is only for that class. 

		Asub asub = new Asub();
		System.out.println(asub.protectedMsg);
		
		//B b = new B();  // NA, B is default from another pkg 
	}
}
