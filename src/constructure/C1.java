package constructure;

public class C1 {

	private int id;
	private String name;
	private int sal;
	
    public void  setId(int id) {
    	this.id=id;
    }
    public int getId() {
	   return id;
    }
    public void  setName(String name) {
    	this.name=name;
    }
    public String getName() {
	   return name;
    }
    public void  setSal(int sal) {
    	this.sal=sal;
    }
    public int getSal() {
	   return sal;
    }
	public C1(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	
	
	
    

}
