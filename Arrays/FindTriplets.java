import java.util.Arrays;

public class FindTriplets {
    public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);//merge sort 
        for(int i=0;i<n;i++){
           int start=i+1;
           int end=n-1;
           while(start<end){//binary search
               int sum=arr[i]+arr[start]+arr[end];
               if(sum==0){
                   return true;
               }if(sum>0)
               {end--;
           }else{start++;}
        }
        }
        return false;
    }

}
