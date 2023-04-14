package broCode;

public class Fish  implements Predator,Prey {
	@Override
	public void flee() {
		System.out.println("Small fish is fleeing");
	}
		
	@Override
	public void hunt() {
		System.out.println("Big fish is hunting");
	}
}