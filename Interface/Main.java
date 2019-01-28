
package oop;

class personmanager{
    
    public void addp(IPerson per){
        per.add();
    }
    public void deletep(IPerson per){
        per.delete();
    }
    public void updatep(IPerson per){
        per.update();
    }
}


public class Main {
    public static void main(String[] args) {
        
        personmanager pm1 = new personmanager();
        IPerson male1 = new Male();
        IPerson female1 = new Female(); 
       
        pm1.addp(male1);
        pm1.deletep(male1);
        pm1.updatep(male1);
        
        pm1.addp(female1);
        pm1.deletep(female1);
        pm1.updatep(female1);
                
    }
}
