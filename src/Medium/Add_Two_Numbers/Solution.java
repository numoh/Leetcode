package Medium.Add_Two_Numbers;

// 2
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
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(l1, l2));

        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);
        System.out.println(addTwoNumbers(l3, l4));

        ListNode l5 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        System.out.println(addTwoNumbers(l5, l6));

        ListNode l7 = new ListNode(3, new ListNode(7));
        ListNode l8 = new ListNode(9, new ListNode(2));

        System.out.println(addTwoNumbers(l7, l8));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNodeRes = null;
        int reminder = 0, sum = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                sum = (l1.val + l2.val) % 10;
            } else if (l1 != null) {
                sum = (l1.val) % 10;
            } else {
                sum = (l2.val) % 10;
            }
            if (listNodeRes == null) {
                listNodeRes = new ListNode(sum + reminder);
            } else {
                ListNode current = listNodeRes;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode((sum + reminder) % 10);
            }
            if (l1 != null && l2 != null) reminder = (l1.val + l2.val + reminder) / 10;
            else if (l1 != null) reminder = (l1.val + reminder) / 10;
            else reminder = (l2.val + reminder) / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (reminder == 1) {
            ListNode current = listNodeRes;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(reminder);
        }

        return listNodeRes;
    }
}
