abstract class AbstractClass {
	public void templateMethod() {
		this.primitiveOperation1();
		this.primitiveOperation2();
		this.primitiveOperation3();
	}
	private void primitiveOperation1() {
		System.out.println("do something 1");
	}
	abstract protected void primitiveOperation2();
	abstract protected void primitiveOperation3();	
}

