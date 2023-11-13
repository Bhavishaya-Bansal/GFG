public class MaxProduct {
    long maxProduct(int[] arr, int n) {
        // code here
        long prod1=arr[0];
        long prod2=arr[0];
        long res=arr[0];
        for(int i=1;i<arr.length;i++){
            long temp = Math.max((long)arr[i],Math.max(prod1*(long)arr[i],prod2*(long)arr[i]));
            prod2 = Math.min((long)arr[i],Math.min(prod1*(long)arr[i],prod2*(long)arr[i]));
            prod1=temp;
            res = Math.max(res,prod1);
        }
        return res;}
    
}
