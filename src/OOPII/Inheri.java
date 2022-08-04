package OOPII;

/*
Inheritance is one of the key features of OOP that allows us to create a new class
 from an existing class.

The new class that is created is known as subclass (child or derived class)
and the existing class from where the child class is derived is known as superclass (parent or base class).

The extends keyword is used to perform inheritance in Java.

*/

/*
is-a relationship
In Java, inheritance is an is-a relationship. That is, we use inheritance only if there exists an is-a relationship between two classes. For example,

Car is a Vehicle
Orange is a Fruit
Surgeon is a Doctor
Dog is an Animal
 */

class Animal {

    //field and method of the parrent class

    String name;

    public void eat(){
        System.out.println("I can eat");
    }

}

//inherit from Animal
class Dog extends Animal {
    // new method in subclass
    public void display(){
        System.out.println("My name is " + name);
    }

}

public class Inheri {

    public static void main(String[] args) {
        // create an object of the subclass
        Dog labrador = new Dog();

        //access field fo superclass
        labrador.name = "Rohu";
        labrador.display();

        //call method of superclass
        //using object of subclass
        labrador.eat();
    }
}
