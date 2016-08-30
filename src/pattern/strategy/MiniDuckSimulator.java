package pattern.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		System.out.println("\n --------------------------- \n");
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.setQuackBehavior(new MuteQuack());
		rubber.performQuack();
	}

}
