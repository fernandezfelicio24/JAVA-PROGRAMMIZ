package OOPIII.ENUM.Example2;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Test {
    Size pizzaSize;
    public Test(Size pizzaSize){
        this.pizzaSize = pizzaSize;
    }

    public void orederPizza() {
        switch (pizzaSize) {
            case SMALL:
                System.out.println("I ordered a small size pizza");
                break;

            case MEDIUM:
                System.out.println("I ordered a medium size pizza");
                break;
            default:
                System.out.println("I don't know which one to order");
                break;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(Size.MEDIUM);

        t1.orederPizza();
    }
}

/*
In the above program, we have created an enum type Size. We then declared a variable pizzaSize of the Size type.

Here, the variable pizzaSize can only be assigned with 4 values (SMALL, MEDIUM, LARGE, EXTRALARGE).

Notice the statement,

Test t1 = new Test(Size.MEDIUM);

It will call the Test() constructor inside the Test class. Now, the variable pizzaSize is assigned with the MEDIUM constant.
 */