
public class TestAccount {
	public static void main(String s[]) {
		
	//for implementing polymorphism
		int i;
		poly p[]=new poly[2];
		
		Account a1;
		a1=new Account();
		Account a2=new Account(32,"Ali",500);
		a1.print();
		a2.print();
		//a1.balance=1500;  illegal as encapsulation prevents changing private members outside the class
		a1.setBalance(1500);
		a1.print();
		
		a2.addMoney(1000);
		a2.withdraw(300);
		a2.print();
		a2.withdraw(2200);
		a2.print();
		
		CurrentAccount ca1=new CurrentAccount(64,"veli",4950,0.25);
		ca1.print();
		
		DepositAccount da1=new DepositAccount(16,"Mehmet",2000,0.25);
		da1.addInterest();
		da1.print();
		System.out.println("******polymorphism starts******");
		
		p[0]=ca1;
		p[1]=da1;
		
		for(i=0; i<2; i++)
			 p[i].print();
	}

}
