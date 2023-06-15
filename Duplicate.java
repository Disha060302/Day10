package com.array;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,3,2,5,6};
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Duplicate numbers are: "+array[j]);
                }
            }
        }
    }
}
