import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List lst= new ArrayList();
	lst.add(23);
	lst.add(0,"Abi");
	lst.add("Arun");
	lst.add(false);
	lst.add(223.9f);
	lst.add("Abi");
	System.out.println(lst);
	lst.remove("Abi");
	System.out.println(lst);
	//using for loop
	for(int i=0; i<lst.size(); i++) {
		System.out.println(lst.get(i));
	}
	// for statement---> for each loop
	System.out.println("************");
	for( Object x:lst) { //object is used as dataType because list has many
		System.out.println(x);
	}
	System.out.println("****using iterator*****");
	
	Iterator  itr= lst.iterator();
	while(itr.hasNext());{
		System.out.println(itr.next());
	}
	
	}

}
