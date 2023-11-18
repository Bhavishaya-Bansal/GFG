import org.w3c.dom.Node;

public class RemoveLoop {
    public static void removeLoop(Node head){
        Node slow = head;
        Node fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                slow = head;
                if(slow!=fast){
                while(slow.next!=fast.next){
                    slow = slow.next;
                    fast = fast.next;
                }
                fast.next = null;
                return;
                } else {
                    while(fast.next != slow){
                        fast = fast.next;
                    }
                    fast.next = null;
                    return;
                }
            }
        }
    }   
}
