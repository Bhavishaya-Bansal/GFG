public class Diameter {
    // Function to return the diameter of a Binary Tree.
    int d = 0 ;
    int diameter(Node root) {
        // base case 
         helper(root);
         return d;
    
    }
    
    int helper(Node root){
             if(root == null){
            return 0;
        }
        
        // i am gonna use postorder traversal 
        int left = helper(root.left);
        int right = helper(root.right);
        
        int dia= left + right +1  ; 
        d = Math.max(d , dia);
        
        return Math.max(left,right)+1 ;
    }
}