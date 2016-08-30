package pattern.iterator.basic;

public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		System.out.println("============ Pancake List ============");
		while(pancakeIterator.hasNext()){
			MenuItem item = (MenuItem) pancakeIterator.next();
			System.out.println(item.name + "   -   " + item.price);
		}
		System.out.println("============ Diner List ============");
		while(dinerIterator.hasNext()){
			MenuItem item = (MenuItem) dinerIterator.next();
			System.out.println(item.name + "   -   " + item.price);
		}
	}
	
}
