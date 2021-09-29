package com.example.techinterview.oop_basics;

public class Student extends Person {
    // one more attribute
    private String university;

    // Constructor
    public Student(String personsName, int personsAge, String studentsUniversity){
        super(personsName, personsAge); // parent's constructor
        university = studentsUniversity;
    }

    // one more method
    public void changeUniversity(String newUniversity) {
        university = newUniversity;
    }
}
