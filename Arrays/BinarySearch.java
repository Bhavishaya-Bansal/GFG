public class BinarySearch {
    private int low(int arr[], int s, int e,int x)
    {
        int ans=-1;
        
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==x)
            {
                ans=mid;
                e=mid-1;
            }
            else if(arr[mid]>x)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
      return ans;
    }
    private int high(int arr[], int s, int e,int x)
    {
        int ans=-1;
        
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==x)
            {
                ans=mid;
                s=mid+1;
            }
            else if(arr[mid]>x)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
      return ans;
    }
    
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int s=0,e=arr.length-1;
        int first=low(arr,s,e,x);
        int last=high(arr,s,e,x);
        ans.add(first);
        ans.add(last);
      
      return ans;
    }
}