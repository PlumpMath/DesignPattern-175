package pattern.template.set2;

public abstract class CaffeineBeverageWithHook {

	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	void boilWater(){
		System.out.println("Boiling Water!");
	}
	
	abstract void brew();

	void pourInCup(){
		System.out.println("Pouring in Cup!");
	}
	
	abstract void addCondiments();
	
	boolean customerWantsCondiments(){
		return true;
	}
}
