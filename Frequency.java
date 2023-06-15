package com.array;

public class Frequency {
    public static void main(String[] args) {
        int[] array = {10,20,70,70,50,70,10,10,90};
        for(int i=0;i< array.length;++i){
            int x=array[i];
            int count = 0;
            if(x==-1)continue;
            for(int j=0;j< array.length;++j){
                if(x==array[j]){
                    count++;
                    array[j]=-1;
                }
            }
            System.out.println("Frequency of "+x+" is "+count);
        }
    }
}

