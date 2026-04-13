import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyRandomList {

    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node temp = head;

        // Step 1: Create copy nodes in between
        while(temp != null){
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        // Step 2: Assign random pointers
        temp = head;
        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        // Step 3: Separate the lists
        temp = head;
        Node dummy = new Node(0);
        Node copyTemp = dummy;

        while(temp != null){
            copyTemp.next = temp.next;
            temp.next = temp.next.next;

            copyTemp = copyTemp.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        copyRandomList solution = new copyRandomList();

        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.next = node2;
        node2.next = node3;

        // (optional) random pointers
        head.random = node3;
        node2.random = head;
        node3.random = node2;

        Node copiedHead = solution.copyRandomList(head);

        System.out.println("Original list:");
        printList(head);

        System.out.println("Copied list:");
        printList(copiedHead);
    }

    private static void printList(Node head) {
        Node current = head;
        while(current != null){
            int randomVal = (current.random != null) ? current.random.val : -1;
            System.out.print("[" + current.val + ", rand:" + randomVal + "] ");
            current = current.next;
        }
        System.out.println();
    }
}