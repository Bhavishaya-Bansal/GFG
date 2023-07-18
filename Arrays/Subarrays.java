import java.util.*;

public class Subarrays {
    public static void main(String[] args) {
        int arr[]= {1, 2, 4, 5, 9};
    }

    public static void subs(int arr[]){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i= 0; i< arr.length; i++){
            for(int j=i; j< arr.length; j++){
                list.add(arr[j]);
            }
        }
        
    }
}
