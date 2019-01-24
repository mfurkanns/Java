package ders1;

import java.util.Scanner;

public class Bubblesort {
    
    public static void bubble(int dizi[],int n) {
        int i,j,tmp;
        
        for(i=0;i<n;i++){
            for(j=0;j<n-1;j++){
                if(dizi[i]>dizi[j]){
                    tmp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=tmp;
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        int a[],i,n;
        Scanner scan =new Scanner(System.in);
        
        System.out.println("enter the number of elements array");
        n=scan.nextInt();
        a= new int[n];
        
        for(i=0;i<n;i++){
            System.out.println("a["+i+"] = ");
            a[i]=scan.nextInt();            
        }
        
        bubble(a,n);
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
