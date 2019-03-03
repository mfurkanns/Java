package genel;

import java.util.*;

public class LinkedList_JAVA {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		
		System.out.println(list);
		
		String a = list.get(2);
		
		list.remove(2);
		System.out.println(list+" = "+a);
		
		list.remove("first");
		System.out.println(list);
		
		list.set(1, "added");
		System.out.println(list);
		
		boolean x = list.contains("added");
		if(x) 
			System.out.println("list contains the element \"added\"");
			
		list.addFirst("add_first");
		list.addLast("add_last");
		System.out.println(list);
		
		
	}
	
}
