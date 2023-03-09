package bank;
  public abstract  class back{
	public abstract void cal_bal();
}
 class Account extends bank{
	
	private int id;
	public int setid(int id){
		this.id=id;
		return id;
	}
	public int getid(){
	return id;	
	}
	
	private String acc_Name;
	public String setacc_Name(String name){
		this.acc_Name=name;
		return name;
	}
	public String getacc_name(){
		return acc_Name;
	}
	private double amount;
	public double setamount(double amount){
		this.amount=amount;
		return amount;
		}
	private double getamount(){
		return amount;
	}
	public  void cal_bal(){
		
	}
}
class CA extends Account{
	private int min_bal;
	   public double setmin_bal(double min){
		   this.min_bal=min;
		   return min_bal;
	   }
	   public double getmin_bal(){
		   return min_bal;
	   }
	   public  void cal_bal(){
		double balance=getamount();
		balance=balance-getmin_bal();
		System.out.println(getacc_name()+" balance is :"+balance);
	}
	
}
class SA extends Account{
	private  int min_bal;
	   public double setmin_bal(double min){
		   this.min_bal=min;
		   return min_bal;
	   }
	   public double getmin_bal(){
		   return min_bal;
	   }
	   public  void cal_bal(){
		double balance=getamount();
		balance=balance-getmin_bal();
		System.out.println(getacc_name()+" balance is :"+balance);
	}
	
}
 class Account_Service {
	public static void get_Account(Account a) {
		a.cal_Bal();
	}
}
 class text{
	public static void main(String args[]){
		SA a=new SA();
		a.setid(101);
		a.setname("darshan");
		a.setamount(5000.00);
		a.setmin_bal(500.00);
		Account_Service.get_Account(a1);// encapsulation
		
		CA b=new CA();
		b.setid(102);
		b.setname("raju");
		b.setamount(50000.00);
		b.setmin_bal(5000.00);
		Account_Service.get_Account(a2);// encapsulation
	}
}