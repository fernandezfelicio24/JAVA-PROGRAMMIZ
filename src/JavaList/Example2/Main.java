package JavaList.Example2;

import java.util.List;
import java.util.ArrayList;
/*
Implementation of Array List
 */
public class Main {
    public static void main(String[] args) {
        // Creating list using the ArrayList class
        List<Integer> numbers = new ArrayList<>();


        //Add elements to the list
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        System.out.println("LIst : " + numbers);

        // Access element from the list
        int number = numbers.get(0);
        System.out.println("Accessed Element : " + number);

        // Remove element from the list
        int removeNumber = numbers.remove(2);
        System.out.println("Remove Element : " + removeNumber);
    }
}
