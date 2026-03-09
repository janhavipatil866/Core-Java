package com.janvi;

public class multiplecatchblocks {
    public static void main(String[] args) {

        try {
            int arr[] = new int[5];
            arr[6] = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred");
        } catch (Exception e) {
            System.out.println("General Exception occurred");
        }

        System.out.println("Program finished");
    }
}