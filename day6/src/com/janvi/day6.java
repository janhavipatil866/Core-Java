package com.janvi;

//Encapsulation Example
class Person {

 private String name;
 private int age;

 // Getter
 public String getName() {
     return name;
 }

 // Setter
 public void setName(String name) {
     this.name = name;
 }

 // Getter
 public int getAge() {
     return age;
 }

 // Setter
 public void setAge(int age) {
     this.age = age;
 }
}


//Abstraction Example
abstract class Shape {

 abstract void draw();
}


//Interface Example
interface Animal {

 void sound();
}


//Polymorphism Example
class Dog implements Animal {

 public void sound() {
     System.out.println("Dog barks");
 }
}

class Cat implements Animal {

 public void sound() {
     System.out.println("Cat meows");
 }
}


class Circle extends Shape {

 void draw() {
     System.out.println("Drawing Circle");
 }
}


public class day6 {

 public static void main(String[] args) {

     // Encapsulation
     Person p = new Person();
     p.setName("Janhavi");
     p.setAge(22);

     System.out.println("Name: " + p.getName());
     System.out.println("Age: " + p.getAge());

     // Abstraction
     Shape s = new Circle();
     s.draw();

     // Interface + Polymorphism
     Animal a1 = new Dog();
     Animal a2 = new Cat();

     a1.sound();
     a2.sound();
 }
}