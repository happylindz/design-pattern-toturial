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

class Window8System implements OperatingSystem {
	public void printSystem() {
		System.out.println("This is a window 8");
	}
}

interface ProductionFactory {
	public Computer createComputer();
	public OperatingSystem createSystem();
}

class MacFactory implements ProductionFactory {
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
		return new Window8System();
	}
}

public class Client {
	public static void main(String[] args) {
		ProductionFactory pf = new MacFactory();
		pf.createComputer().printComputer();
		pf.createSystem().printSystem();

		System.out.println("----------------------------------------");
		pf = new MsFactory();
		pf.createComputer().printComputer();
		pf.createSystem().printSystem();
	}
}

