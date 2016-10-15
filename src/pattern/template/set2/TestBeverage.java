package pattern.template.set2;

public class TestBeverage {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println("===== PREPARING TEA =====");
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		System.out.println("==============================");
		
		System.out.println();
		
		System.out.println("==============================");
		System.out.println("===== PREPARING COFFEE =====");
		CoffeeWithHook myCoffee = new CoffeeWithHook();
		myCoffee.prepareRecipe();
		System.out.println("==============================");
	}

}
