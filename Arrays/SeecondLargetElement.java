import java.util.*;

public class SeecondLargetElement {
    public static void main(String[] args) {
        int arr[]= {5, 7, 7, 1, 1, 9, 3};
        int ans= find2(arr);
        System.out.println(ans);
    }

    // Finding the second largests element in the array
    public static int find(int arr[]){
        int largest= arr[0];
        int secondL= Integer.MIN_VALUE;

        for(int i=1 ; i< arr.length; i++){
            if(arr[i]> largest){
                secondL= largest;
                largest= arr[i];
            }
            else if(arr[i]> secondL && arr[i]< largest){
                secondL= arr[i];
            }
        }
        return secondL;
    }

    // Finding the second smallest element in the array
    public static int find2(int arr[]){
        int smallest= arr[0];
        int secondS= Integer.MAX_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]< smallest){
                secondS= smallest;
                smallest= arr[i];
            }
            else if(arr[i]< secondS && arr[i]> smallest){
                secondS= arr[i];
            }
        }
        return secondS;
    }
}
