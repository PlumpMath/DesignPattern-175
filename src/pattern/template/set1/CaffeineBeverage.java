package pattern.template.set1;

public abstract class CaffeineBeverage {
	
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	void boilWater(){
		System.out.println("Boiling Water!");
	}
	
	abstract void brew();

	void pourInCup(){
		System.out.println("Pouring in Cup!");
	}
	
	abstract void addCondiments();
}
