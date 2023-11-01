package com.problems.arrays;

public class MoveAllZeroesToEnd {
    void pushZerosToEnd(int[] arr, int n) {
        int i= 0; 
        int j= 0;
        while(i<n){
             if (arr[i]!= 0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
            }
            i++;
        }        
    }
}
