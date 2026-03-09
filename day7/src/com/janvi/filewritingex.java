package com.janvi;

import java.io.FileWriter;
import java.io.IOException;

public class filewritingex {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello this is Core Java File Handling");
            writer.close();

            System.out.println("File written successfully");

        } catch (IOException e) {
            System.out.println("Error writing file");
        }

    }
}