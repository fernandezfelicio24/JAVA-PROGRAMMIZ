package OOPIII.JavaAnonymousClass.Example2;
/*
Anonymous Class Implementing an Interface

 */

interface Polygon{
    public void display();
}

class AnonymousDemo {
    public void createClass(){

        // anonymous class implementing interface
        Polygon p1 = new Polygon() {
            @Override
            public void display() {
                System.out.println("Inside an anonymous class");
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
