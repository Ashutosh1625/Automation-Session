package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		//ArrayList a1=new ArrayList();	
				//or
		List l1=new ArrayList();
		l1.add("Pune");//String --Auto-Upcasting--> to Object class
		l1.add("Delhi");
		l1.add("Mumbai");
		l1.add("Bangalore");
		System.out.println("List l1 elements: "+l1);
		System.out.println("Total element count in list: "+l1.size());
		
		List l2=new ArrayList();
		l2.add("Apple");//String --Auto-Upcasting--> to Object class
		l2.add("Mango");
		l2.add("Grapes");
		System.out.println("List l2 elements: "+l2);
		System.out.println("Total element count in list: "+l2.size());
		
		//to add one collection elements to another collection
		l1.addAll(l2);
		System.out.println("After adding l2, List l1 elements: "+l1);
		System.out.println("After adding l2, Total element count in list: "+l1.size());
		l1.removeAll(l2);
		System.out.println("After removing l2, List l1 elements: "+l1);
		System.out.println("After removing l2, Total element count in list: "+l1.size());
		System.out.println("*******************addAll with index***************************");
		l1.addAll(2,l2);
		System.out.println("After adding l2, List l1 elements: "+l1);
		System.out.println("After adding l2, Total element count in list: "+l1.size());
		l1.removeAll(l2);
		System.out.println("After removing l2, List l1 elements: "+l1);
		System.out.println("After removing l2, Total element count in list: "+l1.size());
	}
}