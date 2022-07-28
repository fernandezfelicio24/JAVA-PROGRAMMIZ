package OOPII;

public class thisexampleofthis {
    //declare variable
    int x;
    int y;

    thisexampleofthis(int x, int y){
        //assing values of variables inside constructor
        this.x = x;
        this.y = y;

        //value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method.");
        System.out.println("x = " + this.x + ", y = " + this.y);

        //call the add() method passing this as arguments
        add(this);

        //value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void  add(thisexampleofthis o){
         o.x += 2;
         o.y += 2;
    }

}

class Main {
    public static void main(String[] args) {
            thisexampleofthis obj = new thisexampleofthis(1, -2);

    }
}

