package com.constructor;

public class Demo {
    public static void main(String[] args) {
        // Creating object using default constructor
        Student s1 = new Student();
        s1.display();

        // Creating object using parameterized constructor
        Student s2 = new Student(1, "John");
        s2.display();
    }
    static class Student {
        int id;
        String name;

        // Default constructor
        Student() {
            System.out.println("Default Constructor");
        }

        // Parameterized constructor
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println(id + " " + name);
        }
    }
}
