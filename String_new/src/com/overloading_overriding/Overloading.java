package com.overloading_overriding;

public class Overloading {
    public static void main(String[] args) {
        // Creating object using default constructor
        Student s1 = new Student();
        s1.display();

        // Creating object using parameterized constructor
        Student s2 = new Student(1, "John");
        s2.display();

        // Creating object using parameterized constructor
        Student s3 = new Student(2, "Jane", 20);
        s3.display();
    }
    static class Student {
        int id;
        String name;
        int age;

        // Default constructor
        Student() {
            System.out.println("Default Constructor");
        }

        // Parameterized constructor
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Parameterized constructor
        Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println(id + " " + name + " " + age);
        }
    }
}
