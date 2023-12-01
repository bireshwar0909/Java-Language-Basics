package Basics.Phase5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Data2LinkedList {

        //Methods of LinkedList-
        //add(element)
        //addAll(Collection)
        //get(index)
        //set(index, value)
        //remove(index)
        //removeAll()
        //clear()
        //size()
        //Contains()
        //isEmpty()
        //toArray()


    public static void main (String[] args){

        List<Integer> List1 = new LinkedList<>();
        List<Integer> List2 = new LinkedList<>();
        List<Integer> List3 = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            List1.add(i);
            
        }

        System.out.println();
        System.out.println(List1);

        int x = List1.get(1);
        System.out.println("The number in position 2 is- "+x);

        getTimeDiff(List2);
        getTimeDiff(List3);
        
        getTimeDiff1(List2);
        getTimeDiff1(List3);
    }

    static void getTimeDiff(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
            
        }

        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(list.getClass().getName());
        float q = (end-start);
        float q1 = (q/1000);
        System.out.println("time took for the loop " + q1 + " seconds");


        //After getting the results you will find that linkedList takes more time to add to array where arrayList doesnt
    }

    static void getTimeDiff1(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
            
        }

        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println(list.getClass().getName());
        float q2 = (end-start);
        float q3 = (q2/1000);
        System.out.println("time took for the loop " + q3 + " seconds");

        //After getting the results you will find that linkedlist takes less time than arraylist
    }
    
}
