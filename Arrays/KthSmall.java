import java.util.Random;

public class KthSmall {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        findKthSmallest(arr, 0, r, k-1);
        return arr[k-1];
    } 
    
    public static void findKthSmallest(int[] arr, int start, int end, int indexToFind) {
        if(start>=end) {
            return;
        }
        int pivotIndex = new Random().nextInt(end-start)+start;
        int pivot = arr[pivotIndex];
        
        int smaller = start;
        int currentPointer = start+1;
        // bring pivot to the left
        swap(arr, start, pivotIndex);
        
        while(currentPointer <= end) {
            if(arr[currentPointer] < pivot) {
                smaller++;
                swap(arr, smaller, currentPointer);
            } 
            currentPointer++;
        }
        // bring pivot back to its position
        swap(arr, smaller, start);
        pivotIndex = smaller;
        
        if(pivotIndex == indexToFind) {
            return;
        } else if (pivotIndex > indexToFind) { // search left
            findKthSmallest(arr, start, pivotIndex-1, indexToFind);
        } else { // search right
            findKthSmallest(arr, pivotIndex+1, end, indexToFind);
        }
    }
    
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
