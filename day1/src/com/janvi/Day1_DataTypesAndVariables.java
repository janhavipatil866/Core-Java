package com.janvi;

//Day 1 - Core Java
//Topic: Data Types and Variables

public class Day1_DataTypesAndVariables {

 // Instance variable
 int instanceVariable = 100;

 // Static variable
 static String staticVariable = "Core Java Learning";

 public static void main(String[] args) {

     // -------------------------------
     // 1️⃣ Primitive Data Types
     // -------------------------------

     byte byteValue = 10;              // 1 byte
     short shortValue = 200;           // 2 bytes
     int intValue = 5000;              // 4 bytes
     long longValue = 100000L;         // 8 bytes

     float floatValue = 10.5f;         // 4 bytes
     double doubleValue = 99.99;       // 8 bytes

     char charValue = 'J';             // 2 bytes (Unicode)
     boolean booleanValue = true;      // true/false

     System.out.println("----- Primitive Data Types -----");
     System.out.println("Byte: " + byteValue);
     System.out.println("Short: " + shortValue);
     System.out.println("Int: " + intValue);
     System.out.println("Long: " + longValue);
     System.out.println("Float: " + floatValue);
     System.out.println("Double: " + doubleValue);
     System.out.println("Char: " + charValue);
     System.out.println("Boolean: " + booleanValue);

     // -------------------------------
     // 2️⃣ Non-Primitive Data Types
     // -------------------------------

     String name = "Janhavi";
     int[] numbers = {1, 2, 3, 4, 5};

     System.out.println("\n----- Non-Primitive Data Types -----");
     System.out.println("String: " + name);
     System.out.println("Array first element: " + numbers[0]);

     // -------------------------------
     // 3️⃣ Local Variable
     // -------------------------------

     int localVariable = 50;
     System.out.println("\nLocal Variable: " + localVariable);

     // Accessing instance and static variable
     Day1_DataTypesAndVariables obj = new Day1_DataTypesAndVariables();
     System.out.println("Instance Variable: " + obj.instanceVariable);
     System.out.println("Static Variable: " + staticVariable);

     // -------------------------------
     // 4️⃣ Type Casting
     // -------------------------------

     // Implicit Casting (Widening)
     int num1 = 10;
     double num2 = num1;  // int to double
     System.out.println("\nImplicit Casting (int to double): " + num2);

     // Explicit Casting (Narrowing)
     double num3 = 9.78;
     int num4 = (int) num3;  // double to int
     System.out.println("Explicit Casting (double to int): " + num4);
 }
}