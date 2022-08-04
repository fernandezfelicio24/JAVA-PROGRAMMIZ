package OOPII;

/*
An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).

We use the interface keyword to create an interface in Java


Implementing an Interface
Like abstract classes, we cannot create objects of interfaces.

To use an interface, other classes must implement it. We use the implements keyword to implement an interface.
 */


/*
Now that we know what interfaces are, let's learn about why interfaces are used in Java.

Similar to abstract classes, interfaces help us to achieve abstraction in Java.

Here, we know getArea() calculates the area of polygons but the way area is calculated is different for different polygons. Hence, the implementation of getArea() is independent of one another.
Interfaces provide specifications that a class (which implements it) must follow.

In our previous example, we have used getArea() as a specification inside the interface Polygon. This is like setting a rule that we should be able to get the area of every polygon.

Now any class that implements the Polygon interface must provide an implementation for the getArea() method.
Interfaces are also used to achieve multiple inheritance in Java. For example,
 */
interface Polygon {
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon{
    //implementation of abstract method

    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangel is " + (length * breadth));
    }
}

//===============================================================================

// create an interface
interface Language {
    void getName(String name);

}

//class implements interface
class ProgrammingLanguage implements  Language {

    //implementation of abstract method
    public void getName(String name){
        System.out.println("Programming Language : " + name);
    }
}



public class inference {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5,6);

        //==============================================

        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}
