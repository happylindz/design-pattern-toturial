import java.util.ArrayList;
class Composite extends Component {
	private ArrayList<Component> children;
	public Composite() {
		children = new ArrayList<Component>();
	}
	public void operation() {
		System.out.println("composite operation");
		for(Component child: children) {
			child.operation();
		}
	}
	
	@Override 
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public Component getChild(int index) {
		return children.get(index);
	}

}