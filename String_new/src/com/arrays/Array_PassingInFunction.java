package com.arrays;

import java.util.Arrays;

public class Array_PassingInFunction {
    public static void main(String[] args) {

        int[] nums ={1, 2, 3, 4, 5};
        System.out.println("Before passing in function: "+ Arrays.toString(nums));
        change(nums);
        System.out.println("After passing in function: "+ Arrays.toString(nums));


    }


    static  void change(int[] arr){
        arr[0] = 99;
    }

}
