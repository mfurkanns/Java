
package oop;

import oop.car;


public class main1 {
    
    public static void main(String[] args) {
        
       car car1 = new car("blue",3.0,"opel");
       car car2 = new car();
      /* car1.setColor("blue");
       car1.setEngine(3.0);
       car1.setModel("Renault Megane");*/
       
       car1.showInfo();
       car2.showInfo();
       
    }    
}
