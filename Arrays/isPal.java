public class isPal {
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        if(head==null || head.next==null)return true;
        Node mid=findmid(head);
        Node right=reverse(mid);
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }    
    static Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //this slow we will show the middle node of the linked list
    }
    static Node reverse(Node head){
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            Node afnode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=afnode;
        }
        head=prev;
        return head;
    }
}

