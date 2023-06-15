package com.array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {13, 16, 2, 45};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println( array[i]+ " ");
        }
        System.out.println("Second largest number is "+array[array.length-2]);
    }
}
