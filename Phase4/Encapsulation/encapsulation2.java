package Basics.Phase4.Encapsulation;               //learing about getter and setters!!!

public class encapsulation2 {

    private String name;
    private int age;

    public void setAge(int age) {
        if (age > 18){
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not eligible");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String theName){
        this.name = theName;
    }

    public String getName(){
        return name;
    }

    
}
