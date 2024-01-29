package com.string;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {

        int i= 10;
        System.out.println(i);

        int[] arr = {2, 3, 5, 4, 19};

        String name = "rahul";
        String name1 = "rahul";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        //String pool
        //all the similar values of strings are not recreated in the memory
        //they are stored in the string pool and the reference is given to the new string
        //if the string is not present in the string pool then it is created in the memory
        //and the reference is given to the new string

        //String pool is a part of heap memory
        //String pool is not a part of stack memory

        name1="utkarsh";
        System.out.println(name1.hashCode());

        String a="ash";
        String b="ash";
        System.out.println(a==b);

        System.out.println(a.hashCode());

        a="ashirbad";


        System.out.println(a);
        System.out.println(a.hashCode());


        //comparison of strings
        //== operator compares the reference of the strings

        String s1=new String("ashirbad");
        String s2=new String("ashirbad");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));






    }
}
