package com.ash;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("123");
        System.out.print("hello world");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String name =sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your age: ");
        int age =sc.nextInt();
        System.out.println(age);

        /*
primitive data types
        byte b1=127;
        short s=123;
        int roll_no=64;
        long l = 12121212L;
        float marks=98.67f;
        double d =12.2121;
        boolean b=true;
        char c ='q';
*/




    }

}