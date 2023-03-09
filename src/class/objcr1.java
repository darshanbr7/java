// object creation  using multiple classesin java
class a1{
    
    static  int z=23;
}

class a3  {
    class a2{
    int b=33;
    }
    public static void main (String args[]){
       a3 object=new a3();
    System.out.println(object.z);
      
    }
}