package Basics.Phase5;

import java.util.PriorityQueue;

public class Data7PriorityQueue {
    
    //A priorityQueue is a special type of queue in which each element is associated with a priority and served according to its priority.
    //If element with the same priority occurs than they are served according to their order in the queue.


    public static void main(String[] args) {

        PriorityQueue <String> pq = new PriorityQueue<>();

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            pq.add(cars[i]);
        }
        System.out.println(pq);
        System.out.println();

        pq.add("Kiwi");
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Mango");
        System.out.println(pq);
        System.out.println();

        for (int i = 0; i < 3; i++) {
            pq.remove();
            System.out.println(pq);
        }
    }
        

    
}
