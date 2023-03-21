package easy;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            stack.add(temp.val);
            temp = temp.next;
        }
        while (head != null){
            if(head.val != stack.pop()) return false;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        System.out.println(palindromeLinkedList.isPalindrome(head));
    }
}

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

