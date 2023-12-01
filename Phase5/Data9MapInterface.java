package Basics.Phase5;

import java.util.HashMap;
import java.util.Map;

public class Data9MapInterface {

    //In Java, elements of map are stored in key value pairs. Keys are unique values associated with individuals values.
    //A map cannot contain duplicate keys and each key is associated with single value.
    //We can access and modifies the values using the keys associated with values.

    //Methods of Map Interface
    //put(K,V)- Inserts the association of a key K and a value V into the Map. Iff the key is already present, the new value replaces
    //              the old value.
    //pullAll()- Inserts all the entries from the specified map to this map.
    //putIfAbsent(K,V)- Inserts the association of the key K is not already associated with value.
    //get(K)- Returns the value associated with the key. If not found, it returns null.
    //getOrDefault(K, defalutValue)- Returns the value associated with the key  K. If not found it returns the defaultValue.
    //ContainsKey(K)- Checks if the specified key K is present or not.
    //ConstainsValue(V)- Checks if the specified value V is present or not.
    //replace(K,V)- Replace the value of the key K with new specified value K. 
    //replace(K, oldValue, newValue)- replaces the value of k with a new one.
    //remove(K)- removes the entry from the map represented by the key K
    //remove(K,V)- removes the entry from the map represented by the key K associated with the value V
    //keySet()- returns a set of all the keys present in a map
    //values()- returns the set of all the values present in a set
    //entrySet()- returns the set of all the key/value mapping present in a map
    
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            map.put(cars[i], i+1);
            
        }
        for (int i = 0; i < cars.length; i++) {
            int x = i+1;
            String y = cars[i];

            System.out.println("the value "+ x +" is associated with the key " + y);            
        }


    }
}
