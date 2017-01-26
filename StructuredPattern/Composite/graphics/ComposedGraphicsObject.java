import java.util.ArrayList;


class ComposedGraphicsObject extends GraphicsObject {
	private ArrayList<GraphicsObject> components;
	public ComposedGraphicsObject() {
		components = new ArrayList<GraphicsObject>();
	}
	@Override
	public void add(GraphicsObject object) {
		components.add(object);
	}
	@Override
	public void remove(GraphicsObject object) {
		components.remove(object);
	}
	public void draw() {
		for(GraphicsObject component: components) {
			component.draw();
		}
	}
}