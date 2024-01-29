package com.arrays;

public class Array_1 {
    public static void main(String[] args) {


        int a = 10;

        //array is homogeneous
        int[] no = new int[5];

        int[] arr = {1, 2, 3, 4, 5};

        // int[] no//declaration of array --no is getting defined in stack (not pointing to anything so we need to point to a object )
        //      =new int[5];//instantiation-- object is being created in heap memory

//left side of = happens at compile time (static memory allocation)
        //right side of = happens at run time (dynamic memory allocation)

        //array objects are in heap memory
        // heap objects are not continuous
        //dynamic memory allocation

        //hence --may not be continuous (depends on jvm)

        System.out.println(no[0]);

        //new keyword is used to create object

        //null can be assigned to non -primitives
        //all reference types are by default null

        String[] str = new String[5];
        System.out.println(str[0]);




    }

}
