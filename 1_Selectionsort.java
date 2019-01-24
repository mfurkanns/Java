package ders1;

import static ders1.Ders1.quicksort;
import java.util.Scanner;


public class Selectionsort {
    
    public static void selection(int dizi[],int n) {
        int i,j,min,minind=0,tmp;
        
        for(i=0;i<n;i++){
            min=dizi[i];
            for(j=i;j<n;j++){
                if(min>dizi[j]){
                    min=dizi[j];
                    minind=j;
                }
            }
            tmp=dizi[i];
            dizi[i]=dizi[minind];
            dizi[minind]=tmp;
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
        
        selection(a,n); 
        
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }   
    }
}
