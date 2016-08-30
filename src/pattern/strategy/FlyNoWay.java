package pattern.strategy;

public class FlyNoWay implements FlyBehavior {
	public void fly(){
		System.out.println("Can't Fly");
	}
}
