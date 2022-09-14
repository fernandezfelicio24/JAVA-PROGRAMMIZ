package Map.JavaHashMap.Example1;

import com.sun.xml.internal.txw2.IllegalAnnotationException;

import java.util.HashMap;
/*
The HashMap class of the Java collections framework provides the functionality of the hash table data structure.

It stores elements in key/value pairs. Here, keys are unique identifiers used to associate each value on a map.

The HashMap class implements the Map interface.

Create a HashMap
In order to create a hash map, we must import the java.util.HashMap package first.
 Once we import the package, here is how we can create hashmaps in Java.

// hashMap creation with 8 capacity and 0.6 load factor
HashMap<K, V> numbers = new HashMap<>();
In the above code, we have created a hashmap named numbers. Here, K represents the key type and V represents the type of values.
 */
public class Main {
    public static void main(String[] args) {

        // create a hashmap
        HashMap<Integer, String> languages = new HashMap<>();

        //initial Hashmap
        System.out.println("Initial Hashmap" + languages);
        System.out.println("==============================");

        // add elements to hashmap
        languages.put(1,"Java");
        languages.put(3, "Javascript");
        languages.put(2, "Pyhton");
        System.out.println("HashMap : " + languages);
        System.out.println("================================");

        // get () method to get value
        //Integer value = Integer.valueOf(1);
        String value = languages.get(3);
        System.out.println("Value at index 2 : " + value);
        System.out.println("=================================");

        System.out.println("Hashmap : " + languages);

        //return set view of keys
        // using keySet()
        System.out.println("KEys : " + languages.keySet());


        //return set view of values
        //using values()
        System.out.println("Values : " + languages.values());

        //return ser view of key/value pairs
        //using enrtySet()
        System.out.println("Key/Value mappings : " + languages);

        System.out.println("===================================");
        //change element with key 2

        
    }
}
