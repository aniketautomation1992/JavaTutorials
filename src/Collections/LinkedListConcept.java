package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");
		System.out.println("Contents of LinkedList: "+ll);
		
		ll.addFirst("Navin");
		ll.addLast("Automation");
		System.out.println("Contents of LinkedList: "+ll);
		
		System.out.println(ll.get(2));
		
		ll.set(1, "Aniket");
		System.out.println(ll.get(1));
		System.out.println("Contents of LinkedList: "+ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList: "+ll);
		
		ll.remove(2);
		System.out.println("Contents of LinkedList: "+ll);
		
		// How to print all the values of LinkedList
		
		System.out.println("-----using for loop-----");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		System.out.println();
		System.out.println("-----using advanced for loop-----");
		for(String str:ll) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("-----using iterator-----");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("-----using while loop-----");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}
}