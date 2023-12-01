package Basics.Phase5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Data1ArrayList {

        //Methods of ArrayList-
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

        //Creating an arrayList-
        //ArrayList<Type> arrayList = new ArrayList<>();
        //and if you dont define type it will be a mixed array!
        
        // ArrayList fruits = new ArrayList<>();
        // fruits.add("Apple");
        // fruits.add(23);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        

        List<String> veges = new LinkedList<>();
        veges.add("potato");
        veges.add("carrot");

        System.out.println(fruits);
        System.out.println(veges);

        fruits.addAll(veges);
        System.out.println();
        System.out.println(fruits);

        fruits.set(1, "Banana");
        System.out.println(fruits);

    }
    
}

