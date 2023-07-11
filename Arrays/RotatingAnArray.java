import java.util.*;

// Here we are rotating our array to the left.. ex: arr= {1, 2, 3, 4, 5, 6}
//                                  After rotation: arr= {2, 3, 4, 5, 6, 1}
//                   Again after one more rotation: arr= {3, 4, 5, 6, 1, 2}
public class RotatingAnArray {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6};
        int nmbrOfTimes= 2;
        
        rotate2(arr, nmbrOfTimes);
        System.out.println(Arrays.toString(arr));
    }

    // Rotating the array using temp variable
    public static void rotate(int[] arr, int nmbrOfTimes) {
        int tracker= 1;
        while(tracker <= nmbrOfTimes){
            int temp= arr[0];
            for(int i= 0; i< arr.length- 1; i++){
                arr[i]= arr[i+ 1];
            }
            arr[arr.length- 1]= temp;
            tracker++;
        }
    }

    // Ratation using a new array
    public static void rotate2(int arr[], int nmbrOfTimes){
        int j=0; // tracker to track index in temp arr
        int temp[] = new int[arr.length];

        for(int i= nmbrOfTimes; i< arr.length; i++){
            temp[j]= arr[i]; 
            j++;
        }
        for(int i= 0; i< nmbrOfTimes; i++){
            temp[j]= arr[i];
            j++;
        }

        for(int i= 0;i< arr.length; i++){
            arr[i]= temp[i];
        }
        
    }
}
