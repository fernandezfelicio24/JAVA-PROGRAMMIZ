package OOPI;
/*
Types of Constructor
In Java, constructors can be divided into 3 types:

 No-Arg Constructor
 Parameterized Constructor
 Default Constructor

 */

/*
Constructors are invoked implicitly when you instantiate objects.
The two rules for creating a constructor are:
The name of the constructor should be the same as the class.
A Java constructor must not have a return type.
If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0
Constructor types:
No-Arg Constructor - a constructor that does not accept any arguments
Parameterized constructor - a constructor that accepts arguments
Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
A constructor cannot be abstract or static or final.
A constructor can be overloaded but can not be overridden
 */

public class Constraktor {
    int i;
     String name, languages;
    // constructor with no parameter known as a no-argument Constructor

//    private Constraktor(){
//        i = 5;
//        System.out.println("Constructor is called");
//    }

    //java public no-arg constructors

//    public Constraktor(){
//        name = "Programiz";
//    }

    //Parameterrized constructor

    // Constructor accepting single value
    Constraktor(String lang){
        languages = lang;
        System.out.println(languages + " Programming Language");
    }

    //Java Constructor Overloading



    public static void main(String[] args) {
        // CALLING THE CONSTRUCTOR WITHOUT ANY PARAMETER
        //Constraktor obj = new Constraktor();

        //System.out.println("Value of i :" + obj.i);

        //System.out.println("Company name = " + obj.name);

        // call constructor by passing a single value
        Constraktor obj1 = new Constraktor("Java");
        Constraktor obj2 = new Constraktor("Python");
        Constraktor obj3 = new Constraktor("C");

    }
}
