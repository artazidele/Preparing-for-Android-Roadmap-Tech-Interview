package com.example.techinterview.oop_basics.abstraction;

// abstract class
abstract class Animal {
    // abstract method without body
    public abstract void animalSound();

    // regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
