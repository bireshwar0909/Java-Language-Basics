package Basics.Phase5;

import java.util.*;

public class Data5Queue {

    //In queues elements are stored in First in First Out manner. That is elements are added from behind and added from front.
    //Methods in Queue:
    //add()
    //remove()
    //element()
    //offer()
    //pull()
    //peak()


    public static void main(String[] args){

        Queue<Integer> s = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            s.add(i);
            
        }

        System.out.println(s);
        System.out.println();
        System.out.println("top element is " + s.peek());
        int x1 = s.remove();
        System.out.println("removed element is " + x1);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        Queue<Integer> s1 = new LinkedList<>();

        System.out.println("How many elements you want to entre to the Queue ");
        int x2 = sc.nextInt();
        System.out.println();

        for (int i = 0; i < x2; i++) {
            System.out.println("Entre element number " + (i+1));
            int x3 = sc.nextInt();
            s1.add(x3);
        }
        System.out.println();
        System.out.print("This is how your Queue looks like ");
        System.out.println(s1);
        System.out.println();

        System.out.println("You will have 3 oppurtunity if you want to do something more with your Queue or");
        System.out.println("you can press 4 to cancel and close the program or you can");
        System.out.println();
        System.out.println("Press 1 to add another element");
        System.out.println("Press 2 to add pop element out");
        System.out.println("Press 3 to have a peek on your Queue");
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
                System.out.print("New Queue looks like ");
                System.out.println(s1);
                System.out.println();
        } else if (x4 == 2) {
            int y = s1.remove();
            System.out.println("Deleted Element is " + y);
            System.out.print("New Queue looks like ");
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
