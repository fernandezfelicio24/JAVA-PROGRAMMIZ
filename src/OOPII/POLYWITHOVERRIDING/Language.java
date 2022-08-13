package OOPII.POLYWITHOVERRIDING;
/*
During inheritance in Java, if the same method is present in both the superclass and the subclass.
Then, the method in the subclass overrides the same method in the superclass. This is called method overriding.

In this case, the same method will perform one operation in the superclass and another operation in the subclass.


 */
public class Language {

    public void displayInfo(){
        System.out.println("Common English Language");
    }
}

class Java extends Language {
    @Override
    public void displayInfo(){
        System.out.println("Java Programming Language");
    }
}
//========================================================================

/*
In a Java class, we can create methods with the same name if they differ in parameters. For example,
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }

This is known as method overloading in Java.
 */

class Pattern {
    //method without parameter
    public void display(){
        for (int i = 0; i < 10; i++){
            System.out.print("*");
        }
    }

    //method with single parameter
    public void display(char symbol){
        for (int i = 0; i < 10; i++){
            System.out.print(symbol);
        }
    }
}


class Main {
    public static void main(String[] args) {
        // create an object of Java class
        Java j1 = new Java();
        j1.displayInfo();

        // create an object of language class
        Language l1 = new Language();
        l1.displayInfo();


        System.out.println("=================================");
            Pattern d1 = new Pattern();
        // call method without any argument
        d1.display();
        System.out.println("\n");

        // cal method with a single argument
        d1.display('#');
    }
}
