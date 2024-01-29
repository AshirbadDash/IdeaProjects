package com.ash;

public class Typeconversion {
    public static void main(String[] args) {
        // implicit type conversion
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

        // explicit type conversion
        double d = 100.04;
        long l1 = (long)d;
        int i1 = (int)l1;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l1);
        System.out.println("Int value "+i1);

        // type conversion in expressions
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i2 = 50000;
        float f1 = 5.67f;
        double d1 = .1234;
        double result = (f1 * b) + (i2 / c) - (d1 * s);
        System.out.println("result = "+result);

            // automatic type promotion in expressions
            byte b1 = 42;
            char c1 = 'a';
            short s1 = 1024;
            int i3 = 50000;
            float f2 = 5.67f;
            double d2 = .1234;
            double result1 = (f2 * b1) + (i3 / c1) - (d2 * s1);
            System.out.println("result = "+result1);

            // type casting operator
            byte b2 = 42;
            char c2 = 'a';
            short s2 = 1024;
            int i4 = 50000;
            float f3 = 5.67f;
            double d3 = .1234;
            // The Expression's value is promoted to int, and then the result is converted to byte, and assigned to b3.
            byte b3 = (byte) ((f3 * b2) + (i4 / c2) - (d3 * s2));
            System.out.println("result = "+b3);

            // type conversion in assignments
            // byte b4 = 50;
            // b4 = b4 * 2; // Error : cannot convert from int to byte
            // b4 = (byte) (b4 * 2); // OK, but b4 contains incorrect value -100

    }
}
