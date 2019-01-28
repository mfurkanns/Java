
package ders1;

public class Math  {
    private int midterm1;
    private int midterm2;
    private int final_;
    
    public void setMidterm1(int midterm1){
        this.midterm1=midterm1;        
    }
    public int getMidterm1(){
        return this.midterm1;
    }
    public void setMidterm2(int midterm2){
        this.midterm2=midterm2;        
    }
    public int getMidterm2(){
        return this.midterm2;
    }
    public void setFinal(int final_){
        this.final_=final_;        
    }
    public int getFinal(){
        return this.final_;
    }
    
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
