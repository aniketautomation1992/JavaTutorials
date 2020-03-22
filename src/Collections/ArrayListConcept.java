package Collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArayList class implements List interface
				ArrayList ar=new ArrayList();		// Creating the object of an ArrayList class
				ar.add(100);						// To add the values in an ArrayList
				ar.add(200);
				ar.add(300);
				System.out.println("The current size of an ArrayList is: "+ar.size());
				ar.add(400);
				ar.add(500);
				System.out.println("The current size of an ArrayList is: "+ar.size());
				ar.add("Peter");
				ar.add('A');
				ar.add(true);
				ar.add(12.33);
				System.out.println("The current size of an ArrayList is: "+ar.size());
				
				// To print all the values of ArrayList 
				for(int i=0; i<ar.size(); i++) {
					System.out.println(ar.get(i));
				}
						
				System.out.println(ar.get(5));		// To get the value of a particular index from ArrayList
				//System.out.println(ar.get(10));	// Here 10th index in not available so it throws an Exception: IndexOutOfBoundsException
				
				ar.remove(8);			// To remove the value of the specified index from ArrayList
				System.out.println("After removing the value of 8th index, the current size of an ArrayList is: "+ar.size());
				
				// generic vs non-generic -- generic means give restrictions to an object to add only specific type of values
				// To restrict the ArrayList for accepting only Integer values
				ArrayList<Integer> ar1=new ArrayList<Integer>();
				ar1.add(777);
				ar1.add(999);
				
				// To restrict the ArrayList for accepting only String values
				ArrayList<String> ar2=new ArrayList<String>();
				ar2.add("Aniket");
				ar2.add("11111");
				
				ArrayList<String> ar3=new ArrayList<String>();
				ar3.add("Pune");
				ar3.add("Mumbai");
				ar3.add("Nashik");
				
				ArrayList<String> ar4=new ArrayList<String>();
				ar4.add("Kolhapur");
				ar4.add("Nagpur");
				ar4.add("Solapur");
				
				System.out.println("---------- addAll ----------");
				ar3.addAll(ar4);					// It will add/copy all the values to ar3 from ar4
				System.out.println("---------- ar3 ----------");
				for(int i=0; i<ar3.size(); i++) {
					System.out.println(ar3.get(i));
				}
				System.out.println("---------- ar4 ----------");
				for(int i=0; i<ar4.size(); i++) {
					System.out.println(ar4.get(i));
				}
				
				System.out.println("---------- removeAll ----------");
				ar3.removeAll(ar4);					// It will remove all the values of a4 from ar3
				System.out.println("---------- ar3 ----------");
				for(int i=0; i<ar3.size(); i++) {
					System.out.println(ar3.get(i));
				}
				System.out.println("---------- ar4 ----------");
				for(int i=0; i<ar4.size(); i++) {
					System.out.println(ar4.get(i));
				}

				System.out.println("---------- retainAll ----------");
				ar3.retainAll(ar4);					// It will retain all the values of ar4 and removes all the values from ar3
				System.out.println("---------- ar3 ----------");
				for(int i=0; i<ar3.size(); i++) {
					System.out.println(ar3.get(i));
				}
				System.out.println("---------- ar4 ----------");
				for(int i=0; i<ar4.size(); i++) {
					System.out.println(ar4.get(i));
				}
	}
}