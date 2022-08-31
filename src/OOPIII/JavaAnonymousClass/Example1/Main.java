package OOPIII.JavaAnonymousClass.Example1;

/*
 In Java, a class can contain another class known as nested class.
 It's possible to create a nested class without giving any name.

A nested class that doesn't have any name is known as an anonymous class.

An anonymous class must be defined inside another class. Hence, it is also known as an anonymous inner class.
Anonymous classes usually extend subclasses or implement interfaces.

Here, Type can be

a superclass that an anonymous class extends
an interface that an anonymous class implements
The above code creates an object, object1, of an anonymous class at runtime.

Note: Anonymous classes are defined inside an expression.
So, the semicolon is used at the end of anonymous classes to indicate the end of the expression.
 */

class Polygon {
    public void display(){
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousDemo {
    public void createClass(){
        //creation of anonymous class extending class Polygon
        Polygon p1 = new Polygon(){
            @Override
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}
public class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}

/*
In the above example, we have created a class Polygon.
 It has a single method display().

We then created an anonymous class that extends the class Polygon and overrides the display() method.

When we run the program, an object p1 of the anonymous class is created.
The object then calls the display() method of the anonymous class.
 */