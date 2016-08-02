package pattern.adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);	// Wrap the Turkey in a TurkeyAdapter which makes it look like a duck
		
		System.out.println("The Turkey says. . . .");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("The Duck says. . . .");
		testDuck(duck);
		
		System.out.println("The TurkeyAdapter says. . . . .");
		testDuck(turkeyAdapter);
	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
