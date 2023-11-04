package com.problems.Trees;
import java.util.*;

// In level order successor we are finding the next node which will be present to the given node.. if there is no such node present we will return null.. (also if the given node is last node in some particular level then we will return first node of next level)
public class LevelOrderSuccesorOfNode {
    static class Node { 
        Node left, right; 
        int value; 
    }
    
    static Node newNode(int value) 
    { 
        Node temp = new Node(); 
        temp.left = null;
        temp.right = null; 
        temp.value = value; 
    
        return temp; 
    } 
    public static void main(String[] args) {
        // The tree is given like this: Draw the tree and it would be easy to understand the flow 
        Node root = newNode(20); 
        root.left = newNode(10); 
        root.left.left = newNode(4); 
        root.left.right = newNode(18); 
        root.right = newNode(26); 
        root.right.left = newNode(24); 
        root.right.right = newNode(27); 
        root.left.right.left = newNode(14); 
        root.left.right.left.left = newNode(13); 
        root.left.right.left.right = newNode(15); 
        root.left.right.right = newNode(19); 
    
        Node key = root.left.right.left.right; // node 24 
    
        Node res = levelOrderSucc(root, key); 
    
        if (res != null){
            System.out.println("LevelOrder successor of "+ key.value + " is " + res.value); 
        }
        else{
            System.out.println("LevelOrder successor of "+ key.value + " is NULL"); 
        }
    }

    public static Node levelOrderSucc(Node root, Node key){
        if(root== null){
            return null;
        }
        Queue<Node> queue= new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node currNode= queue.poll();

            if(currNode.left!= null){
                queue.offer(currNode.left);
            }
            if(currNode.right!= null){
                queue.offer(currNode.right);
            }
            if(currNode.value== key.value){
                Node ans= queue.poll();
                return ans;
            }
        }
        return null;
    }
}
