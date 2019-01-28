
package oop;


public class Female implements IPerson {

    @Override
    public void add() {
        System.out.println("Female added !");        
    }

    @Override
    public void delete() {
        System.out.println("Female deleted !");
    }

    @Override
    public void update() {
        System.out.println("Female updated !");
    }
}
