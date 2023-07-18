import java.util.*;

public class AllSubarrays {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3};

        // subarrays(arr, arr.length);

        subarrays2(arr, 0, 0);
    }
    
    // Here we are generating all the subarrays possible for an array using iteration
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

    // Here we are generating all the subarrays possible for an array using recursion
    public static void subarrays2(int arr[], int start, int end){
        // Base case
        if(end== arr.length){
            return;
        }
        
        // whenever our start exceeds our end it means all the subarrays for the particular index have been printed and we have to increase our pointer to the next index so that we can print all the subarrays for that index
        else if(start> end){
            subarrays2(arr, 0, end+ 1);
        }

        else{
            
            for(int i=start; i<=end; i++){
                System.out.print(arr[i]);
            }
            System.out.println();

            subarrays2(arr, start+ 1, end);
        }
        return;
    }

}