package dene;

import java.util.*;

public class Example {
	
	public static void main(String[] args) {
		
		int num,ran;
		int[] arr;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("enter the number of elements = ");
		num = scan.nextInt();
		arr = new int[num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+".element =");
			arr[i]=scan.nextInt();
		}
		
		System.out.println(arr[rand.nextInt(num)]);
	}
}
