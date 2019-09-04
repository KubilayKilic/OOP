
public class DepositAccount extends Account{
	private double rate;
	public DepositAccount(int i, String n, double b, double r) {
		super(i,n,b);
		rate=r;
	}
	void addInterest() {
		balance=balance*(1+rate);
	}
	public void print() {
		System.out.println("Id:"+id+"  Name:"+name+"  Balance:"+balance);
	}
}
