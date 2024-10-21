package collection;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;

	public class Example4 {

		public static void main(String[] args) {
			
			//Generic to stor similar type of object in collection
			List<String> obj1=new ArrayList<String>();
			
			List<Integer> obj2=new ArrayList<Integer>();
			
			List<Example4> obj3=new ArrayList<Example4>();		
			
			
			
			List<String> l1=new ArrayList<String>();
			l1.add("Pune");//String --Auto-Upcasting--> to Object class
			l1.add("Delhi");
			l1.add("Mumbai");
			l1.add("Bangalore");
//			/l1.add(123);//compile time error, not allowed to store other dn String object
			System.out.println("List l1 elements: "+l1);
			System.out.println("Total element count in list: "+l1.size());
			
			//sort collection elements
			Collections.sort(l1);
			System.out.println("List l1 elements: "+l1);
			System.out.println("Total element count in list: "+l1.size());
			
			Collections.reverse(l1);
			System.out.println("List l1 elements: "+l1);
			System.out.println("Total element count in list: "+l1.size());
		}
	}