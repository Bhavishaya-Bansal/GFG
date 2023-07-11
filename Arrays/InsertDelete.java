import java.util.*;

// This code is used to insert and delete element at certain position
public class InsertDelete {
    public static void main(String[] args) {
        int capacity= 10;
        int arr[]= new int[capacity];
        arr[0]= 1;
        arr[1]= 2;
        arr[2]= 3;
        arr[3]= 4;
        arr[4]= 5;
        arr[5]= 6;

        int n=6;
        insertEnd(arr, 15, capacity, n);
        System.out.println(Arrays.toString(arr));

    }

    public static int insertEnd(int arr[], int element, int capacity, int n){
        if(n >= capacity){
            return n;
        }
        arr[n]= element;
        return n+1;
    }
}
