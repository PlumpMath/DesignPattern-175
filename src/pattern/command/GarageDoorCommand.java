package pattern.command;

class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	public void execute(){
		garageDoor.up();
	}
}

class GarageDoor {
	void up(){
		System.out.println("Garage door is Open.");
	}
}
