public class FindThreeNumbers {
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       Arrays.sort(A);
       for(int i = 0; i < A.length ; i++){
           int j = i+1;
           int k = n-1;
           while(j < k){
               if(A[i]+A[j]+A[k] == X)return true;
               else if(A[i]+A[j]+A[k] < X)j++;
               else k--;
           }
       }
       return false;
    }
}

