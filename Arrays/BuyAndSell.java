public class BuyAndSell {
//Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        
        ArrayList<ArrayList<Integer>> ars=new ArrayList<ArrayList<Integer>>();
       
       int i=0;
       int first=0;
       int last=0;
       
       while(i<n){
           
           //For Finding the local minima
           while((i<n-1) && A[i]>=A[i+1]){
               i++;
           }
           
           if(i==n-1){
               break;
           }
           
           first=i++;
           
           //For Finding the Local Maxima
           while((i<n) && A[i]>A[i-1]){
               i++;
           }
           
           last=i-1;
           
           ars.add(new ArrayList<Integer>(Arrays.asList(first,last)));
       }
        
        return ars;
    }
}


