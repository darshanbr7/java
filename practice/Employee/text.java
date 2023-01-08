package pack1;
 public class text{
	 public static void main(String args[]){
		permanent a= new permanent();
		a.setid(101);
		a.setEmp_name("darshan");
		a.setsal(45000.00);
		a.settax(1.5);
		empenc.Cal_tax(a);
		
		 contract b=new contract();
		 b.setid(102);
		b.setEmp_name("raju");
		b.setsal(35000.00);
		b.settax(1.5);
		empenc.Cal_tax(b);
	 }
 }