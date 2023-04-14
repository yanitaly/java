package package1;
import package2.*;

public class A {

	protected String protectedMsg = "This is a protected msg.";

	public static void main(String[] args) {
		C c = new C();
		//System.out.println(c.defaultMsg); // NA, as defaultMsg is default from another pkg 
		System.out.println(c.publicMsg);   // OK as it is public from another pkg 
	}
}
