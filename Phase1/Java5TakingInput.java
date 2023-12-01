import java.util.Scanner;   //TAKING INPUT FROM USER

public class Java5TakingInput {

    public static void main(String[] args){
    //so in order to take an input from user we have to import one class
    //after importing the class we have to make an object of it.
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Age ");
    int age = sc.nextInt();
    System.out.println("Hey your age is "+age);

    //always try to close the scanner object after using it. Its a good practice.
    sc.close();
    }
    
}
