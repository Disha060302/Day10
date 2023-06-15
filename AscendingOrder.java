package com.array;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {13,16,2,56};
        int temp = 0;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }

    }
}
