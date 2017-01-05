abstract class AbstractClerk {
	private AbstractClerk superior = null;
	protected String type;
	public void setSuperior(AbstractClerk superior) {
		this.superior = superior;
	} 
	public void approveRequest(BorrowRequest request) {
		if(getLimit() >= request.getMoney()) {
			System.out.println(getType() + "同意借款请求");
		}else {
			if(this.superior != null) {
				this.superior.approveRequest(request);
			}else {
				System.out.println("没有人能够同意借款请求");
			}
		}
	}
	public abstract int getLimit();
	public String getType() {
		return type;
	}
}

class Clerk extends AbstractClerk{
	public Clerk() {
		super.type = "职员";
	}
	public int getLimit() {
		return 5000;
	}
}

class Leader extends AbstractClerk{
	public Leader() {
		super.type = "组长";
	}
	public int getLimit() {
		return 20000;
	}
}

class Manager extends AbstractClerk{
	public Manager() {
		super.type = "经理";
	}
	public int getLimit() {
		return 100000;
	}
}

class Boss extends AbstractClerk{
	public Boss() {
		super.type = "老版";
	}
	public int getLimit() {
		return 1000000;
	}
}