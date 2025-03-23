package Day_6_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayListDemo {
// ArrayList - is class which implemented list interface
	public static void main(String[] args) {
		// declaration
		ArrayList mylist = new ArrayList();// any types of objects
		// List mylist= new ArrayList();
		// ArrayList <Integer>mylist= new ArrayList<Integer>();
		// ArrayList <String>mylist1= new ArrayList <String>();

		// adding data into ArrayList
		mylist.add(100);
		mylist.add("Welcome");
		mylist.add(10.5);
		mylist.add(true);
		mylist.add(null);
		mylist.add('A');
		// size of an Array
		System.out.println("Size of an ArrayList " + mylist.size());

		// printing ArrayList
		System.out.println("printing data from arraylist " + mylist);
		mylist.remove(2);
		System.out.println("After removing: " + mylist);

		// insert element in the arraylist
		mylist.add(3, "java");
		System.out.println("After insertion:" + mylist);

		// Modify element in the arraylist(modify/replace/change)
		mylist.set(3, "Selenium");
		System.out.println("after modification:" + mylist);

		// access specific element
		// count from 0 to 1
		System.out.println("Access specific element:" + mylist.get(1));

		// reading all the elements from arraylist(iterator which is nothing but cursor)
		// using normal for loop


	/*	1)for (int i=0;i<=mylist.size();i++) 
		{
			System.out.println(mylist.get(i));
		}
	*/
		//2)using for...each loop
	/*	for (Object x:mylist) 
		{
			System.out.println(x);
		}
	
	*/
		// 3) using iterator
		
		Iterator it= mylist.iterator();
		
		while (it.hasNext())
		{
			System.out.println("Iterator:"+it.next());
		}
	
		//checking arraylist is empty or not
		System.out.println("Is arraylist empty? "+mylist.isEmpty());
	
		
		// remove all the elements from array list
		
		ArrayList mylist2= new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements: "+mylist);
		
		// remove all the elements/ clear
		mylist.clear();
		System.out.println("Is Arraylist empty? "+mylist.isEmpty());// true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
