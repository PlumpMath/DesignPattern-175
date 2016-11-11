package test;

public class Warehouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Warehouse warehouse = new Warehouse();  
//		  warehouse.addPacker(new Packer() {
//		   public boolean pack(Box box) {
//		    return false;
//		   }
//		  });
		  
		  
	}
	
	void addPacker(Packer p){
		
	}
	
	public Object createObject(String classname) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Object obj = null;
//		Class theclass = Class.forName(classname);
//		obj = theclass.newInstance();
		
//		obj = Class.newInstance("");
		Class theClass = Class.forName(classname);
		return null;
	}

}

interface Packer {
	 boolean pack(Box box);
	}

//class SimplePacker implements Packer {
//	 @Override
//	 public boolean pack(Box b) {
//	  return false;
//	 }
//	}

 class SimplePacker implements Packer {
	 public boolean pack(Box box) {
	  return false;
	 }
	}
 
 
class Box {
	
}