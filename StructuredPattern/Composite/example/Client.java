public class Client {
	public static void main(String[] args) {
		Component leaf1 = new ConcreteLeaf1();
		Component leaf2 = new ConcreteLeaf2();
		Component leaf3 = new ConcreteLeaf3();
		Component composite = new Composite();

		composite.add(leaf1);
		composite.add(leaf2);
		composite.add(leaf3);
		composite.operation();

		Component bigComposite = new Composite();
		bigComposite.add(composite);
		Component leaf4 = new ConcreteLeaf4();
		bigComposite.add(leaf4);
		bigComposite.operation();

	}
}