public class subArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        int sum=0;
        int i,j;
        i=j=0; // Set two pointers i,j to the 1st position
        while(j<n){ 
            sum+=arr[j]; // Increment sum till sum>s to find the pos of ub/j
            while(sum>s){ // Increment i till sum<=s
                sum-=arr[i];
                i++;
            }
            if(sum==s){ // Subarray found
                if(i>j) break;
                a.add(i+1);
                a.add(j+1);
                break;
            }
            j++;
        }
        if(a.isEmpty()) a.add(-1); // No subarray found
        return a;
    }

}