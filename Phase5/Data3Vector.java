package Basics.Phase5;

import java.util.Vector;

public class Data3Vector {

    //The vector class an implementation of the List interface that allows us to create resizable arrays similar to the arrayList class.
    //In java both arraylist and vector implements the list interface and provides the same functionalities.
    //However there exist some diffferences between them. The vector class synchronizes each individual operation. This means when
    //  we want to perform some operations on vectors, the vector class automatically applies a lock to that operation. However, in arraylist
    //  methods are not synchronised.
    //  ArrayList are more efficient than vectors!
    

    public static void main(String[] args){

        Vector<Integer> v = new Vector<>();
        v.add(23);
        v.add(14);
        System.out.println(v);



    }

    
}
