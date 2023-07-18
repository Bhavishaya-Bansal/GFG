import java.util.*;

class AdjacentElementsToAnIndex{
    public static void main(String[] args) {
        int arr[][]= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<List<Integer>> list= new ArrayList<>();

        // Storing the 2d array in our 'list'
        for (int[] row : arr) {
            List<Integer> rowList = new ArrayList<>();
            for (int element : row) {
                rowList.add(element);
            }
            list.add(rowList);
        }
    
        // finding adjacents for index 1,1..
        List<Integer> answer = adjacents(list, 1, 1);
        
        for(int i=0; i< answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
    }

    // Method 1 of finding all the adjacents present for a articular index in our 2d Array
    /* First: transfer our array to list of list that is type of integer 
     * then check for the particular index if that is valid(means it does not gives us    indexOutOfBound ) if the index is correct then add it to the list 
     * returnthe final list
     */
    public static List<Integer> adjacents(List<List<Integer>> list, int i, int j){
        int n= list.size();
        int m= list.get(0).size();

        List<Integer> ans= new ArrayList<>();

        // Checking if all the indexes are valid or not.. If valid then add then to the ans list
        if(isValid(i-1, j-1, n, m)){
            ans.add(list.get(i-1).get(j-1));
        }

        if(isValid(i-1, j+1, n, m)){
            ans.add(list.get(i-1).get(j+1));
        }

        if(isValid(i-1, j, n, m)){
            ans.add(list.get(i-1).get(j));
        }

        if(isValid(i+1, j, n, m)){
            ans.add(list.get(i+1).get(j));
        }

        if(isValid(i+1, j-1, n, m)){
            ans.add(list.get(i+1).get(j-1));
        }

        if(isValid(i+1, j+1, n, m)){
            ans.add(list.get(i+1).get(j+1));
        }

        if(isValid(i, j-1, n, m)){
            ans.add(list.get(i).get(j-1));
        }

        if(isValid(i, j+1, n, m)){
            ans.add(list.get(i).get(j+1));
        }

        return ans;
    }

    // check if the index which we are at that is correct index or not 
    public static boolean isValid(int i, int j, int n, int m){
        if(i< 0 || j< 0 || i> n-1|| j> m-1){
            return false;
        }
        return true;
    }
}