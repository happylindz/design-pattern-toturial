public class Client {
	public static void main(String[] args) {
		Handler ch1 = new ConcreteHandler1();
		Handler ch2 = new ConcreteHandler2();
		Handler ch3 = new ConcreteHandler3();

		ch1.setNextHandler(ch2);
		ch2.setNextHandler(ch3);

		Response res1 = ch1.handlerRequest(new Request(new Level(2)));
		if (res1 != null) {
			System.out.println(res1.getMessage());
		}

		Response res2 = ch1.handlerRequest(new Request(new Level(4)));
		if (res2 != null) {
			System.out.println(res2.getMessage());
		}
	} 
}