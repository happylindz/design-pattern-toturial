abstract class Component {
	public abstract void operation();
	public void add(Component c) {
		throw new UnsupportedOperationException();
	}
	public void remove(Component c) {
		throw new UnsupportedOperationException();
	} 
	public Component getChild(int index) {
		throw new UnsupportedOperationException();
	}
}

class ConcreteLeaf1 extends Component {
	public void operation() {
		System.out.println("concrete leaf 1 operation");
	}
}

class ConcreteLeaf2 extends Component {
	public void operation() {
		System.out.println("concrete leaf 2 operation");
	}
}

class ConcreteLeaf3 extends Component {
	public void operation() {
		System.out.println("concrete leaf 3 operation");
	}
}

class ConcreteLeaf4 extends Component {
	public void operation() {
		System.out.println("concrete leaf 4 operation");
	}
}