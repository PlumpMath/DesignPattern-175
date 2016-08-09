package pattern.template;

public class TestBeverage {

	public static void main(String[] args) {
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}

}
