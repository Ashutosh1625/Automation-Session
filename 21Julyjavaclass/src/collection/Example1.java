package collection;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		//ArrayList a1=new ArrayList();	
				//or
		List l1=new ArrayList();
		l1.add("Pune");//String --Auto-Upcasting--> to Object class
		l1.add(123);// Auto Boxing(int to Integer) dn auto upcasting(Integer to Object)
		l1.add(null);
		l1.add("Pune");
		l1.add("Mumbai");
		System.out.println("List l1 elements: "+l1);
		l1.add(3, "Apple");
		System.out.println("updated, List l1 elements: "+l1);
		System.out.println("Total element count in list: "+l1.size());
		System.out.println("Element at index 4: "+l1.get(4));
		l1.set(4, "Mango");
		System.out.println("updated, List l1 elements: "+l1);
		System.out.println("**************Print element one by one using for loop*****************");
		for(int i=0;i<l1.size();i++) {
			System.out.println("element at index "+i+" :"+l1.get(i));
		}
		System.out.println("**************Print element one by one using for-each loop*****************");
		for(Object obj:l1) {
			System.out.println(obj);
		}
		System.out.println("***************Print element one by one using Iterator interface*********");
		Iterator itr=l1.iterator();
		/*
		 * Iterator is an interface belongs to java.util package
		 * it has several method to iterator collection elements without indexing, like
		 * 		hasNext(): returns true or false based on next element availability
		 * 		next() : returns next element from the collection, if collection is empty or no next element is available dn it will throw an exception like nosuchelement exception
		 * 		remove(): it will remove the element from the collection
		 * NOTE: iterator instance can be used only once for iteration, for 2nd iteration you need to create new instance
		 */
//		System.out.println(itr.next());//pune
//		System.out.println(itr.next());//123
//		System.out.println(itr.next());//null
//		System.out.println(itr.next());//Apple
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//Mumbai
//		System.out.println(itr.next());//NoSuchElementException
		//to avoid NoSuchElementException, always check whether collection has next element or not
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("************Trying to use same iterator instance again*****************");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("***********Creating new instance for 2nd iteration****************");
		Iterator itr1=l1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}