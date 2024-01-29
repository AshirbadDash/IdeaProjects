package com.arraylist;

import java.util.ArrayList;

public class MultiDim_ArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initializing the arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //adding elements to the arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j <= 3; j++) {
                list.get(i).add(j);
            }
        }
    }
}
