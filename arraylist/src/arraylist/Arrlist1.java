package arraylist;

import java.util.ArrayList;

public class Arrlist1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		// applying CRUD operatin
		// adding the new element to the array list
		a.add(10);
		a.add("darshan");
		a.add("Mandya");
		a.add(21);
		System.out.println(a);
		// Reading ArrayList Element
		for(Object ele:a) {
			System.out.println(ele);
		}
		// updating the arrayListt element
		a.add(2,"Raju");// modifing the elemnt at the 2 nd 
		System.out.println(a);
		// deleting the arraylist element
		a.remove(1);// it specifies the index
		a.remove("darshan");// it specifies the String
		a.removeAll(a);// in removeAll method we pass the array as aparameter 
		System.out.println(a);

	}

}
