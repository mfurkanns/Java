
package ders1;


public class main {
    
    public static void main(String[] args) {
        
        Math mat1 = new Math(100,90,45);
        Physic fiz1 = new Physic(100,65,50,70);
        
        mat1.showInfo();
        fiz1.showInfo();
        fiz1.showLab(70);
    }
    
}
