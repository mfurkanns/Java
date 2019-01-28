
package oop;


public class Male implements IPerson {

    @Override
    public void add() {
        System.out.println("Male added !");
    }

    @Override
    public void delete() {
        System.out.println("Male deleted !");       
    }
    
    @Override
    public void update() {
        System.out.println("Male updated !");
    }
}
