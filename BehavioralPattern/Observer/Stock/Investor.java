interface Investor{
	public void update(int price);
}

class BeijingInvestor implements Investor{
	private String name;
	public BeijingInvestor(String name){
		this.name = name;
	}
	public void update(int price){
		System.out.println("Beijing Investor " + this.getName() + " know the stock change to " + price);
	}
	public String getName(){
		return this.name;
	}
}

class ShenyangInvestor implements Investor{
	private String name;
	public ShenyangInvestor(String name){
		this.name = name;
	}
	public void update(int price){
		System.out.println("Shenyang Investor " + this.getName() + " know the stock change to " + price);
	}
	public String getName(){
		return name;
	}
}
