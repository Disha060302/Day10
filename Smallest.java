package com.array;

public class Smallest {
    public static void main(String[] args) {
        int[] arr = {1,2,34,35};
        int min = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Minimum is "+min);
    }
}
