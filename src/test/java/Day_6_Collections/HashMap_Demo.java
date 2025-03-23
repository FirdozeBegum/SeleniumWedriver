package Day_6_Collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap_Demo {

	public static void main(String[] args) {
		//Declaration
		//HashMap hm = new HashMap();
		//Map hm= new HashMap();
		
		HashMap <Integer, String>hm=new HashMap<Integer, String>();

		// adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Marty");
		hm.put(104, "Scott");
		hm.put(102, "David");
		System.out.println(hm);
		// size of HashMap
		
		System.out.println("Size of an HashMap "+hm.size());
		
		// remove pair
		hm.remove(103); // key of the pair
		System.out.println("After removing pair"+hm);
		// access value of the key
		hm.get(102); // 102 is key
		System.out.println(hm.get(102));
		
		// get all the keys from Hashmap
		System.out.println(hm.keySet());//[101, 102, 104]
		System.out.println(hm.values());//[John, David, Scott]
		System.out.println(hm.entrySet());//[101=John, 102=David, 104=Scott]
		
		// reading data from hashmap
		// using for...each 
	/*for(int k:hm.keySet())
	{
	System.out.println(k+"      "+hm.get(k));	
	}*/
		// using Iterator
	Iterator<Entry<Integer,String>> it=	hm.entrySet().iterator();
		
		while(it.hasNext()) {
		Entry <Integer,String>	entry=it.next();
		System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());//true
		
		
		
		
	}

}
