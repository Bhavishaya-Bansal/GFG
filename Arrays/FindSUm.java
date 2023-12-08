public class FindSUm {
    static boolean sum(int arr[],int n,int start){
        if(start>=n){
            return false;
        }
        int sum=0;
        for(int i=start;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                return true;
            }
        }
        return sum(arr,n,start+1);
        
    }
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        return sum(arr,n,0);
    }
}

