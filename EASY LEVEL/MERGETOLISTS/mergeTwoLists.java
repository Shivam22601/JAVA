import java.util.LinkedList;
 public class mergeTwoLists{
    class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){  
            this.val = val;
        }

        ListNode(int vak, ListNode next){
            this.val = val;
            this.next = next;
        }

    }
    public ListNode mergeTwoLists(ListNode L1, ListNode L2){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(L1 != null && L2 != null){
         if(L1.val < L2.val){
            tail.next = L1;
            L1 = L1.next;
         }
         else{
            tail.next = L2;
            L2 = L2.next;
         }
         tail = tail.next;
    }
    if(L1 != null){
        tail.next = L1;
    }
    else{
        tail.next = L1;
    }

    return dummy.next;
    }

    public static void main(String[] args) {
        mergeTwoLists solution = new mergeTwoLists();
        ListNode L1 = solution.new ListNode(1);
        L1.next = solution.new ListNode(2);
        L1.next.next = solution.new ListNode(4);

        ListNode L2 = solution.new ListNode(1);
        L2.next = solution.new ListNode(3);
        L2.next.next = solution.new ListNode(4);

        ListNode mergedList = solution.mergeTwoLists(L1, L2);
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
 }
