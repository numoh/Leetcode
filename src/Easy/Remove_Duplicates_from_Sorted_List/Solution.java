package Easy.Remove_Duplicates_from_Sorted_List;

public class Solution {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }
    }
    public static void main(String[] args) {
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2)))));
        System.out.println(deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))))));
        System.out.println(deleteDuplicates(new ListNode(1)));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode resListNode = new ListNode(0); // Dummy node
        ListNode current = resListNode;

        while (head != null) {
            if (head.next == null || head.val != head.next.val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }

        return resListNode.next; // Skip the dummy node
    }

}
