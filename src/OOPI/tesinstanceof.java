package OOPI;
//superclass

class Animal {

}

//subclass
class Dog extends  Animal{

}

/*
The instanceof operator is also used to check whether an object of a class
is also an instance of the interface implemented by the class.

 */

interface  Transport {

}

class Motorbike implements Transport{

}

public class tesinstanceof {


    public static void main(String[] args) {

        //create an object of the subclass
        Dog d1 = new Dog();

        //checks if d1 is an instance of the subclass
        System.out.println(d1 instanceof  Dog);

        Motorbike m1 =  new Motorbike();
        System.out.println(m1 instanceof Transport);
    }
}
