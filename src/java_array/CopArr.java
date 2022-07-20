package java_array;

import java.util.Arrays;

public class CopArr {
    public static void main(String[] args) {
      /*
        int [] numbers = {1,2,3,4,5,6};
        int [] positivenumbers = numbers;  //copying arrays

        for (int number:positivenumbers){
            System.out.print(number + ", ");
        }

       */

        /*

       //using looping Construct to Copy Arrays
        int [] source = {1,2,3,4,5,6};
        int [] destination = new int[6];

        //iterate and copy elements from source to destination
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];

            System.out.print(destination[i]);
        }

        //converting array to string
        System.out.println(Arrays.toString(destination));

        */

        //USING SPECIAL METHOD ARRAYCOPY()

        int [] n1 = {2, 3, 12, 4, 12, -2};
        int [] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int [] n2 = new int[n1.length];

        // Copying entire n1 array to n2
        System.arraycopy(n1, 0,n2,0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));
        System.out.println("=====================================");
        //copying elements from index 2 on n1 array
        //copying element to index 1 of n3 array
        //2 elements will be copied

        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
    }
}
