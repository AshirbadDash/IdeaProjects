// Create a class A with a field age and a class B with a field name.
package com.kodnest.cc;

 class A{

    int age;
}
class B extends A {
    String name;
}

public class Solution {
    public static void main(String[] args) {


        B b = new B();

        system.out.println(b.age);
        system.out.println(b.name);
    }
}

