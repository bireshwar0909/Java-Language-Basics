package Basics.Phase4.Polymorphism;

public class MainClass {
    public static void main(String[] args) {

        Dog d = new Dog();
        Pet p = d;
        Animal a = d;

        d.walk();                       //methods overwrite
        p.walk();
        a.walk();
        

        greeting();
        greeting("Hello");

        System.out.println(d.name);         //but variables do not
        System.out.println(p.name);


    }

    public static void greeting(){
        System.out.println("Hello there!");
    }
    
    public static void greeting(String s){
        System.out.println(s);
    }
}


