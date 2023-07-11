import java.util.*;

// here we will see how does dynamic arrays work 

public class DynamicArray {
    // Making our array, count of the numbers(number of elements present in the array) in the array and the size of the array
    public int arr[];
    public int count;
    public int size;

    // Constructor to initalize the values
    public DynamicArray(){
        arr= new int[1];
        count= 0;
        size= 1;
    }

    public void add(int data){
        if(count == size){
            growSize();
        }
        // insert element at the end of the array
        arr[count]= data;
        count++;        
    }

    public void growSize() {
        int temp[] = null;
        if(count == size){
            temp = new int[size* 2];

            // Assign all the array values in new temp array
            for(int i=0; i< size; i++){
                temp[i] = arr[i];
            }

            // Assign back the new values in our temp array
            arr= temp;
            size= size*2;
        }
    }

    public void shrinkSize(){
        int temp[] = null;
        if(count > 0){
            temp = new int[count]; // as we want to reduce the size therefore we will only keep the size of our array till the count 

            for(int i=0 ; i< count; i++){
                temp[i]= arr[i];
            }

            // making our size equals to the count 
            size= count;
            arr= temp; // assigning all the temp value to our original array
        }
    }

    public void addAt(int data, int index){
        if(count == size){
            growSize();
        }

        for(int i = count- 1; i> index; i--){
            arr[i+ 1]= arr[i];
        }

        arr[index]= data;
        count++;
    }

    public void remove(){
        if(count > 0){
            arr[count- 1]= 0;
            count--; 
        }
    }

    public void removeAt(int index){
        if(count> 0){
            for(int i= index; i< count-1; i++){
                arr[i]= arr[i+1];
            }
            arr[count- 1]= 0; 
            count--;
        }
    }

    public static void print(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        
    }

}
