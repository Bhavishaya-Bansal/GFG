import java.util.*;

/*  In ternary search the working is same as the binary but in ternary search we just divide the array in 3 parts(inspite of dividing it in 2 parts as in binary search).. we take 2 mids.. mid1 and mid2 and the process is as follows..

1. First, we compare the key with the element at mid1. If found equal, we return mid1.
2. If not, then we compare the key with the element at mid2. If found equal, we return mid2.
3. If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
4. If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
5. If not, then we recur to the second (middle) part. 

mid1 and mid2 in this approach are made in such a way..

mid1= left+ ((right- left)/ 3);
mid2= right- ((right- left)/ 3);

*/



// Recursive approach for TERNARY SEARCH

public class TernarySearch {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target= 8;
        int left= 0;
        int right= arr.length- 1;
        int ans= search(arr, left, right, target);
        System.out.println(ans);
        
    }

    public static int search(int[] arr, int left, int right, int target) {
        int mid1= left+ ((right- left)/ 3);
        int mid2= right- ((right- left)/ 3);

        // as it is recursive approach so here we will have an if condition
        if(right >= left){
            if(arr[mid1]== target){
                return mid1;
            }
            if(arr[mid2]== target){
                return mid2;
            }

            if(arr[mid1]> target){
                return search(arr, left, mid1- 1, target);
            }

            else if(arr[mid2]< target){
                return search(arr, mid2+ 1, right, target);
            }

            else{
                return search(arr, mid1+ 1, mid2- 1, target);
            }
        }
        return -1;
    }
}
