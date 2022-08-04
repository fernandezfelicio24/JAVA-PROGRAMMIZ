package OOPI;

/*
In Java, a string is a sequence of characters. For example, "hello"
is a string containing a sequence of characters 'h', 'e', 'l', 'l', and 'o'.

We use double quotes to represent a string in Java. For example,
 */
public class strinking {

    public static void main(String[] args) {
        //create strings
        String first = "Java";
        String second = "Python";
        String third = "JavaScript";

        //print strings
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println("==========================");

        //create as string
        String greet = "Hello! World";
        System.out.println("String : " + greet);

        //get the length of greet
        int length = greet.length();
        System.out.println("Length: " + length);
        System.out.println("=============================");

        //create first string
        String first1 = "Java";
        System.out.println("First String: " + first1);

        //create second
        String second1 = "Programming";
        System.out.println("Second String: " + second1);

        //join two strings
        String joinedString = first1.concat(second);
        System.out.println("Joined String: " + joinedString);
        System.out.println("=============================");


        //compare  strings
        String first2 = "java programming";
        String second2 = "java programming";
        String third2 = "python programming";

        //compare first and second strings
        boolean result1 = first2.equals(second2);
        System.out.println("Strings first and second are equals :" + result1);

        //compare first and third strings
        boolean result2 = first2.equals(third2);
        System.out.println("Strings first and third are equals :" + result2);
        System.out.println("===================================");
    }
}
