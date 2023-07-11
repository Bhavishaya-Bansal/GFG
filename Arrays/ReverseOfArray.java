import java.util.*;

public class ReverseOfArray {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6};
        // System.out.println(Arrays.toString(rev(arr)));
        revRec(arr, 0, arr.length- 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] rev(int arr[]){
        int mid= arr.length/2;
            for(int i= 0; i< mid; i++){
                int temp= arr[i];
                arr[i]= arr[arr.length- i- 1];
                arr[arr.length- i- 1]= temp;
            }
            return arr;
    }

    public static void revRec(int arr[], int start, int end){  
        if(start>= end){
            return;
        }
        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]= temp;

        revRec(arr, ++start, --end);
    }
}
