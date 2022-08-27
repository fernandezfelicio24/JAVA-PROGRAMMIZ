package NestedAndInnerClass.Example1;

/*
Non-Static Nested Class (Inner Class)
A non-static nested class is a class within another class. It has access to members of the enclosing class (outer class). It is commonly known as inner class.

Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class.

Here's an example of how you can declare inner classes in Java.
 */
public class CPU {

    double price;

    //nested class

    class Processor {

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class

    protected class RAM {

        //members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }

}


