public class MaxLen {
    int maxLen(int arr[], int n)
    {
        // Your code here
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        int presum = 0;
        map.put(presum,-1);
        int ans = 0;
        for(int i = 0;i<n;i++){
            presum += arr[i];
            if(map.get(presum)!=null){
               ans =  Math.max(ans,i- map.get(presum));   
            } else {
                map.put(presum,i);
            }
        }
        return ans;
    }
}