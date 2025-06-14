package LinkedList;
// Flatten a linked list where each node has a next pointer and a child pointer.

public class FlattenList {
    public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode flatten(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mergedhead = flatten(head.next);
        return merge(head,mergedhead);
    }

    public ListNode merge(ListNode first, ListNode second){
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (first != null && second != null) {
            if (first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        if (first != null) {
            tail.next = first;
        } else {
            tail.next = second;
        }
        return dummy.next;





    }
   
}