package ders1;

import java.util.Scanner;



public class Ders1 {
    
    public static void quicksort(int dizi[],int p,int r){
        int q;
        if(p<r){            
            q=partition(dizi,p,r);
            quicksort(dizi,p,q-1);
            quicksort(dizi,q+1,r);        
        }     
    }
    
    public static int partition(int dizi[],int p,int r) {
        
        int x=dizi[r],i=p-1,j,tmp;
        
        for(j=p;j<=r-1;j++){
        
            if(x>=dizi[j]){
                
                i++;
                tmp=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=tmp;
            }
        }
        tmp=dizi[i+1];
        dizi[i+1]=dizi[r];
        dizi[r]=tmp;
        
        return i+1;
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
        
        quicksort(a,0,n-1);        
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }        
    }    
}
