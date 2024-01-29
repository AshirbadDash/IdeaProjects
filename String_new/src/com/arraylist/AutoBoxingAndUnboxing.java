package com.arraylist;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        // Autoboxing and Unboxing
        Integer i = 10; // autoboxing
        int j = i; // unboxing
//        System.out.println(i + " " + j);

        int a = 10;
        Integer b = a;// autoboxing
        Integer c= Integer.valueOf(a);// autoboxing
        System.out.println(c);
        System.out.println(a + " " + b);


        //unboxing
        Integer d = new Integer(10);
        int e = d;
        int f = d.intValue();
        System.out.println(d + " " + e);




    }

}
