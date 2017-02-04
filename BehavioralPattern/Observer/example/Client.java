class Client {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();	
		Observer o1 = new ConcreteObserver1();
		Observer o2 = new ConcreteObserver2();
		Observer o3 = new ConcreteObserver3();
		
		subject.attach(o1);
		subject.attach(o2);
		subject.attach(o3);

		subject.setState(11);
		subject.detach(o2);

		subject.setState(12);
	}
}