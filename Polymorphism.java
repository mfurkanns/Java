package polymorphism;

class player{
    private int number;
    
    public int getNumber(){
        return this.number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public player(int number){
        this.number=number;  
    }
    public void showNumber(){
        System.out.println("Player number "+this.number+" is running...");
    }
}

class goalkeeper extends player{

    public goalkeeper(int number) {
        super(number);
    }
    
    @Override
    public void showNumber(){
        System.out.println("Goalkeeper number "+getNumber()+" is not running...");
    }
}

class middlefield extends player{

    public middlefield(int number) {
        super(number);
    }
    
    @Override
    public void showNumber(){
        System.out.println("M.field player number "+getNumber()+" gave brilliant pass...");
    }
}

public class Polymorphism {
    
    public static void show(player pla){
       pla.showNumber();
    }
    
    public static void main(String[] args) {
        
        player p1 = new player(12);
        player p2 = new goalkeeper(23);
        player p3 = new middlefield(10);
        middlefield p4 = new middlefield(8);
        
        p1.showNumber();
        p2.showNumber();
        p3.showNumber();
        p4.showNumber();
        show(p1);
        show(p2);
        show(p3);
        show(p4);
        
        show(new goalkeeper(22));
        show(new middlefield(99));
        
    }
}
