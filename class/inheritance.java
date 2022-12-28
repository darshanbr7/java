 // inheritance proprty applying to java 
 
class modifier{
    static  int a1=23;
    public void display(){
        // System.out.println("it is parent class");
    }
    
}
class method extends modifier{
    public void greet(){
        System.out.println("it is th sub class");
    }
    public static void main(String args[]){
       method obj=  new method();
       obj.display();
     System.out.println(obj.a1);

    }
      }