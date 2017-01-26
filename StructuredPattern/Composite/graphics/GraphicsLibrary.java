import java.util.ArrayList;

class GraphicsLibrary {
	private ArrayList<GraphicsObject> components;
	public GraphicsLibrary() {
		components = new ArrayList<GraphicsObject>();
		initData();
	}
	public void initData() {
		GraphicsObject line = new Line();
		GraphicsObject circle = new Circle();
		GraphicsObject rectangle = new Rectangle();

		//添加基础图形到图形库中
		components.add(line);
		components.add(circle);
		components.add(rectangle);
		
		//创建并添加组合图形到图形库中
		GraphicsObject composite = new ComposedGraphicsObject();
		composite.add(line);
		composite.add(rectangle);
		components.add(composite);

	}
	public ArrayList<GraphicsObject> getGraphicsObjects() {
		return components;
	}
}