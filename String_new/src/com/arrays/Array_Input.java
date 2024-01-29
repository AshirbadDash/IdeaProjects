package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input {

    public static void main(String[] args) {

        int[] arr = new int[5];


        arr[0] = 50;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 30;
        arr[4] = 40;
        arr[4] = 60;
        System.out.println(arr[4]);

        //taking custom input array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr2 = new int[size];

        //for loop to take input from user

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter the value at index " + i);
            arr2[i] = sc.nextInt();
        }

        //for loop to print the array

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        //enhanced for loop

        for (int element : arr2) { //for every element in arr2, print element
            System.out.println(element + " "); //here element represents the element of the array
        }

        //toString method

        System.out.println(Arrays.toString(arr2));


    }


}
