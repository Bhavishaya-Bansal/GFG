import java.util.*;

public class RomeveObject {
    public static void main(String[] args) {
        String arr[]= {"Hi", "I", "am", "Hi", "Bhav", "Hi"};
        String object= "Hi";
        
        String answer[]= remove2(arr, object);
        System.out.println(Arrays.toString(answer));

        String ans[]= remove(arr, object);
        System.out.println(Arrays.toString(ans));
    }

    // Simple method: moving all the non required parts to the end of the array(after ith index) and making the copy of array till the part we need and returning it
    public static String[] remove(String arr[], String object){
        int i, j;
        for(i= 0, j=0; j< arr.length; j++){
            if(!arr[j].equals(object)){
                arr[i++]= arr[j];
                
            }
        }
        return arr= Arrays.copyOf(arr, i);
    }

    // Making array as list and using list's inbuilt remove method and then converting back the list into array
    public static String[] remove2(String arr[], String object){
        // storing all our array elements in the list
        List<String> list= new ArrayList<>(Arrays.asList(arr)); 

        // Removing all teh objects from our list
        list.removeAll(Arrays.asList(object));

        // Converting back our list to array.. Here the size of array would also be updated
        arr= list.toArray(new String[0]);

        return arr;
    }
}


