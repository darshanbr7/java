package bank1;
  abstract class bank{
	public abstract void detail();
}
  class Account extends bank{
	public void details(){
		System.out.println("account details");
	}
	private int id;
	public int setid(int id){
		this.id=id;
		return id;
	}
	public int getid(){
		return id;
	}
	private double amount;
	public void setamount(double amount){
		this.amount=amount;
	}
	public double getamount(){
		return amount;
	}
	
}
 
 