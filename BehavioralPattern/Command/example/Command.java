interface Command {
	public void execute();
}

class ConcreteCommand implements Command {
	Receiver receiver;
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	public void execute() {
		System.out.println("命令执行!");
		receiver.doSomething();
	}
}