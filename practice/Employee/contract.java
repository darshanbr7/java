package pack1;
public class contract extends Employee1{
	private double sal;
	public void setsal(double sal){
		this.sal=sal;
	}
	public double getsal(){
		return sal;
	}
	private double tax;
	 public void settax(double tax){
		 this.tax=tax;
	 }
	 public double gettax(){
		 return tax;
	 }
	 public  void emp(){
		 double balance =getsal()-2000;
		 System.out.println(getid()+" :"+getEmp_name()+" : the salary after tax deduction "+balance);
	 }
}