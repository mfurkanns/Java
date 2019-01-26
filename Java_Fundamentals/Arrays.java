
package ders1;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int array[],n;
        
        System.out.println("Enter the number of elements");
        n=scan.nextInt();
        array =new int[n];
        for(int i=0;i<n;i++){
            System.out.println(i+".element :");
            array[i]=scan.nextInt();
        }
        for(int i:array){
            System.out.println("element : "+i);
        }
    }
}
