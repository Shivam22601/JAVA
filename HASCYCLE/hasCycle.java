import java.util.LinkedList;
public class hasCycle{

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && slow != null){
            slow = slow.next;
            if(fast.next != null){
                fast = fast.next.next;
            }
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new hasCycle().new ListNode(1);
        ListNode second = new hasCycle().new ListNode(2);
        ListNode third = new hasCycle().new ListNode(3);
        ListNode fourth = new hasCycle().new ListNode(4);
        ListNode fifth = new hasCycle().new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = second;
        System.out.println(new hasCycle().hasCycle(head));
    }
}