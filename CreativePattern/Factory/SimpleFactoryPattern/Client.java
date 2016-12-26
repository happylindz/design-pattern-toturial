interface Computer {
	public void printComputer();
}

class MacbookProComputer implements Computer {
	public void printComputer() {
		System.out.println("This is a macbook pro");
	}
}

class SurfaceBookComputer implements Computer {
	public void printComputer() {
		System.out.println("This is a surface book");
	}
}

class ComputerFactory {
	public Computer createComputer(String type) {
		Computer c = null;
		if(type.equals("macbook")) {
			c = new MacbookProComputer();
		}else if(type.equals("surface")) {
			c = new SurfaceBookComputer();
		}
		return c;
	}
}


public class Client {
	public void buy(Computer c){
		System.out.println("I buy a computer");
		c.printComputer();
	}
	public static void main(String[] args) {

		Client c = new Client();
		ComputerFactory cf = new ComputerFactory();

		Computer computer = cf.createComputer("macbook");
		c.buy(computer);
	}
}