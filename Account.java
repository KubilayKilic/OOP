import java.lang.*;  //not needed as loaded automatically
public class Account extends poly{
	protected int id;
	protected String name;
	protected double balance;
	
	public Account() {
		//factory settings
		id=9999; name="xxxxxx"; balance=0.0;
	}
	public Account (int id1, String n1, double b1)
	{
		id=id1; name=n1; balance=b1;
	}
	public void setBalance(double b1) {   //mutator function
		balance=b1;
	}
	public double getBalance() {
		return balance;
	}
	public void print() {
		System.out.println("Id:"+id+"  Name:"+name+"  Balance:"+balance);
	}
    public void addMoney(double amount) {
    	balance=balance+amount;
    }
    public void withdraw(double amount) {
    	if(balance>=amount)
    		balance-=amount;
    	else
    		System.out.println("Sorry insufficient balance");
    }
}
