package ders1;

import java.util.ArrayList;

public class Arraylist {
    
    public static void main(String[] args) {
        
        ArrayList group = new ArrayList();
        
        group.add("a");
        group.add("b");
        group.add("c");
        group.add("d");
        
        for(int i=0;i<group.size();i++){
            System.out.println(i+".element = "+group.get(i));        
        }
        
        group.remove("a");
        group.remove(1);
        
        for(int i=0;i<group.size();i++){
            System.out.println(i+".element = "+group.get(i));        
        }
    }
}
