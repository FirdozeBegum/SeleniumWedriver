package Day_6_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Demo {

	public static void main(String[] args) {
		// declaration
		HashSet myset = new HashSet();
		// Set myset= new HashSet();
		// HashSet<String> myset= new HashSet<String>();
		// adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('a');
		myset.add(true);
		myset.add(null);
		myset.add(null);
		System.out.println(myset);// [null, a, 100, 10.5, welcome, true]-->insertion oder is not preserved
		// size of hashset
		System.out.println("Size of HashSet " + myset.size());
		// removing element
		myset.remove(10.5);

		System.out.println("After removing:" + myset);

		// inserting elements -- not possible

		// Access specific element

		// convert HashSet--> ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));

		// Read all the elements using enhanced loop (for...each)
		/*
		 * for(Object x:myset) { System.out.println(x); }
		 */

		// using iterator
		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// clearing all the elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty());

	}

}
