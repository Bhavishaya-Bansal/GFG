import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // result(arr);
        
    }

    public static int arr[] result(int arr[][]){
        int ans[]= new int[arr.length*2];

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                if(isValid(i, j) && (i== 1)){
                    ans[0]= arr[]
                }
            }
        }
    }

    public static boolean isValid(int i, int j){
        if(i< 0 || j> 2){
            return false;
        }
        return true;
    }
}
