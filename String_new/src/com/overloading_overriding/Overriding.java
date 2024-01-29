//program showing overriding of method

package com.overloading_overriding;

public class Overriding {
    public static void main(String[] args) {
        OverridingDemo obj = new OverridingDemo();
        obj.display(10);
        System.out.println();



    }
    void display() {
        System.out.println("I am a human");


    }
}


     class OverridingDemo extends Overriding{
        void display(int a) {
            System.out.println("I am an animal");
            System.out.println(a);
        }


    }
