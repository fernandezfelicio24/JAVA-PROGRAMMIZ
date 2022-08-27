package NestedAndInnerClass.Example4;

//This code is error

class MotherBoard {
    String model;
    public MotherBoard(String model) {
        this.model = model;
    }

    // static nested class
    static class USB{
        int usb2 = 2;
        int usb3 = 1;
        int getTotalPorts(){
            // accessing the variable model of the outer classs
            if(MotherBoard.this.model.equals("MSI")) {
                return 4;
            }
            else {
                return usb2 + usb3;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        // create an object of the static nested class
        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.println("Total Ports = " + usb.getTotalPorts());
    }
}

/*
Key Points to Remember
Java treats the inner class as a regular member of a class. They are just like methods and variables declared inside a class.
Since inner classes are members of the outer class, you can apply any access modifiers like private, protected to your inner class which is not possible in normal classes.
Since the nested class is a member of its enclosing outer class, you can use the dot (.) notation to access the nested class and its members.
Using the nested class will make your code more readable and provide better encapsulation.
Non-static nested classes (inner classes) have access to other members of the outer/enclosing class, even if they are declared private.
 */