class Client {
	public static void main(String[] args) {
		BankBusiness bb = new SaveMoney();
		bb.doBankBusiness(1200);
		System.out.println("----------------------------------------");
		bb = new Transfer();
		bb.doBankBusiness(1000);
	}
}