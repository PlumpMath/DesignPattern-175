package pattern.adapter;

public class TurkeyAdapter implements Duck {
	// Implement the interface of the type you are adapting to
	// the interface your client expect to see
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey){
		// Reference to the object that we are adapting here
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}
	
	public void fly() {
		for(int i=0; i<5; i++){
			turkey.fly();
		}
	}
	
	
}
