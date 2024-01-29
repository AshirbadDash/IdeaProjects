package com.rahul;
import java .util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your name: ");
//        System.exit(12);
//        String name = sc.nextLine();
//        System.out.println(name);
//
//        int a =10; //literals are the syntactical representation of the data
//
//        int b=234_00_000;
//        System.out.println(b);
//        float marks =sc.nextFloat();
////        System.out.println(marks);
//
//        //type casting in java
//
//        int num= (int) 123.12f;
//
//        //automatic type promotion in expressions
//        int x= 257;
//        byte y =(byte) (x); //257%256=1
//        System.out.println(y);
//
//        byte z=40;
//        byte k=50;
//        byte c=100;
//        int d= z*k/c;
//        System.out.println(d);
//
//        //operator precedence
//        int i=10;
//        int j=20;
//        int k1= i++ + ++j;
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k1);

        int p ='4';
        System.out.println(p);

        //rules for java type conversion
//        all the byte short and char values are promoted to int
//        if one operand is long then the whole expression is promoted to long
//        if one operand is float then the whole expression is promoted to float
//       if one operand is double then the whole expressjon is promoted to double

        while(true) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n < 0) {
                break;
            }
            System.out.println("You have entered " + n);
        }






    }
}
