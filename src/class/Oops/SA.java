package bank;
class SA extends Account{
	private min_bal;
	   public double setmin_bal(double min){
		   this.min_bal=min;
		   return min_bal;
	   }
	   public double getmin_bal(){
		   return min_bal
	   }
	   public  void cal_bal(){
		double balance=getamount();
		balance=balance-getmin_bal();
		System.out.println(getacc_name()+" balance is :"+balance);
	}
	
}