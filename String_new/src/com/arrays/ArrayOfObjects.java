package com.arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {

        //array of objects

        Student[] students = new Student[5];

        students[0] = new Student("A", 1);
        students[1] = new Student("B", 2);
        students[2] = new Student("C", 3);
        students[3] = new Student("D", 4);
        students[4] = new Student("E", 5);

        for (Student student : students) {
            System.out.println(student);
        }

        //array of strings

        String[] str = new String[5];

        str[0] = "A";
        str[1] = "B";
        str[2] = "C";
        str[3] = "D";
        str[4] = "E";

        for (String s : str) {
            System.out.println(s);
        }

        //array of integers

        Integer[] arr = new Integer[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        for (Integer integer : arr) {
            System.out.println(integer);
        }

        //array of characters

        Character[] ch = new Character[5];

        ch[0] = 'A';
        ch[1] = 'B';
        ch[2] = 'C';
        ch[3] = 'D';
        ch[4] = 'E';

        for (Character character : ch) {
            System.out.println(character);
        }

        //array of doubles

        Double[] d = new Double[5];

        d[0] = 1.0;
        d[1] = 2.0;
        d[2] = 3.0;
        d[3] = 4.0;
        d[4] = 5.0;

        for (Double aDouble : d) {
            System.out.println(aDouble);
        }

        //array of floats

        Float[] f = new Float[5];

        f[0] = 1.0f;
        f[1] = 2.0f;
        f[2] = 3.0f;
        f[3] = 4.0f;
        f[4] = 5.0f;

        for (Float aFloat : f) {
            System.out.println(aFloat);
        }


    }
}
