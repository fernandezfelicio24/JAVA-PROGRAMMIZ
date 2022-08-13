package OOPII.POLYMORPHISM;
/*
Polymorphism is an important concept of object-oriented programming.
 It simply means more than one form.

That is, the same entity (method or operator or object) can perform
 different operations in different scenarios.



 */
 class Polygon {

    //method to render a shape
    public void render(){
        System.out.println("Rendering Polygon ...");
    }
}

class Square extends Polygon{
     //renders Square
    public  void render() {
        System.out.println("Rendering Square");
    }
}


class Circle extends Polygon {
     //renders circle

    public void render(){
        System.out.println("Rendering Circle...");
    }
}

class  Main {
    public static void main(String[] args) {
        //create an object of square
        Square s1 = new Square();
        s1.render();

        // create an object of circle
        Circle c1 = new Circle();

        c1.render();
    }
}

