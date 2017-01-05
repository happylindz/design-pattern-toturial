class BorrowRequest {
	private int requestMoney;
	public BorrowRequest(int money) {
		System.out.println("有新请求，需要借款 " + money + " 元");
		requestMoney = money;
	}
	public int getMoney() {
		return requestMoney;
	}
}