package be.intecbrussel;

import java.util.Arrays;
import java.util.Scanner;



public class Arrays1 {
    public static void main(String[] args) {

        //exercice 1.
        //. Schrijf een programma dat 10 int's vraagt aan een gebruiker en deze in een array plaatst. Print deze
        //array dan uit op het scherm.

        int[] inputArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 9; i++) {
            System.out.println((i + 1) + ": input int: ");
            int value = scanner.nextInt();
            inputArray[i] = value;
        }

        System.out.println("values are:");
        for (int value : inputArray) {
            System.out.println(value);
        }

        // exerc 3.
        //Write a program that finds the duplicates in an array int values.
        int[] originalArray = {1, 2, 3};

        System.out.println("Original Array");
        for (
                int index = 0;
                index < originalArray.length; index++)
            System.out.print(originalArray[index] + " ");

        int[] newArray = Arrays.copyOf(originalArray, 10);
    }
}







