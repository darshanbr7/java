package pack;
public class text1 extends text{
	public void m1(){
		double balance=getamount();
		balance=balance-getmin_bal();
		System.out.println(" balance is :"+balance);
	}
	private double min_bal;
	  public void setmin_bal(double min_bal){
		  this.min_bal=min_bal;
	  }
	   public double getmin_bal(){
		   return min_bal;
	   }
	
}