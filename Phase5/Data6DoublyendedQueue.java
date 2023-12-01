package Basics.Phase5;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Data6DoublyendedQueue {

    //Here we are going to learn about doubly ended queue which allows us to add or pop from both sides of the queue.
    //An arrayDeque also known as array doubly ended queue is a special type of growable array that allows us to add or remove element
    //from both sides. An arrayDeque implementation can be done as Stack or a Queue.

    //Operation               //Methods           //Throwing Exception
    //Intersion from head -->   offerFirst(e)       addFirst(e)
    //Removal from head -->     pollFirst()         removeFirst()
    //Retrival from head -->    peekFirst()         getFirst()
    //Insertion from Tail -->   offerLast(e)        addLast(e)
    //Removal from Tail -->     pollLast()          removeLast()
    //Retrival from Tail -->    peekLast()          getLast()         

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        System.out.println("We are going to add elements from first");
        for (int i = 0; i < 10; i=i+2) {
            ad.offerFirst(i);
            
        }
        System.out.print("This is how your array looks like ");
        System.out.println(ad);
        System.out.println();

        
        System.out.println("Now we are going to add elements from last");
        for (int i = 0; i < 10; i=i+2) {
            ad1.offerLast(i);
            
        }
        System.out.print("This is how your array looks like ");
        System.out.println(ad1);
        System.out.println();

//------------------------------------------------------------------------------------------

        System.out.println("Press 1 to edit array 1");
        System.out.println("Press 2 to edit array 2");
        System.out.println();

        int x = sc.nextInt();

        if (x==1){
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.println(ad);
                System.out.println("Press 1 to insert element");
                System.out.println("Press 2 to remove element");
                System.out.println("Press 3 to peek element");

                int x1 = sc.nextInt();
                System.out.println();

                if (x1==1) {
                    System.out.println("Press 1 to insert from head");
                    System.out.println("Press 2 to insert from tail");

                    int x1a = sc.nextInt();

                    if (x1a == 1) {
                        System.out.println();
                        System.out.println("How many elements do you want to enter");
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            System.out.println("Enter your element");
                            int x1aUSER = sc.nextInt();
                            ad.addFirst(x1aUSER);
                        }
                        System.out.println("New array looks like " + (ad));
                    }
                    else if (x1a == 2) {
                        System.out.println();
                        System.out.println("How many elements do you want to enter");
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            System.out.println("Enter your element");
                            int x1aUSER = sc.nextInt();
                            ad.addLast(x1aUSER); 
                        } 
                        System.out.println("New array looks like " + (ad));
                    }else {
                        System.out.println();
                        System.out.println("Different key entered!");
                    }

                } else if (x1 == 2) {
                    System.out.println("Press 1 to remove from head");
                    System.out.println("Press 2 to remove from tail");

                    int x1a = sc.nextInt();

                    if (x1a == 1) {
                        System.out.println();
                        System.out.println("How many elements do you want to remove");
                        System.out.println("input must be less than " + ad.size());
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            ad.pollFirst();
                        }
                        System.out.println("New array looks like " + (ad));
                    }
                    else if (x1a == 2) {
                        System.out.println();
                        System.out.println("How many elements do you want to remove");
                        System.out.println("input must be less than " + ad.size());
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            ad.pollLast();
                        }
                        System.out.println("New array looks like " + (ad));
                    }else {
                        System.out.println();
                        System.out.println("Different key entered!");
                    }
                } else if (x1 == 3) {
                    System.out.println("Press 1 to peek from head");
                    System.out.println("Press 2 to peek from tail");

                    int x1a = sc.nextInt();

                    if (x1a == 1) {
                        System.out.println(ad.peekFirst());
                    }
                    else if (x1a == 2) {
                        System.out.println(ad.peekLast());
                    }else {
                        System.out.println();
                        System.out.println("Different key entered!");
                    }

            }
                System.out.println();
                System.out.println("Want to check again?");
                System.out.println("Type 1 to edit, type 0 to cancel");
                int y = sc.nextInt();
                if (y == 1) continue;
                else if (y == 0) break;
                else {
                    System.out.println("different key entered");
                    break;
                }
        }
            
//---------------------------------------------------------------------------------------------------------------

        } else if (x==2) {
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.println("Now we will implement actions on array 2");
                System.out.println(ad);
                System.out.println("Press 1 to insert element");
                System.out.println("Press 2 to remove element");
                System.out.println("Press 3 to peek element");
    
                int x1 = sc.nextInt();
                System.out.println();
    
                if (x1==1) {
                    System.out.println("Press 1 to insert from head");
                    System.out.println("Press 2 to insert from tail");
    
                    int x1a = sc.nextInt();
    
                    if (x1a == 1) {
                        System.out.println();
                        System.out.println("How many elements do you want to enter");
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            System.out.println("Enter your element");
                            int x1aUSER = sc.nextInt();
                            ad1.addFirst(x1aUSER);
                        }
                        System.out.println("New array looks like " + (ad1));
                    }
                    else if (x1a == 2) {
                        System.out.println();
                        System.out.println("How many elements do you want to enter");
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            System.out.println("Enter your element");
                            int x1aUSER = sc.nextInt();
                            ad1.addLast(x1aUSER); 
                        } 
                        System.out.println("New array looks like " + (ad1));
                    }else {
                        System.out.println();
                        System.out.println("Different key entered!");
                    }
    
                } else if (x1 == 2) {
                    System.out.println("Press 1 to remove from head");
                    System.out.println("Press 2 to remove from tail");
    
                    int x1a = sc.nextInt();
    
                    if (x1a == 1) {
                        System.out.println();
                        System.out.println("How many elements do you want to remove");
                        System.out.println("input must be less than " + ad1.size());
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            ad1.pollFirst();
                        }
                        System.out.println("New array looks like " + (ad1));
                    }
                    else if (x1a == 2) {
                        System.out.println();
                        System.out.println("How many elements do you want to remove");
                        System.out.println("input must be less than " + ad1.size());
                        int element = sc.nextInt();
                        System.out.println();
                        for (int i = 0; i < element; i++) {
                            ad1.pollLast();
                        }
                        System.out.println("New array looks like " + (ad1));
                    }else {
                        System.out.println();
                        System.out.println("Different key entered!");
                    }
                } else if (x1 == 3) {
                    System.out.println("Press 1 to peek from head");
                    System.out.println("Press 2 to peek from tail");
    
                    int x1a = sc.nextInt();
    
                    if (x1a == 1) {
                        System.out.println(ad1.peekFirst());
                    }
                    else if (x1a == 2) {
                        System.out.println(ad1.peekLast());
                    }else {
                        System.out.println();
                        System.out.println("Different key entered!");
                    }
    
                }
                    System.out.println();
                    System.out.println("Want to check again?");
                    System.out.println("Type 1 to edit, type 0 to cancel");
                    int y = sc.nextInt();
                    if (y == 1) continue;
                    else if (y == 0) break;
                    else {
                        System.out.println("different key entered");
                        break;
                    }
            }
        } else {
            System.out.println("Different key entered");
        }
    
        sc.close();
    }   
    
}