class Client {
	public static void main(String[] args) {
		GraphicsLibrary gl = new GraphicsLibrary();

		//使用基础图形 line
		System.out.println("第一个图形:");
		gl.getGraphicsObjects().get(0).draw();

		//使用组合图形 composite
		System.out.println("第二个图形:");
		gl.getGraphicsObjects().get(3).draw();
	}
}