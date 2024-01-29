package com.cllections;

import java.util.ArrayList;
import java.util.Collections;

public class Generics {
    public static void main(String[] args) {

        student s1 = new student(1,"ashish");
        student s2 = new student(57,"jain");
        student s3 = new student(99,"panda");
        student s4 = new student(34,"kumar");
        student s5 = new student(23,"singh");

        ArrayList<student> arrayList = new ArrayList<student>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        arrayList.add(s5);


        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
class Student implements Comparable<student>{
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return id+"-"+name;

    }

    @Override
    public int compareTo(student o) {
//        if(this.id>o.id){
//            return 1;
//        }
//        else if(this.id<o.id){
//            return -1;
//        }
//        else
//        return 0; //comparing id


        //comparing name
        if(this.name.compareTo(o.name)>0){
            return 1;
        }
        else if(this.name.compareTo(o.name)<0){
            return -1;
        }
        else
            return 0;


    }
}

