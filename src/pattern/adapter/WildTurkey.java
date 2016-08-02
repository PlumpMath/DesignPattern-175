package pattern.adapter;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble Gobble");
	}
	
	public void fly() {
		System.out.println("I am flying a short distance");
	}
}
