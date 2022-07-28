package OOPII;

public class klompex {
    private  int a, b;

    //constructor with 2 parameters
    private klompex(int i, int j){
        this.a = i;
        this.b = j;
    }

    //constructor with single parameter
    private klompex(int i){
        //invokes the constructor with 2 parameters
        this(i,i);
    }

    //counstructor with no parameter
    private klompex(){
    //invokes the constructor with single parameter
    this(0);
    }
    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public static void main(String[] args) {
        // creating object of Complex class
        // calls the constructor with 2 parameters
        klompex k1 = new klompex(2,3);

        //calls the constructor with no parameters
        klompex k2 = new klompex(3);

        //call the constructor with no parameters
        klompex k3 = new klompex();

        // print objects
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }
}
