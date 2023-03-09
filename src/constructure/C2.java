package constructure;

import java.util.ArrayList;
import java.util.List;

public class C2 {

	public static void main(String[] args) {
		List<C1>Emp =new ArrayList();
		Emp.add(new C1(101,"darshan",30000));
		Emp.add(new C1(102,"chirag",300));
		Emp.add(new C1(103,"muni",34000));
		Emp.add(new C1(104,"kishan",40000));
		Emp.add(new C1(105,"narasimha",50000));
		Emp.add(new C1(106,"raju",30030));
		Emp.add(new C1(107,"harshan",40000));
		Emp.add(new C1(108,"harshhi",50000));
		for(int i=0;i<Emp.size();i++) {
			System.out.println(Emp.get(i).getId());
		}
		
		

	}

}
