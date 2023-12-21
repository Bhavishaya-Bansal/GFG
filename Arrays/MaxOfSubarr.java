import java.util.ArrayList;

public class MaxOfSubarr {
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> a=new ArrayList<Integer>();
        int i=0,j=0,max;
        while(i<=(n-k)){
            max=0;
            j=i;
            while(j<(i+k)){
                if(arr[j]>max)
                max=arr[j];
                j++;
                
            }
            a.add(max);
            i++;
            
        }
        return(a);
    }

}
