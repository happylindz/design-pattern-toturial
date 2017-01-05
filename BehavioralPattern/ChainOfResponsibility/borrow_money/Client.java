
public class Client {
	public static void main(String[] args) {
		AbstractClerk clerk = new Clerk();
		AbstractClerk leader = new Leader();
		AbstractClerk manager = new Manager();
		AbstractClerk boss = new Boss();

		clerk.setSuperior(leader);
		leader.setSuperior(manager);
		manager.setSuperior(boss);

		//有人借款 10000 元
		clerk.approveRequest(new BorrowRequest(10000));

		//有人借款 111000 元
		clerk.approveRequest(new BorrowRequest(111000));

	}
}