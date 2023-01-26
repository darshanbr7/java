package Acessmodifier;

class c2 extends c1 {

	public static void main(String[] args) {
		c1 a=new c2();
		a.setsal(10.00);
		a.setid(10);
		a.setname("darshan");
		System.out.println(a.getsal());
		System.out.println(a.getid());
		System.out.println(a.getname());

	}

}
