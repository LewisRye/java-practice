package com.Lewis;

import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElements = 0;

        while (noOfElements == 0)
        {
            System.out.print("How many elements would you like in your array?: ");
            noOfElements = sc.nextInt();
            if (noOfElements < 1) {
                System.out.println("Please enter a number greater than zero.");
            }
            System.out.println();
        }

        int[] input = new int[noOfElements];

        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter the value of index " + i + ": ");
            input[i] = sc.nextInt();
        }

        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int[] array) {
        int j = 0;
        int length = array.length;

        if (length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - i - 1]) {
                return false;
            } else {
                j++;
            }
        }

        return (j == length/2);
    }
}
