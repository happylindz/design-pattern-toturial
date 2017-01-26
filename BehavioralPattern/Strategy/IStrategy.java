interface IStrategy{
	public void doSomething();
}

class ConcreteStrategy1 implements IStrategy{
	public void doSomething(){
		System.out.println("具体策略1");
	}
}

class ConcreteStrategy2 implements IStrategy{
	public void doSomething(){
		System.out.println("具体策略2");
	}
}
