interface Observer {
	public void update(int state);
}

class ConcreteObserver1 implements Observer {
	public void update(int state) {
		System.out.println("ConcreteObserver1 know state had changed to " + state);
		doSomething();
	}	
	private void doSomething() {
		System.out.println("ConcreteObserver1 do something!!!");
	}
}

class ConcreteObserver2 implements Observer {
	public void update(int state) {
		System.out.println("ConcreteObserver2 know state had changed to " + state);
		doSomething();
	}	
	private void doSomething() {
		System.out.println("ConcreteObserver2 do something!!!");
	}
}

class ConcreteObserver3 implements Observer {
	public void update(int state) {
		System.out.println("ConcreteObserver3 know state had changed to " + state);
		doSomething();
	}	
	private void doSomething() {
		System.out.println("ConcreteObserver3 do something!!!");
	}
}