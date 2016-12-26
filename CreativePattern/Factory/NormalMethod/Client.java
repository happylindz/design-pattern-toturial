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


public class Client {
	public void buy(Computer c){
		System.out.println("I buy a computer");
		c.printComputer();
	}
	public static void main(String[] args) {

		Client c = new Client();
		c.buy(new SurfaceBookComputer());

	}
}