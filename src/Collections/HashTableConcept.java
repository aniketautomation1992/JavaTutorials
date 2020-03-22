package Collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable ht=new Hashtable();			// To create the object of HashTable class.
		ht.put("A", "Test");					// To put the values in HashTable class.
		ht.put("B", "Hello");					// The datatype for the values is Object so, we can add any type of value; 
		ht.put("C", "World");					// Values can be like integer, string, char, double, boolean etc.
		System.out.println("The current size of the HashTable is: "+ht.size());
		System.out.println(ht.get("B"));		// To get the value of a particular key.
		
		ht.put(1, 100);
		ht.put(2, 200);
		ht.put(3, 300);
		System.out.println("The current size of the HashTable is: "+ht.size());
		System.out.println(ht.get(1));			// To get the value of 1st key.
		
		ht.put(1, "Aniket");
		ht.put(1, "Selenium");
		System.out.println(ht.get(1));
		
		// To restrict the HashTable only for accepting Key & Value as Integer
		Hashtable<Integer, Integer> ht1=new Hashtable<Integer, Integer>();
		ht1.put(1, 121);
		
		// To restrict the HashTable only for accepting Key as Integer & Value as String
		Hashtable<Integer, String> ht2=new Hashtable<Integer, String>();
		ht2.put(1, "Java");
	}
}