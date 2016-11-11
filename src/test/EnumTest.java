package test;

import java.util.ArrayList;
import java.util.List;

public class EnumTest {

	public enum ItemType {
	    COMPANY_WIDE("Company"),
	    DEPARTMENTAL("Departmental"),
	    PROJECT_SPECIFIC("Project");

	    private String itemCode;
	    
	    private ItemType(String dbCode){ this.itemCode = dbCode; }
	    
	    public String getItemCode(){ return itemCode; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ItemType type3 = new ItemType("Project");
		ItemType type2 = ItemType.valueOf("PROJECT_SPECIFIC");
		ItemType type4 = ItemType.values()[0];
		ItemType type1 = ItemType.DEPARTMENTAL;
		
//		List<Tree> trees = new ArrayList<Tree>();
//		List<Plant> plants = trees;
		
		
		List<Plant> plants = new ArrayList<Plant>();
		plants.add(new Plant());
		List<? extends Plant> trees = plants;
		Plant plant = trees.get(0);
	}

}

class Plant {
	
}

class Tree extends Plant {
	
}
