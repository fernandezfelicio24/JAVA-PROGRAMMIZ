package OOPI;

/*
In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.

Once any entity (variable, method or class) is declared final, it can be assigned only once. That is,

the final variable cannot be reinitialized with another value
the final method cannot be overridden
the final class cannot be extended
 */
public class finavardemo {

    class finalDemo {
        //create a final method
        public final void display() {
            System.out.println("This is a final method.");
        }
    }

//    class Main extends finalDemo{
//        //try to override final method
//        public final void display() {
//            System.out.println("This is a final method is overriden");
//        }
//    }

    public static void main(String[] args) {

        //create a final variable
        final int AGE = 32;

        //try to change the final variable
        // AGE = 45;

        System.out.println("Age : " + AGE);

        finavardemo obj = new finavardemo();
        //Main obj = new Main();
        //obj.display()

        //result of the program is overriden method is final
    }
}
