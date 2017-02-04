class Invoker {
	Command command;
	public void setCommand(Command command) {
		this.command = command;
	}
	public void action() {
		System.out.println("调用者调用");
		command.execute();
	}
}