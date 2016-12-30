class Televation {

}

interface Command {
	public void execute();
}

class TVOpenCommand implements Command {
	public void execute(){
		System.out.println("TV open");
	}
}

class TVCloseCommand implements Command {
	public void execute() {
		System.out.println("TV close");
	}
}

class Controller {
	
}