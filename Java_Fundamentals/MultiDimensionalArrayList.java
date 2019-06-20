package oop2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
	
	
	static {
		System.out.println("Multidimensional ArrayList\n---------------------------");
	}
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList<ArrayList<Integer>> multiArrList = new ArrayList<ArrayList<Integer>>();
		
		
		
		
		// one space allowed for the 0th row
		multiArrList.add(new ArrayList<Integer>());
		multiArrList.add(new ArrayList<Integer>());
		multiArrList.add(new ArrayList<Integer>());
		multiArrList.add(new ArrayList<Integer>());
		multiArrList.add(new ArrayList<Integer>());
		
		// Adding 5 to the 0th row. x(0,0); 
		multiArrList.get(0).add(0,5);
		multiArrList.get(0).add(1,3);
		multiArrList.get(1).add(0,5);
		multiArrList.get(1).add(1,12);
		multiArrList.get(1).add(2,13);
		multiArrList.get(3).add(0,2);
		multiArrList.get(3).add(1,2);
		
		
		System.out.println(multiArrList);
		
		multiArrList.get(0);
		
		
		
		ArrayList<ArrayList<String>> multi = new ArrayList<ArrayList<String>>();
		
		
		multi.add(new ArrayList<String>());
		multi.add(new ArrayList<String>());
		multi.add(new ArrayList<String>());
		multi.add(new ArrayList<String>());
		multi.add(new ArrayList<String>());
		
		multi.get(0).add(0,"First");
		multi.get(0).add(1,"Second");
		multi.get(0).add(2,"Third");
		multi.get(4).add(0,"Apple");
		multi.get(4).add(1,"Banana");
		multi.get(2).add(0,"Java");
		
		System.out.println(multi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
