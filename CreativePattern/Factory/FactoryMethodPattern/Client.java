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
interface ComputerFactory {
	public Computer createComputer();
}

class MsFactory implements ComputerFactory {
	public Computer createComputer(){
		return new SurfaceBookComputer();
	}
}

class AppleFactory implements ComputerFactory {
	public Computer createComputer() {
		return new MacbookProComputer();
	}
}

public class Client {
	public void buy(Computer c){
		System.out.println("I buy a computer");
		c.printComputer();
	}
	public static void main(String[] args) {

		Client c = new Client();
		ComputerFactory cf = new AppleFactory();

		Computer computer = cf.createComputer();
		c.buy(computer);
	}
}