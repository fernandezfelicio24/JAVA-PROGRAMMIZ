package OOPII;
/*
Why default methods?
Let's take a scenario to understand why default methods are introduced in Java.

Suppose, we need to add a new method in an interface.

We can add the method in our interface easily without implementation. However, that's not the end of the story. All our classes that implement that interface must provide an implementation for the method.

If a large number of classes were implementing this interface, we need to track all these classes and make changes to them. This is not only tedious but error-prone as well.

To resolve this, Java introduced default methods. Default methods are inherited like ordinary methods.

Let's take an example to have a better understanding of default methods.
 */

interface Polygon1{
    void getArea1();
    // default method
    default void getSides1() {
        System.out.println("I can get sides of a polygon");
    }

}


// implements the interface
class Rectangel1 implements Polygon1{
    @Override
    public void getArea1() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }

    //overrides the getsides()

    @Override
    public void getSides1() {
        System.out.println("I have 4 sides.");
    }
}

// implements  the interface
class Square implements Polygon1{
    @Override
    public void getArea1() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}


public class inference2 {
    public static void main(String[] args) {
        // create an object of Rectangle
        Rectangel1 r1 = new Rectangel1();
        r1.getArea1();
        r1.getSides1();

        //create an object of Square
        Square s1 = new Square();
        s1.getArea1();
        s1.getSides1();
    }
}
