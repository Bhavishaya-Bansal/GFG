import java.util.*;

// Here we are generating all the subarrays possible for an array using recursion
public class AllSubarrays {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        subarrays(arr, arr.length);
    }

    public static void subarrays(int arr[], int end){
        if(arr.length== 0){
            return;
        }   

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
               print(arr, i, j);
            }
        }
    }

    public static void print(int arr[], int s, int e){
        for(int i=s; i< e; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}