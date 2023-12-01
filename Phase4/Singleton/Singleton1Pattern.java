package Basics.Phase4.Singleton;

public class Singleton1Pattern {
    private Singleton1Pattern(){

    }

    public static Singleton1Pattern obj = new Singleton1Pattern();
    
    public static Singleton1Pattern getInstance(){
        return obj;

    }

    
}
