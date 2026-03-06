package com.janvi;

class Student {

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class (Inheritance)
class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class day5 {

    public static void main(String[] args) {

        System.out.println("---- Class & Object Example ----");

        Student s1 = new Student("Janhavi", 22);
        s1.display();

        System.out.println("\n---- Inheritance Example ----");

        Dog d = new Dog();
        d.sound();

    }
}