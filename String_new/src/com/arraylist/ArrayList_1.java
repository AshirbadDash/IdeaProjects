package com.arraylist;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);


        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);

        System.out.println(list.contains(254));
        System.out.println(list.indexOf(254));
        list.set(0, 254);
        list.remove(2);

        System.out.println(list);

        //size of the arraylist is fixed internally
        //if we add more than 10 elements then it will create a new arraylist with double size
        //and copy all the elements from old arraylist to new arraylist

    }
}
