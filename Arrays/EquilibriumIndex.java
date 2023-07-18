import java.util.*;

// The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 
public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[]= {-7, 1, 5, 2, -4, 3, 0};
        int ans= index(arr);
        System.out.println(ans);
    }

    // using two for loops maintaing leftSum and rigthSum for particular index and comparing for each index if they are equal or not 
    public static int index(int arr[]){
        for(int i=0; i< arr.length; ++i){
            int leftSum= 0, rightSum =0;
            for(int j=0; j< i; j++){
                leftSum= leftSum+ arr[j];
            }

            for(int j=i+1; j< arr.length; j++){
                rightSum= rightSum+ arr[j];
            }

            if(leftSum== rightSum){
                return i;
            }
        }
        return -1;
    }

    
}
