package bank1;
public class SA extends Account{
	public void details(){
		double balance=getamount();
		balance=balance-getmin_bal();
		System.out.println(getid()+" balance is :"+balance);
	}
	private  double min_bal;
	   public double setmin_bal(double min){
		   this.min_bal=min;
		   return min_bal;
	   }
	   public double getmin_bal(){
		   return min_bal;
	   }
}
class Account_Service {
	public static void get_Account(Account a) {
		a.details();
	}
}
class text{
	public static void main(String args[]){
		 SA a=new SA();
		 a.setmin_bal(500.00);
		 a.setid(101);
		 Account_Service.get_Account(a);
	}
}