package JavaList.arraylist.Example1;


/*
Creating an ArrayList
Before using ArrayList, we need to import the java.util.ArrayList package first.
Here is how we can create arraylists in Java:

ArrayList<Type> arrayList= new ArrayList<>();

ere, Type indicates the type of an arraylist. For example,

// create Integer type arraylist
ArrayList<Integer> arrayList = new ArrayList<>();

// create String type arraylist
ArrayList<String> arrayList = new ArrayList<>();

In the above program, we have used Integer not int.
It is because we cannot use primitive types while creating an arraylist.
Instead, we have to use the corresponding wrapper classes.

Here, Integer is the corresponding wrapper class of int. To learn more, visit the Java wrapper class.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // create  ArrayList
        ArrayList<String> languages = new ArrayList<>();

        //Add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("Swift");
        System.out.println("ArrayList : " + languages);

        //add() method without the index parameter

        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Fortran");
        System.out.println("=============================");
        System.out.println("ArrayList : " + languages);

        //get the element from the arrayList
        String str = languages.get(2);
        System.out.println("Get the element of the array List : ");
        System.out.println("Element at index 1 : " + str);

        System.out.println("====================================");
        // change the element of the array lIst
        System.out.println("Change the element of the array list :");
        languages.set(2, "Swifter");
        System.out.println("Modified ArrayList : "  + languages);


        System.out.println("=====================================");
        // remove the element from index 2
        String removelanguage = languages.remove(5);
        System.out.println("Updated ArrayList : " + languages);
        System.out.println("Romeved Element : " + removelanguage);


        System.out.println("======================================");
        // iterate using for-each loop
        System.out.println("Iterate using for each loop");
        System.out.println("Accessing individual elements : ");

        for (String language : languages ){
            System.out.println(language);
            System.out.println(", ");
        }
    }


}
