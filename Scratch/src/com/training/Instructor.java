package com.training;

class Instructor {
    // shared among all Instructor objects
    private static Projector projector = new Projector();

    // instance variables for each Instructor object
    private String name;
    private int yearsExperience;

    public Instructor(String name, int yearsExperience) {
        System.out.println("Instructor ctor called");
        this.name = name;
        this.yearsExperience = yearsExperience;
    }

    public static void touch() {
        System.out.println("Instructor's touch() method called:");
    }

    public String getName() {
        return name;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    static {
        System.out.println("Static fields initialized, Instructor.class loaded into memory");
    }
}