package StreameAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class s2 {

	public static void main(String[] args) {
	   List<String> a= new ArrayList();
	   a.add("darshan");
	   a.add("chirag");
	   a.add("muni");
	   a.add("kishan");
	     Stream b=a.stream().map(x->x.concat(" mandya"));
	     System.out.println(b);
	   b.forEach(ele->System.out.println(ele));
	  

	}

}
