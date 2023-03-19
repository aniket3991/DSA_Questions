package easy;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            if(slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        ListNode listNode = new ListNode(5);
        listNode.next = listNode;
        System.out.println(linkedListCycle.hasCycle(listNode));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }
}