import java.util.Arrays;
import java.util.Scanner;

public class Arr_Multi_dim {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9

         */
        Scanner in = new Scanner(System.in);
        //syntax for 2-d array

        System.out.println("Enter the size of row");
        int row = in.nextInt();
        System.out.println("Enter the size of col");
        int col = in.nextInt();
        System.out.println("Enter the elements of 2D array");
        int[][] arr = new int[row][col];

        //Input

        for (row = 0; row < arr.length; row++) {
            //for each col in every row
            for (col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        //Output
        for (row = 0; row < arr.length; row++) {
            //for each col in every row
            for (col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);

            }
            System.out.println();
        }
        //output2
        for (row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        //output3
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }


        int[][] arr2D = null;
        arr2D = new int[][]{{1, 2, 3},//0th index
                {4, 5},//1st index --> arr2D[1]=[4,5]
                {6, 7, 8, 9}};//2nd index --> arr2D[2]={6,7,8,9}


        System.out.println(Arrays.toString(new String[]{Arrays.toString(arr2D)}));

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(new String[]{Arrays.toString(arr2D)}));
        in.close();

    }
}

