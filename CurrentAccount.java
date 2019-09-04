
public class CurrentAccount extends Account {
	private double rate;
	
	public CurrentAccount(int id1, String n1, double b1, double r1) {
		super(id1,n1,b1); //As java does not support multiple inheritance
		             //super keyword is used to call Account constructor
		rate=0;
	}
	public void print() {
		System.out.println("Id:"+id+"  Name:"+name+"  Balance:"+balance);
	}
}
