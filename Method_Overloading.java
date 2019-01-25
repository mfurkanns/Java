package ders1;


public class overloading {
    
    public static void say_hi(){
        System.out.println("Hello !");
    }
    public static void say_hi(String name){
        System.out.println("Hello "+name+" !");
    }
    public static void say_hi(String name,String title){
        System.out.println("Hello "+title+" "+name+" !");
    }
    
    public static void main(String[] args) {
        say_hi();
        say_hi("Jack");
        say_hi("Jack","Doctor");
    }
}
