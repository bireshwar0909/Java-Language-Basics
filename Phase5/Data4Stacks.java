package Basics.Phase5;

import java.util.Scanner;
import java.util.Stack;

public class Data4Stacks {

    //In stack, elements are stored and accessed in "last in first out" manner. That is elements are added to the top if the stack 
    //  and removed from the top of the stack
    // Stacks extends Vectors and Vectors implements Lists and Lists extends Collection

    //Methods of Stacks:
    //push(e)
    //pop()
    //peek()
    //search(e)
    //empty()

    
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < 10; i++) {
            s.push(i);
            
        }

        System.out.println(s);
        System.out.println();
        System.out.println("top element is " + s.peek());
        int x1 = s.pop();
        System.out.println("removed element is " + x1);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Stack<Integer> s1 = new Stack<>();

        System.out.println("How many elements you want to entre to the stack ");
        int x2 = sc.nextInt();
        System.out.println();

        for (int i = 0; i < x2; i++) {
            System.out.println("Entre element number " + (i+1));
            int x3 = sc.nextInt();
            s1.push(x3);
        }
        System.out.println();
        System.out.print("This is how your Stack looks like ");
        System.out.println(s1);
        System.out.println();

        System.out.println("You will have 3 oppurtunity if you want to do something more with your stack or");
        System.out.println("you can press 4 to cancel and close the program or you can");
        System.out.println();
        System.out.println("Press 1 to add another element");
        System.out.println("Press 2 to add pop element out");
        System.out.println("Press 3 to have a peek on your stack");
        System.out.println();

        for (int i = 0; i < 3; i++) {

            while (i == 1) {
                System.out.println(i + " oppurtunities remaining");
                break;
            }

            while (i==2) {
                System.out.println(i-2 + " oppurtunities remaining");
                break;
            }

            int x4 = sc.nextInt();

            if (x4 == 1){
                System.out.println("Entre new element");
                int x5 = sc.nextInt();
                s1.add(x5);
                System.out.print("New stack looks like ");
                System.out.println(s1);
                System.out.println();
        } else if (x4 == 2) {
            int y = s1.pop();
            System.out.println("Deleted Element is " + y);
            System.out.print("New stack looks like ");
            System.out.println(s1);
            System.out.println();
        } else if (x4 == 3) {
            System.out.println("Top element" + s1.peek());
            System.out.println();
        } else if (x4 == 4) {
            break;
        } else {
            System.out.println("Wrong input");
            System.out.println("Press 1 to have another try");
            System.out.println("Press 0 to end");
            int xx = sc.nextInt();
            if (xx == 1){
                continue;
            } else {
                System.out.println("0 or different key entered");
                break;
            }
        }
            
        }
    sc.close();
    }
    
}
