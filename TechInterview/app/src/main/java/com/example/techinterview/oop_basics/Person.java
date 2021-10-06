package com.example.techinterview.oop_basics;

// OOP - a programming paradigm based on the concept of "objects", which can contain data and code:
//      - data in the form of fields;
//      - code in the form of procedures.

// Class - template for objects.
// Object - an instance of a class.

// Class has attributes and methods.
public class Person {
    // attributes:
    String name;
    int age;

    // methods:
    public static void createPerson() {
        // to create an object, use Class name + Object name + new
        Person myPerson = new Person("Name", 21);
    }

    // Constructor - a special method that is used to initialize objects.
    public Person(String constructorName, int constructorAge) {
        name = constructorName;
        age = constructorAge;
    }

    public int printNumbers() {
        int a = 9;
        for(int i=1; i<11; i++){
            a =+ i;
        }
        return a;
    }

    String[] fruits = new String[] { "Orange", "Apple", "Pear", "Strawberry" };
    int b = 0;
    public int countFruits(){
        for (String fruit : fruits) {
            b += 1;
        }
        return b;
    }

    int c = 0;
    public int countC() {
        int count = 5;
        while (count > 0) {
            c++;
            count--;
        }
        return c;
    }



}

// Encapsulation - making sure that "sensitive" data is hidden from users.
// To achieve encapsulation, You have to:
//      - declare class attributes as private;
//      - provide public get and set methods.

// Inheritance - a process, when one class inherits attributes and methods from another class.
//      - Subclass (child) - the class that inherits from another class
//      - Superclass (parent) - the class being inherited from
// Student inherits from Person => see on file Student.java

// Polymorphism - using inherited methods to perform different tasks.
// For example, pigs and cats are animals, but they make different sounds.
// See an example in the package "polymorphism".

// Abstraction - the process of hiding certain details and showing only essential information to the user.
//      - Abstract class - a class that cannot be used to create objects.
//      - Abstract method - a method that can only be used in an abstract class and does not have a body. The body is provided by the subclass.
// See an example in the package "abstraction".


