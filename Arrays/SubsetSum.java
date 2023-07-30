import java.util.*;

// Here we are all the possible sums of the subsets possible of the given array list 
public class SubsetSum {
    public static void main(String[] args) {
        // This is how we declare an arraylist with already having items in it
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(2, 3));
        int n= arr.size();
        ArrayList<Integer> ans= subsetSums(arr, n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans= new ArrayList<Integer>();
        helper(arr, n, 0, 0, ans);
        Collections.sort(ans);
        return ans;
    }
    
    public static void helper(ArrayList<Integer> arr, int n, int sum, int i, ArrayList<Integer> ans){
        if(i== n){
            ans.add(sum);
            return ;
        }
        
        helper(arr, n, sum+ arr.get(i), i+1, ans);
        helper(arr, n, sum, i+1, ans);
    }
}
