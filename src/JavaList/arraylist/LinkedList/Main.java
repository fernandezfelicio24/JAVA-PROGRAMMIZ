package JavaList.arraylist.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList : " + animals);

        System.out.println("================================");
        // add() method without the index parameter

        //add () method with the index parameter
        animals.add(1, "Lions");
        System.out.println("Updated LinkedList : " + animals);

        System.out.println("=================================");
        //get the element from the linked list
        String str = animals.get(1);
        System.out.println("Element at index 1 : " + str);

        System.out.println("==================================");
        //change elements at index 3

        animals.set(3, "Cowww");
        System.out.println("Updated LinkedList : " + animals);

        System.out.println("=====================================");
        //Remove element from a LinkedList
        animals.remove(3);
        System.out.println("Update LinkedList afterRemove : " + animals);
    }
}
