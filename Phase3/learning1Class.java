package Basics.Phase3;

class Cat {
    boolean hasFlur;
    String Color, Breed;
    int legs, eyes, ears;

    //class function
    public void walk(){
        System.out.println("Cat is Walking!");
    }
    public void eat() {
        System.out.println("The cat is eating");   
    } 
    public void description(){
        System.out.println("My cat has " + legs + " legs" + " and has " + eyes + " eyes");
    }
}

public class learning1Class {   
                                                                           
    public static void main(String[] args){   

        Cat cat1 = new Cat();                                                   //how to create object of a class?
        Cat cat2 = new Cat();                                                   //className objectName = new className();                                                                                                       

        cat1.hasFlur = true;
        cat1.Color = "Black";
        cat1.Breed = "Persian";
        cat1.legs = 4;
        cat1.eyes = 2;
        cat1.ears = 2;
        
        cat1.walk();
        cat1.eat();
        cat1.description();

        cat2.eat();
        cat2.description();

        cat2.legs = 4;
        cat2.eyes = 2;
        cat2.description();
    }
    
}


