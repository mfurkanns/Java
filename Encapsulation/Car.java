
package oop;


public class car {
    
    private String color;
    private String model;
    private double engine;
    
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;
    }
    public void setEngine(double engine){
        if(engine<3){
            this.engine=engine;
        }
        else{
            System.out.println("engine size have to be greater and equal than 3 !");
        }       
    }
    public double getEngine(){
        return this.engine;
    }
}
