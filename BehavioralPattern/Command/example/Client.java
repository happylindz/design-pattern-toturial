class Client {
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		// 客户端直接执行具体命令方式（此方式与类图相符）  
		c.execute();

		System.out.println("------------------------------------");
		Invoker i = new Invoker();
		i.setCommand(c);
 		//客户端通过调用者来执行命令 		
 		i.action();

	}
}