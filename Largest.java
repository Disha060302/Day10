package com.array;

public class Largest {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        int max = array[0];
        for(int i=0;i< array.length;i++){
            if(array[i]>max)
                max=array[i];
        }
        System.out.println("Maximum number is "+max);
    }
}
