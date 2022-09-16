package Map.JavaLinkedHashMap.Example1;
import java.util.LinkedHashMap;
/*
In order to create a linked hashmap, we must import the java.util.LinkedHashMap package first.
Once we import the package, here is how we can create linked hashmaps in Java.
// LinkedHashMap with initial capacity 8 and load factor 0.6
LinkedHashMap<Key, Value> numbers = new LinkedHashMap<>(8, 0.6f);

Insert Elements to LinkedHashMap
put() - inserts the specified key/value mapping to the map
putAll() - inserts all the entries from the specified map to this map
putIfAbsent() - inserts the specified key/value mapping to the map if the specified key is not present in the map

 */
public class Main {
    public static void main(String[] args) {

        // Creating a LinkedHashMap of even numbers
        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1 : " + evenNumbers);

        // creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
        numbers.put("Three", 3);
        System.out.println("LinkedHashMap2 " + numbers);
        System.out.println("==============================================");

        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        System.out.println("Update LinkedHasMap () :" + evenNumbers);
        System.out.println("===============================================");


        //Creating LinkedHashMap of Numbers
        numbers.put("One", 1);


        // Using putAll()
        numbers.putAll(evenNumbers);
        System.out.println("New LinkedHashMap: " + numbers);



    }
}
