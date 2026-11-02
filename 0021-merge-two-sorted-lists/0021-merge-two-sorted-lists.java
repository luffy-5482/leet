/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy head to serve as the anchor for the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Pointer 1 traverses list1, Pointer 2 traverses list2
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next; // Advance pointer 1
            } else {
                tail.next = list2;
                list2 = list2.next; // Advance pointer 2
            }
            tail = tail.next; // Advance the merged list pointer
        }

        // Attach whichever list has remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
    }
}