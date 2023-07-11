import java.util.*;

// Here we are checking if two arrays are equal or not..
// Equal as in the elements present in the array are same or not.. 
// if same number appears multiple times then the no. of times it is appearing that should also be same, in order to say that the arrays are same

public class ArraysEqualOrNot {
    public static void main(String[] args) {
        int arr1[]= {1, 2, 5, 4, 0};
        int arr2[]= {2, 4, 0, 1, 5};
        int arr3[]= {1, 2, 3, 4, 5};

        // boolean ans= isEqual(arr1, arr2);
        // System.out.println(ans);

        boolean answer= areEqual(arr1, arr2);
        System.out.println(answer);
    }

    // Method 1: By sorting both of the arrays
    public static boolean isEqual(int arr1[], int arr2[]){
        if(arr1.length != arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i< arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    // Method 2: By using a HashMap
    public static boolean areEqual(int arr1[], int arr2[]){
        int n= arr1.length;
        int m= arr2.length;

        if(n != m){
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0 ;
        // storing all the elements of arr1 in hashmap 
        for(int i=0; i< n; i++){
            if(map.get(arr1[i])== null){ // if we are arriving at any element first time 
                map.put(arr1[i], 1);
            }
            else{ // if element is alrealy present in our hashmap 
                count= map.get(arr1[i]); // get no. of times it is present in hashmap;
                count++; // increase once more the value of it
                map.put(arr1[i], count); // update it's count in the hashmap
            }
        }

        //now iterate for our arr2 
        for(int j= 0; j< m; j++){ 
            if(!map.containsKey(arr2[j])){ // if map does not contains element at arr2 already in it 
                return false; // then return false
            }

            if(map.get(arr2[j]) == 0){ // if map contains the value but it's count is zero, it means it is appearing more than the number of times it was present in arr1
                return false; // therefore false, not equal
            }

            count= map.get(arr2[j]);
            --count;
            map.put(arr2[j], count);
        }
        return true; // in the end both arrays are same
    }
}
