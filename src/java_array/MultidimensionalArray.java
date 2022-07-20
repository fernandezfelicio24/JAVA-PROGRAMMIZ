package java_array;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //create a 2d array
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9,},
                {7, 4},
        };

        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 1: " + a[1].length);
        System.out.println("Length of row 1: " + a[2].length);

        System.out.println("======================================");
        //first for... each loop access the individual array
        for (int i = 0; i < a.length; i++) {

            System.out.println("\n");
            for (int j = 0; j < a[i].length; j++) {
                //second for...each loop access each element inside the row
                System.out.print(a[i][j]);
            }
        }
    }
}
