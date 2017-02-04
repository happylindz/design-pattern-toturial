import java.util.Vector;

abstract class Stock{
	private Vector<Investor> investors = new Vector<Investor>();
	protected int price = 0;
	public void addInvestor(Investor i){
		this.investors.add(i);
	}
	public void delInvestor(Investor i){
		this.investors.remove(i);
	}
	protected void notifyInvestors(int price){
		System.out.println("begin to notify the investors.");
		for(Investor i:investors){
			i.update(price);
		}
	};
	public abstract void setPrice(int price);
}

class TxStock extends Stock{
	public void setPrice(int price){
		System.out.println("change price.");
		this.price = price;
		this.notifyInvestors(price);
	}
}

