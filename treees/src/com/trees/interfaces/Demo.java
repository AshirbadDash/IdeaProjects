package com.trees.interfaces;

public class Demo {

    public static void main(String[] args) {
//        CivilStudent civilStudent = new CivilStudent();
//        civilStudent.study();

//        civilStudent.practice();
//        civilStudent.sleep();
//        civilStudent.repeat();

//        MechanicalStudent mechanicalStudent = new MechanicalStudent();
//        mechanicalStudent.study();
//        mechanicalStudent.practice();
//        mechanicalStudent.sleep();
//        mechanicalStudent.repeat();

        StudentActivities s;
        s = new CivilStudent();
        s.study();
        s.practice();
        s.sleep();
        s.repeat();

        s = new MechanicalStudent();
        s.study();
        s.practice();
        s.sleep();
        s.repeat();



    }
}

