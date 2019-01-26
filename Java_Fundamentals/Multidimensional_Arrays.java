
package ders1;

import java.util.Scanner;


public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int matrix[][],n,m;
        
        System.out.println("enter the number of rows :");
        n=scan.nextInt();
        System.out.println("enter the number of columns :");
        m=scan.nextInt();
        matrix= new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("matrix["+i+"]["+j+"]:");
                matrix[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");                
            }
            System.out.println("");
        }
    }
}
