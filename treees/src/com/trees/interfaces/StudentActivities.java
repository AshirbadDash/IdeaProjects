package com.trees.interfaces;

public interface StudentActivities {

    static final int value = 20; // variable used inside interface is by default static and final

    abstract void study();

    abstract void practice();

    abstract void sleep();

    abstract void repeat();
}

class CivilStudent implements StudentActivities {


    @Override
    public void study() {
        System.out.println("Civil Student is studying");

    }

    @Override
    public void practice() {
        System.out.println("Civil Student is practicing");

    }

    @Override
    public void sleep() {
        System.out.println("Civil Student is sleeping");
    }

    @Override
    public void repeat() {
        System.out.println("Civil Student is repeating");
    }
}

class MechanicalStudent implements StudentActivities {

    @Override
    public void study() {
        System.out.println("Mechanical Student is studying");

    }

    @Override
    public void practice() {
        System.out.println("Mechanical Student is practicing");

    }

    @Override
    public void sleep() {
        System.out.println("Mechanical Student is sleeping");
    }

    @Override
    public void repeat() {
        System.out.println("Mechanical Student is repeating");
    }
}


