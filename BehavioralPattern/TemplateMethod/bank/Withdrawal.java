class Withdrawal extends BankBusiness {
	protected void takeBusiness(int money) {
		System.out.println("取款 " + money);
	}
}