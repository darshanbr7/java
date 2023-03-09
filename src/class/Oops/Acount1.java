package bank;
public class Account extends bank{
	
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