
package ders1;

public class Math  {
    private int midterm1;
    private int midterm2;
    private int final_;
    
    public Math(int midterm1,int midterm2,int final_){
        
        this.midterm1=midterm1;
        this.midterm2=midterm2;
        this.final_=final_;    
    }
    public void showInfo(){        
        System.out.println("midterm-1 = "+this.midterm1);
        System.out.println("midterm-2 = "+this.midterm2);
        System.out.println("final = "+this.final_);
    }
    
}
