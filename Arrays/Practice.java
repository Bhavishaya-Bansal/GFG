import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int arr[]={0,0,2,2,3,3,4};
        int ans= search(arr, 2, 0, arr.length- 1);
        System.out.println(ans);
        
    }

    // arr= [5, 6, 7, 8, 9, 1, 2, 3] -> this is a rotated sorted array
    // target = 7..
    private static int search(int arr[], int target, int start, int end){
        if(start> end){
            return -1;
        }

        int mid= start+ (end- start)/2;
        if(arr[mid]== target){
            return mid;
        }

        if(arr[start]<= arr[mid]){
            
        }

    }
    
}
