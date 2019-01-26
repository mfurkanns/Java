
package ders1;


public class Physic extends Math {
    
    private int lab;
    
    public Physic(int midterm1,int midterm2,int final_,int lab){
        super(midterm1,midterm2,final_);
        this.lab=lab;    
    }
    @Override
    public void showInfo(){        
        System.out.println("midterm-1 = "+getMidterm1());
        System.out.println("midterm-2 = "+getMidterm2());
        System.out.println("final = "+getFinal());
        System.out.println("lab = "+this.lab);
    }
    
    
    
    
}
