package pattern.iterator.basic;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList menuItems;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList menuItems){
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position >= menuItems.size()){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) menuItems.get(position);
		position++;
		return menuItem;
	}
}
