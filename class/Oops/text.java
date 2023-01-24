package bank;
public class text{
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