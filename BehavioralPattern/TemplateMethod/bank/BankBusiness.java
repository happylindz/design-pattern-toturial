abstract class BankBusiness {

	public void doBankBusiness(int money) {
		takeNumber();
		takeBusiness(money);
		rating();
	}
	private void takeNumber() {
		System.out.println("取号排队");
	}
	abstract protected void takeBusiness(int money);
	private void rating() {
		System.out.println("对银行人员进行评分");
	}

}