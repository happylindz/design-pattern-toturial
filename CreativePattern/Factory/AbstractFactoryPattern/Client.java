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

interface OperatingSystem {
	public void printSystem();
}

class MacOsSystem implements OperatingSystem {
	public void printSystem() {
		System.out.println("This is a mac os");
	}
}

class Windows8System implements OperatingSystem {
	public void printSystem() {
		System.out.println("This is a window 8");
	}
}

interface ProductionFactory {
	public Computer createComputer();
	public OperatingSystem createSystem();
}

class AppleFactory implements ProductionFactory {
	public Computer createComputer() {
		return new MacbookProComputer();
	}
	public OperatingSystem createSystem() {
		return new MacOsSystem();
	}
}

class MsFactory implements ProductionFactory {
	public Computer createComputer() {
		return new SurfaceBookComputer();
	}
	public OperatingSystem createSystem() {
		return new Windows8System();
	}
}

public class Client {

	public void buy(Computer c){
		System.out.println("I buy a computer");
		c.printComputer();
	}
	public void use(OperatingSystem s) {
		System.out.println("Operating System");
		s.printSystem();
	}
	public static void main(String[] args) {
	
		ProductionFactory pf = new AppleFactory();
		Computer c = pf.createComputer();
		OperatingSystem s = pf.createSystem();

		Client client = new Client();
		client.buy(c);
		client.use(s);

	}
}

