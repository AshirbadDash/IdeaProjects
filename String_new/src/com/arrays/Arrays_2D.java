package com.arrays;

import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {

        /*
           1 2 3
           4 5 6
           7 8 9

         */

        int[][] arr = new int[3][];

        int[][] arr2 ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        int[][] arr3= {
                {1, 2, 3}, //0 index
                {4, 5}, //1 index
                {6, 7, 8, 9} //2 index

                // jagged array
            };

     Scanner sc = new Scanner(System.in);

//        int[][] arr4 = new int[3][3];

//        for (int row = 0; row < arr3.length; row++) {
//            for (int col = 0; col < arr3[row].length; col++) {
//                arr4[row][col] = sc.nextInt();
//            }
//        }

        for (int[] ints : arr3) { // for each loop for 2D array
            // every element is of type 1D array
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }






    }


}
