
package oop;

import oop.car;


public class main1 {
    
    public static void main(String[] args) {
        
       car car1 = new car();
        
       car1.setColor("blue");
       car1.setEngine(2.0);
       car1.setModel("Renault Megane");
       
       System.out.println("car1's model  = "+car1.getModel());
       System.out.println("car1's color  = "+car1.getColor());
       System.out.println("car1's engine = "+car1.getEngine());
    }    
}
