class Client{
	public static void main(String[] args){
		Stock stock = new TxStock();
		stock.addInvestor(new BeijingInvestor("Lindz"));
		stock.addInvestor(new ShenyangInvestor("Xun"));
		stock.setPrice(19);
		stock.setPrice(25);
	}
}
